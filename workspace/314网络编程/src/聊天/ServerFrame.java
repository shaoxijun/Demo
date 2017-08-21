package ����;

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

		// ���Ͱ�ť
		JButton but = new JButton("����");
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
		// ��һ������������˿�
		// �ڶ������¿�һ���߳����������˿��Ƿ����� ���˿ھ���Socket cSocket = sSocket.accept();
		// ����ÿһ��ִ��ǰ�������ʾ���
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
									byte[] buf = new byte[1024];
									while (len >= 0)
									{
										len = input.read(buf);
										String str = new String(buf, 0, len);
										showtext("�ͻ��ˣ�" + str);
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
