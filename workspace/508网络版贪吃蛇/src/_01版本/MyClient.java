package _01版本;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Timer;

public class MyClient extends JFrame
{
	static final int N = 16;
	static final int gridwidth = 35;
	LinkedList<JPanel> grids = new LinkedList<>();
	JPanel p = new JPanel();
	Snake s = new Snake();
	LinkedList<Point> forfood = new LinkedList<>();
	Point food ;
	char diraction;
	JButton but = new JButton();
	JLabel text = new JLabel();

	LinkedList<Point> du = new LinkedList<>();
	static final int PORT = 8888;
	static final String HOST = "127.0.0.1";
	Socket clientS;
	ServerSocket serverS;

	MyClient()
	{
//		food = new Point(MyServer.food.x,MyServer.food.y);
		food = new Point(5,9);
		this.setTitle("客户端");
		createGrid();
//		createFood();
		p.setLayout(null);
		p.setBounds(0, 0, 500, 500);
		this.add(p);
		JScrollPane scrollPane = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(650, 50, 300, 400);
		p.add(scrollPane);
		showSnake();
		this.addKeyListener(new KeyListener()
		{

			@Override
			public void keyTyped(KeyEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e)
			{
				// TODO Auto-generated method stub
				new Thread(new Runnable()
				{

					@Override
					public void run()
					{
						// TODO Auto-generated method stub
						switch (e.getKeyCode()) {
						case KeyEvent.VK_LEFT:
							diraction = 'a';
							break;
						case KeyEvent.VK_RIGHT:
							diraction = 'd';
							break;
						case KeyEvent.VK_UP:
							diraction = 'w';
							break;
						case KeyEvent.VK_DOWN:
							diraction = 's';
							break;
						}
					}
				}).start();
				;
			}
		});
		gogo();
		connectToServer();
	}

	public void showtext(String s)
	{
		text.setText(s+"\r\n");
	}

	public void connectToServer()
	{
		// TODO Auto-generated method stub
		// 第一步，开Socket,
		try
		{
			clientS = new Socket(HOST, PORT);
			showtext("连接服务器成功");
			// 第二步，新开一个线程读输入输出流
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					ObjectInputStream in;
					ObjectOutputStream out;
					
//					while (true)
//					{
						try
						{
							showtext("c1");
							//这里卡主，
							in = new ObjectInputStream(clientS.getInputStream());
//							out = new ObjectOutputStream(clientS.getOutputStream());
							showtext("c2");
//							du = (LinkedList<Point>) oin.readObject();
							
//							out.writeObject(new Point(1,1));
							//方法2
//							for(int i=0;i<3;i++)
//							{
								du.add((Point) in.readObject());
//							}
							
						} catch (IOException e)
						{
							showtext("客户端读取错误");
						} 
						catch (ClassNotFoundException e)
						{
							showtext("没有发现目标流");
						}

						try
						{
							out = new ObjectOutputStream(clientS.getOutputStream());
							
							//方法2
							for(Point pp:s.body)
							{
								out.writeObject(pp);
							}
							
//							方法1
							
//							oout.writeObject(s.body);
							
							
							
						} catch (IOException e)
						{
							// TODO Auto-generated catch block
							showtext("服务器断开连接");
						}
						showSnake();
						
					}
//				}
			}).start();

		} catch (IOException e)
		{
			showtext("连接服务器失败,服务器可能没有正常启动");
		}
	}

	public void gogo()
	{
		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				Timer t = new Timer();
				t.schedule(new TimerTask()
				{

					@Override
					public void run()
					{
						// TODO Auto-generated method stub

						if (diraction == 'a' || diraction == 'w' || diraction == 's' || diraction == 'd')
						{
							s.move(diraction);
							showSnake();
						}

					}
				}, 500, 500);
			}
		}).start();
	}

	public void createGrid()
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				JPanel newp = new JPanel();
				newp.setBackground(Color.LIGHT_GRAY);
				newp.setBounds(j * (gridwidth + 2) + 2, i * (gridwidth + 2) + 2, gridwidth, gridwidth);
				p.add(newp);
				grids.add(newp);
				forfood.add(new Point(i, j));
			}
		}
	}

	void showSnake()
	{
		// 所有格子先变灰色
		for (JPanel p : grids)
		{
			p.setBackground(Color.LIGHT_GRAY);
		}
		// 客户端的蛇(本端)
		for (Point po : s.body)
		{
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.green);
			p.add(newp);
		}
		// 服务器端的蛇
		for (Point po : du)
		{
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.RED);
			p.add(newp);
		}
//		System.out.println(MyServer.food.x+","+MyServer.food.y);
//		food = new Point(MyServer.food.x,MyServer.food.y);
		JPanel fp = grids.get(food.x + food.y * N);
		fp.setBackground(Color.BLACK);
		p.add(fp);
	}

	void createFood()
	{
		forfood.removeAll(s.body);
		food = forfood.get((int) (Math.random() * forfood.size()));
	}

	// 蛇
	class Snake
	{
		LinkedList<Point> body = new LinkedList<>();
		Point nextp = new Point();

		Snake()
		{
			body.addFirst(new Point(15, 15));
			body.addFirst(new Point(14, 15));
			body.addFirst(new Point(13, 15));
		}

		public void move(char c)
		{
			// TODO Auto-generated method stub
			Point head = s.body.getFirst();
			nextp = head.getNext(c);
			if (!s.isOver())
			{
				if (!nextp.equals(food))
				{
					s.body.addFirst(nextp);
					s.body.removeLast();
				} else
				{
					s.body.addFirst(nextp);
//					createFood();
				}
			} else
			{
				System.out.println("YOU LOSE !");
			}
		}

		public boolean isOver()
		{
			if (nextp.x < 0 || nextp.x >= N || nextp.y < 0 || nextp.y >= N || s.body.contains(nextp))
			{
				return true;
			} else
			{
				return false;
			}

		}
	}

	// 点
//	class Point implements Serializable
//	{
//		int x, y;
//
//		public Point(int x, int y)
//		{
//			super();
//			this.x = x;
//			this.y = y;
//		}
//
//		public Point()
//		{
//			super();
//			// TODO Auto-generated constructor stub
//		}
//
//		@Override
//		public int hashCode()
//		{
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + getOuterType().hashCode();
//			result = prime * result + x;
//			result = prime * result + y;
//			return result;
//		}
//
//		@Override
//		public boolean equals(Object obj)
//		{
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Point other = (Point) obj;
//			if (!getOuterType().equals(other.getOuterType()))
//				return false;
//			if (x != other.x)
//				return false;
//			if (y != other.y)
//				return false;
//			return true;
//		}
//
//		public Point getNext(char c)
//		{
//			// TODO Auto-generated method stub
//			Point p = new Point();
//			switch (c) {
//			case 'w':
//				p = new Point(this.x, this.y - 1);
//				break;
//			case 's':
//				p = new Point(this.x, this.y + 1);
//				break;
//			case 'a':
//				p = new Point(this.x - 1, this.y);
//				break;
//			case 'd':
//				p = new Point(this.x + 1, this.y);
//				break;
//			}
//
//			return p;
//		}
//
//		private MyClient getOuterType()
//		{
//			return MyClient.this;
//		}
//
//	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyClient f = new MyClient();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20, 20, 1000, 631);
	}

}
