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
		
	}	

	private void build()
	{
		// TODO Auto-generated method stub
		this.setTitle("·þÎñÆ÷¶Ë");
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
