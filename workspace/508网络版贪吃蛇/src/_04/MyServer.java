package _04;
import java.awt.*;
import javax.swing.*;


import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class MyServer extends JFrame
{
	JPanel p = new JPanel();
	JTextArea text = new JTextArea();
	char diraction;
	ServerSocket ss = null;
	Socket cs = null;
	int PORT = 8888;
	
	public MyServer()
	{
		build();
		actionlistener();
	}
	public void showtext(String s)
	{
		text.setText(text.getText()+s+"\r\n");
	}
	private void actionlistener()
	{
		// TODO Auto-generated method stub
		try
		{
			ss = new ServerSocket(PORT);
			showtext("�ȴ��ͻ�������");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			showtext("�ͻ�������ʧ��");
		}
		while(true)
		{
			try
			{
				cs = ss.accept();
				showtext("�ͻ������ӳɹ�");
				showtext("IP��ַ"+cs.getInetAddress().getHostAddress()+"�˿ں�"+cs.getPort());
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
//				e.printStackTrace();
				showtext("�ͻ�������ʧ��");
			}
			Thread tt = new Thread(new serverThread(cs));
			tt.start();
		}
	}	
	
	private class serverThread implements Runnable
	{
		Socket cs = null;
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
				
		public serverThread(Socket cs)
		{
			// TODO Auto-generated constructor stub
			this.cs = cs;
		}

		@Override
		public void run()
		{
			// TODO Auto-generated method stub
			//����
			
			//����
			
		}
		
	}
	
	private void build()
	{
		// TODO Auto-generated method stub
		this.setTitle("��������");
		p.setLayout(null);
		p.setBounds(50, 30, 500, 500);
		this.add(p);
		JScrollPane scrollPane = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(5, 5, 300, 400);
		p.add(scrollPane);
	}

	public static void main(String[] args)
	{
		MyServer f = new MyServer();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(20, 20, 500, 600);
	}
}
