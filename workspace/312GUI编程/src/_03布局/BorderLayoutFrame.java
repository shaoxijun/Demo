package _03布局;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutFrame extends JFrame
{

	public BorderLayoutFrame()
	{
		JButton b1 = new JButton("按鈕1");
		JButton b2 = new JButton("按鈕2");
		JButton b3 = new JButton("按鈕3");
		JButton b4 = new JButton("按鈕4");
		JButton b5 = new JButton("按鈕5");
		JButton b6 = new JButton("按鈕6");
		this.add(b1,BorderLayout.CENTER);
		this.add(b2,BorderLayout.EAST);
		this.add(b3,BorderLayout.SOUTH);
		this.add(b4,BorderLayout.WEST);
		this.add(b5,BorderLayout.NORTH);
		
		
	}
	public static void main(String[] args)
	{
		// 1. 创建一个窗体
		BorderLayoutFrame f = new BorderLayoutFrame();
		// 2. 设置成可见
		f.setVisible(true);
		// 3. 窗体关闭的时候，程序也关闭
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. 设定窗体起始坐标及大小
		// f.setLocation(400,200);
		// f.setSize(500, 400);大小
		f.setBounds(300, 250, 500, 400);// 同时设置起始坐标和	
	}

}
