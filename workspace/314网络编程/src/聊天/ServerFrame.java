package 聊天;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class ServerFrame extends JFrame
{
	ServerSocket sSocket;
	final static int PORT = 8888;
	JTextArea show;
	JLabel ti;
	LinkedList<Socket> clientSockets = new LinkedList<>();

	ServerFrame()
	{

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(90, 20, 680, 710);
		JPanel p = new JPanel();
		p.setLayout(null);

		JLabel label = new JLabel("服务器端聊天页面");
		label.setBounds(250, 10, 400, 60);
		p.add(label);

		// 输入框和输出框
		show = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(show, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(20, 60, 400, 400);
		JTextField in = new JTextField();
		in.setBounds(20, 550, 400, 80);
		p.add(scrollPane);
		p.add(in);
		this.add(p);

		// 发送按钮
		JButton but = new JButton("发送");
		but.setBounds(480, 550, 100, 80);
		p.add(but);

		ti = new JLabel();
		ti.setBounds(500, 20, 140, 100);
		p.add(ti);
		//

		but.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				for (Socket s : clientSockets)
				{
					OutputStream out;
					try
					{
						out = s.getOutputStream();
						out.write(in.getText().getBytes());
					} catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		statrServer();
	}

	private void showtext(String s)
	{
		show.setText(show.getText() + "\r\n" + s);
	}

	private void statrServer()
	{
		// TODO Auto-generated method stub
		// 第一步，创建服务端口
		// 第二步，新开一个线程用来监听端口是否被连接 开端口就是Socket cSocket = sSocket.accept();
		// 可在每一步执行前，输出提示语句
		try
		{
			sSocket = new ServerSocket(PORT);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			showtext("端口被占用");
		}

		showtext("服务器开启监听" + PORT + "端口，等待连接");

		// 第二步
		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				// TODO Auto-generated method stub

				while (true)
				{
					try
					{
						Socket cSocket = sSocket.accept();
						ti.setText("连接成功");
						showtext("客户端ip地址" + cSocket.getInetAddress());
						showtext("客户端端口" + cSocket.getPort());

						// 将客户端Socket放入容器，为了多客户端运行，让所有客户端能共享聊天内容
						clientSockets.add(cSocket);

						// 此处新开一个线程时刻去读输入流
						new Thread(new Runnable()
						{

							@Override
							public void run()
							{
								// TODO Auto-generated method stub
								InputStream input;
								try
								{
									input = cSocket.getInputStream();
									int len = 0;
									byte[] buf = new byte[1024];
									while (len >= 0)
									{
										len = input.read(buf);
										String str = new String(buf, 0, len);
										showtext("客户端：" + str);
									}
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}).start();
						;

					} catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

	}
}
