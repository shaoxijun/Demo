package _03版本;

import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.xml.crypto.Data;

public class MyClient extends JFrame
{
	static final int N = 16;
	static final int gridwidth = 35;
	char diraction;
	JLabel text = new JLabel();
	JPanel p = new JPanel();
	Point food = new Point();
	Snake s = new Snake();
	static final int PORT = 8888;
	static final String HOST = "127.0.0.1";
	Socket clientS;
	ServerSocket serverS;
	boolean isEat = false;
	LinkedList<JPanel> grids = new LinkedList<>();
	LinkedList<Point> forfood = new LinkedList<>();
	LinkedList<Point> du = new LinkedList<>();

	MyClient()
	{
		s.body.add(new Point(13, 15));
		s.body.add(new Point(14, 15));
		s.body.add(new Point(15, 15));
		this.setTitle("客户端");
		createGrid();
//		createFood();
//		food = new Point(5, 9);
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
		System.out.println();
		gogo();
		connectToServer();
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
					ObjectInputStream in = null;
					ObjectOutputStream out = null;
					while (true)
					{
						try
						{
							// 从服务器读取数据
							in = new ObjectInputStream(clientS.getInputStream());
							du = (LinkedList<Point>) in.readObject();
							//从服务器读取食物
							food = (Point) in.readObject();
							// 传送自己的数据给服务器
							out = new ObjectOutputStream(clientS.getOutputStream());
							out.writeObject(s.body);
						} catch (IOException e)
						{
							showtext("服务器断开连接");
							break;
						} catch (ClassNotFoundException e)
						{
							showtext("没有发现目标流");
							break;
						}
//						finally
//						{
//							try
//							{
//								in.close();
//								out.close();
//							} catch (IOException e)
//							{
//								// TODO Auto-generated catch block
//								showtext("出大问题了");
//							}
//						}
						showSnake();
					}
				}
			}).start();

		} catch (IOException e)
		{
			showtext("连接服务器失败,服务器可能没有正常启动");
		}
	}

	public void showtext(String s)
	{
		text.setText(text.getText()+s + "\r\n");
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
							Point p = s.move(diraction);
							if (!s.isOver())
							{
								if (!p.equals(food))
								{
									s.body.addFirst(p);
									s.body.removeLast();
								} else
								{
									s.body.addFirst(p);
									isEat = true;
								}
							} else
							{
								showtext("YOU LOSE !");
							}
							showSnake();
						}
					}
				}, 500, 500);
			}
		}).start();
	}

	void createFood()
	{
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				DataOutputStream out = null;
				try
				{
					out = new DataOutputStream(clientS.getOutputStream());
					out.writeBoolean(isEat);
//					in.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					showtext("接收食物失败");
				}
				
			}
		}).start();;
	}

	void showSnake()
	{
		// 所有格子先变灰色
		Iterator<JPanel> it1 = grids.iterator();
		while(it1.hasNext())
		{
			JPanel p = it1.next();
			p.setBackground(Color.LIGHT_GRAY);
		}
//		for (JPanel p : grids)
//		{
//			p.setBackground(Color.LIGHT_GRAY);
//		}
		// 客户端的蛇(本端)
		Iterator<Point> it3 = s.body.iterator();
		while(it3.hasNext())
		{
			Point po = it3.next();
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.green);
			p.add(newp);
		}
		
//		for (Point po : s.body)
//		{
//			JPanel newp = grids.get(po.x + po.y * N);
//			newp.setBackground(Color.green);
//			p.add(newp);
//		}
		// 服务器端的蛇
		Iterator<Point> it2 = du.iterator();
		while(it2.hasNext())
		{
			Point po = it2.next();
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.RED);
			p.add(newp);
		}
		
//		for (Point po : du)
//		{
//			JPanel newp = grids.get(po.x + po.y * N);
//			newp.setBackground(Color.red);
//			p.add(newp);
//		}

		// 显示食物
		JPanel fp = grids.get(food.x + food.y * N);
		fp.setBackground(Color.BLACK);
		p.add(fp);
	}

	public void createGrid()
	{
		for (int i = 0; i < MyServer.N; i++)
		{
			for (int j = 0; j < MyServer.N; j++)
			{
				JPanel newp = new JPanel();
				newp.setBackground(Color.LIGHT_GRAY);
				newp.setBounds(j * (MyServer.gridwidth + 2) + 2, i * (MyServer.gridwidth + 2) + 2, MyServer.gridwidth,
						MyServer.gridwidth);
				p.add(newp);
				grids.add(newp);
				forfood.add(new Point(i, j));
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyClient f = new MyClient();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20, 20, 1000, 631);
	}
}
