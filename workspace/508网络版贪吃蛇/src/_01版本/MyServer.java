package _01版本;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Timer;

public class MyServer extends JFrame
{
	static final int N = 16;
	static final int gridwidth = 35;
	LinkedList<JPanel> grids = new LinkedList<>();
	static JPanel p = new JPanel();
	Snake s = new Snake();
	LinkedList<Point> forfood = new LinkedList<>();
	static Point food;
	char diraction;
	JButton but = new JButton();
	JLabel text = new JLabel();

	static final int PORT = 8888;
	ServerSocket serverS;
	Socket clientS;
	LinkedList<Point> du = new LinkedList<>();

	MyServer()
	{
		this.setTitle("服务器端");
//		createGrid();
		food = new Point(5,9);
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
		startServer();
	}

	public void showtext(String s)
	{
		text.setText(text.getText()+"\r\n"+s);
	}

	public void startServer()
	{
		// 第一步，创建socket端口
		try
		{
			serverS = new ServerSocket(PORT);
			showtext("等待连接");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			showtext("端口被占用");
		}
		// 第二步，开启服务器，等待连接
		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				while (true)
				{
					// TODO Auto-generated method stub
					try
					{
						clientS = serverS.accept();
						showtext("连接客户端成功" + "\r\n");
					} catch (IOException e)
					{
						// TODO Auto-generated catch block
						showtext("连接客户端失败" + "\r\n");
					}
					// 开线程读输入输出流
					new Thread(new Runnable()
					{

						@Override
						public void run()
						{
							// TODO Auto-generated method stub
							ObjectInputStream in;
							ObjectOutputStream out;
							
//							while (true)
//							{
								try
								{
//									in = clientS.getInputStream();
									//这里卡主，
									showtext("s1");
									in = new ObjectInputStream(clientS.getInputStream());
									showtext("s2");
									//方法3
//									int len = 0;
//									while(true)
//									{
//										byte[] buf = new byte[1024];
//										len = oin.read(buf);
//										du = buf
//										
//									}
									
									//方法1
//									du = (LinkedList<Point>) oin.readObject();Socket不能穿List，
									
									//方法2
//									
										du.add((Point) in.readObject());
//									
									
									
									
									
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
									showtext("服务器读入错误1");
								} catch (ClassNotFoundException e)
								{
									// TODO Auto-generated catch block
									showtext("服务器读入错误2");
								}
								try
								{
									
//									out = clientS.getOutputStream();
									out = new ObjectOutputStream(clientS.getOutputStream());
									//方法2
									for(Point pp:s.body)
									{
										out.writeObject(pp);
									}
									
									
									//方法1
//									oout.writeObject(s.body);
									
									
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
									showtext("客户端断开连接");
								}
								for (Point pp : du)
								{
									System.out.println(pp);
								}
								showSnake();
								
							}
//						}
					}).start();
					;
				}
			}
		}).start();
		;

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

//	public void createGrid()
//	{
//		for (int i = 0; i < N; i++)
//		{
//			for (int j = 0; j < N; j++)
//			{
//				JPanel newp = new JPanel();
//				newp.setBackground(Color.LIGHT_GRAY);
//				newp.setBounds(j * (gridwidth + 2) + 2, i * (gridwidth + 2) + 2, gridwidth, gridwidth);
//				p.add(newp);
//				grids.add(newp);
//				forfood.add(new Point(i, j));
//			}
//		}
//	}

	void showSnake()
	{
		// 所有格子先变灰色
		for (JPanel p : grids)
		{
			p.setBackground(Color.LIGHT_GRAY);
		}
		// 服务器端的蛇
		for (Point po : s.body)
		{
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.RED);
			p.add(newp);
		}
		// 客户端的蛇
		for (Point po : du)
		{
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.green);
			p.add(newp);
		}

		JPanel fp = grids.get(food.x + food.y * N);
		fp.setBackground(Color.BLACK);
		p.add(fp);
	}

//	void createFood()
//	{
//		forfood.removeAll(s.body);
//		MyServer.food = forfood.get((int) (Math.random() * forfood.size()));
////		System.out.println(MyServer.food.x+","+MyServer.food.y);
//	}

	// 蛇
	class Snake
	{
		LinkedList<Point> body = new LinkedList<>();
		Point nextp = new Point();

		Snake()
		{
			body.addFirst(new Point(0, 0));
			body.addFirst(new Point(1, 0));
			body.addFirst(new Point(2, 0));
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
//		private MyServer getOuterType()
//		{
//			return MyServer.this;
//		}

//	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyServer f = new MyServer();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20, 20, 1000, 631);
		
	}

}
