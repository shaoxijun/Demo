package ����������;

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

		JLabel label = new JLabel("������������ҳ��");
		label.setBounds(250, 10, 400, 60);
		p.add(label);

		// �����������
		show = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(show, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(20, 60, 400, 400);
		JTextField in = new JTextField();
		in.setBounds(20, 550, 400, 80);
		p.add(scrollPane);
		p.add(in);
		this.add(p);

		ti = new JLabel();
		ti.setBounds(500, 20, 140, 100);
		p.add(ti);

		statrServer();
	}

	private void showtext(String s)
	{
		show.setText(show.getText() + "\r\n" + s);
	}

	private void statrServer()
	{
		// TODO Auto-generated method stub
		// ��һ������������˿�
		// �ڶ������¿�һ���߳����������˿��Ƿ����� ���˿ھ���Socket cSocket = sSocket.accept();
		// ����ÿһ��ִ��ǰ�������ʾ���
		
		
		//��һ��
		try
		{
			sSocket = new ServerSocket(PORT);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			showtext("�˿ڱ�ռ��");
		}

		showtext("��������������" + PORT + "�˿ڣ��ȴ�����");

		// �ڶ���
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
						ti.setText("���ӳɹ�");
						showtext("�ͻ���ip��ַ" + cSocket.getInetAddress());
						showtext("�ͻ��˶˿�" + cSocket.getPort());

						// ���ͻ���Socket����������Ϊ�˶�ͻ������У������пͻ����ܹ�����������
						clientSockets.add(cSocket);

						// �˴��¿�һ���߳�ʱ��ȥ��������
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
									while(true)
									{
										byte[] buf = new byte[1024];
										len = input.read(buf);
										String str = new String(buf, 0, len);
										String ss = "�ͻ���"+cSocket.getInetAddress()+"("+cSocket.getPort()+"):" + str;
										showtext("�ͻ��ˣ�" + str);
										
										for(Socket s:clientSockets)
										{
											OutputStream o = cSocket.getOutputStream();
											o.write(ss.getBytes());
										}
									}
//									String strr ="a�ͻ���"+cSocket.getInetAddress()+"("+cSocket.getPort()+")�Ͽ���";
//									showtext(strr);
//									clientSockets.remove(cSocket);
								} catch (IOException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}).start();
						

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
