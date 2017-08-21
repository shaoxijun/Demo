package ����;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientFrame extends JFrame
{
	
	final static String HOST = "127.0.0.1";
	final static int PORT = 8888;
	JTextArea show;
	JTextField toin;
	Socket cSocket;
	
	ClientFrame()
	{
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(90,20, 650, 700);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JLabel label = new JLabel("�ͻ�������ҳ��");
		label.setBounds(250, 10, 400, 60);
		p.add(label);
		
		show = new JTextArea();
		show.setBounds(20,60,400,400);
		toin = new JTextField();
		toin .setBounds(20, 550, 400, 80);
		
		p.add(show);
		p.add(toin);
		this.add(p);
		
		JLabel ti = new JLabel();
		ti.setBounds(500,20,140,100);
		p.add(ti);
		
		JButton but = new JButton("����");
		but.setBounds(480, 550, 100, 80);
		p.add(but);
		
		but.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				try
				{
					OutputStream out = cSocket.getOutputStream();
					out.write(toin.getText().getBytes());
				} catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		connectToServer();
	}
	
	private void connectToServer()
	{
		// TODO Auto-generated method stub
		//��һ������Socket,
		//�ڶ������¿�һ���߳�ȥʱ�̶�ȡ������
		try
		{
			cSocket = new Socket(HOST, PORT);

			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					InputStream in;
					try
					{
						in = cSocket.getInputStream();
						int len = 0;
						while (len >= 0)
						{
							// 2.1 ��ȡ������������Ϣ
							byte[] buf = new byte[1024];
							len = in.read(buf);
							String str = new String(buf, 0, len);
							showtext(str);
							toin.setText(" ");

						}
					} catch (IOException e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}).start();

		} catch (IOException e)
		{
			showtext("���ӷ�����ʧ��,����������û����������");
		}
	}

	private void showtext(String s)
	{
		show.setText(show.getText()+"\r\n"+s);
	}
	
	
}
