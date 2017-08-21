package 测试;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;



public class client
{
	static LinkedList<Point> du = new LinkedList<>();
	static LinkedList<Point> s ;
	static final int PORT = 8888;
	static final String HOST = "127.0.0.1";
	static Socket clientS;
	ServerSocket serverS;
	public static void main(String[] args)
	{
		creatp();
		connectToServer();
	}
	public static void creatp()
	{
		LinkedList<Point> l = new LinkedList<>();
		l.add(new Point(10,1));
		l.add(new Point(11,21));
		l.add(new Point(20,13));
		l = s;
	}
	public static void connectToServer()
	{
		// TODO Auto-generated method stub
		// 第一步，开Socket,
		try
		{
			clientS = new Socket(HOST, PORT);
			System.out.println("连接成功");
			// 第二步，新开一个线程读输入输出流
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					InputStream in;
					OutputStream out;
					
//					while (true)
//					{
						try
						{
							System.out.println("c1");
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
//				}
			}).start();

		} catch (IOException e)
		{
		}
	}
}
