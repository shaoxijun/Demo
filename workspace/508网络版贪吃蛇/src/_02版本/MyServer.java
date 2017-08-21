package _02版本;

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
	char diraction;
	JLabel text = new JLabel();
	JPanel p = new JPanel();
	Point food;
	Snake s = new Snake();
	Socket clientS;
	boolean isEat = false;
	static final int PORT = 8888;
	ServerSocket serverS;
	LinkedList<JPanel> grids = new LinkedList<>();
	LinkedList<Point> forfood = new LinkedList<>();
	LinkedList<Point> du = new LinkedList<>();

	MyServer()
	{
		s.body.addFirst(new Point(0, 0));
		s.body.addFirst(new Point(1, 0));
		s.body.addFirst(new Point(2, 0));
		this.setTitle("服务器端");
		createGrid();
		createFood();
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
		gogo();
		startServer();
	}

	public void startServer()
	{
		// 第一步，创建socket端口
		try
		{
			serverS = new ServerSocket(PORT);
			showtext("等待客户端连接");
		} catch (IOException e1)
		{
			// TODO Auto-generated catch block
			showtext("端口可能被占用");
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
							ObjectInputStream in = null;
							ObjectOutputStream out = null;

							while (true)
							{
								try
								{
									//发送蛇
									out = new ObjectOutputStream(clientS.getOutputStream());
									out.writeObject(s.body);
									//发送食物
									out.writeObject(food);
									//接收蛇
									in = new ObjectInputStream(clientS.getInputStream());
									du = (LinkedList<Point>) in.readObject();
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
									showtext("服务器读入错误或客户端断开连接");
									break;
								} catch (ClassNotFoundException e)
								{
									// TODO Auto-generated catch block
									showtext("服务器读入错误2");
									break;
								}
//								finally
//								{
//									try
//									{
//										in.close();
//										out.close();
//									} catch (IOException e)
//									{
//										// TODO Auto-generated catch block
//										showtext("出大问题了");
//									}
//								}
								showSnake();
							}
						}
					}).start();
					;
				}
			}
		}).start();
		;

	}

	public void showtext(String s)
	{
		text.setText(s + "\r\n");
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
									createFood();
								}
							} else
							{
								showtext("YOU LOSE !");
							}
							new Thread(new Runnable()
							{
								
								@Override
								public void run()
								{
									// TODO Auto-generated method stub
									DataInputStream in = null;
									try
									{
										in = new DataInputStream(clientS.getInputStream());
										isEat = in.readBoolean();
									} catch (IOException e)
									{
										// TODO Auto-generated catch block
										showtext("食物收发错误");
									}
								}
							}).start();
							if(isEat)
							{
								createFood();
								isEat = false;
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
		forfood.removeAll(s.body);
		food = forfood.get((int) (Math.random() * forfood.size()));

		
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
		
		
		// 服务器端的蛇(本端)
		Iterator<Point> it2 = s.body.iterator();
		while(it2.hasNext())
		{
			Point po = it2.next();
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.RED);
			p.add(newp);
		}
		
//		for (Point po : s.body)
//		{
//			JPanel newp = grids.get(po.x + po.y * N);
//			newp.setBackground(Color.RED);
//			p.add(newp);
//		}
		
		// 客户端的蛇
		Iterator<Point> it3 = du.iterator();
		while(it3.hasNext())
		{
			Point po = it3.next();
			JPanel newp = grids.get(po.x + po.y * N);
			newp.setBackground(Color.green);
			p.add(newp);
		}
		
//		for (Point po : du)
//		{
//			JPanel newp = grids.get(po.x + po.y * N);
//			newp.setBackground(Color.green);
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
		MyServer f = new MyServer();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20, 20, 1000, 631);
	}

}
