package ����;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;



public class server
{
	static final int PORT = 8888;
	static ServerSocket serverS;
	static Socket clientS;
	static LinkedList<Point> du = new LinkedList<>();
	static LinkedList<Point> s ;//= new LinkedList<>();
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		creatp();
		startServer();
		
	}
	public static void creatp()
	{
		LinkedList<Point> l = new LinkedList<>();
		l.add(new Point(10,1));
		l.add(new Point(11,21));
		l.add(new Point(20,13));
		l = s;
	}
	public static void startServer()
	{
		// ��һ��������socket�˿�
		try
		{
			serverS = new ServerSocket(PORT);
			System.out.println("�ȴ�����");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			System.out.println("�˿ڱ�ռ��");
		}
		// �ڶ������������������ȴ�����
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
						System.out.println("���ӳɹ�");

					} catch (IOException e)
					{
						// TODO Auto-generated catch block
					}
					// ���̶߳����������
					new Thread(new Runnable()
					{

						@Override
						public void run()
						{
							// TODO Auto-generated method stub
							InputStream in;
							OutputStream out;
							
//							while (true)
//							{
								try
								{
									System.out.println("s1");
									in = clientS.getInputStream();
									ObjectInputStream oin = new ObjectInputStream(in);
									du = (LinkedList<Point>) oin.readObject();
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
								} catch (ClassNotFoundException e)
								{
									// TODO Auto-generated catch block
								}
								try
								{
									out = clientS.getOutputStream();
									ObjectOutputStream oout = new ObjectOutputStream(out);
									oout.writeObject(s);
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
								}
								for (Point pp : du)
								{
									System.out.println(pp);
								}
								
							}
//						}
					}).start();
					;
				}
			}
		}).start();
		;

	}
}
