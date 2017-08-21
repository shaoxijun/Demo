package _1_0版本;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameFrame extends JFrame
{
	GameFrame()
	{
	
		GamePanel myPanel = new GamePanel();
		myPanel.setLayout(null);
		
	
		this.add(myPanel);	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. 创建一个窗体
		GameFrame f = new GameFrame();
		// 2. 设置成可见
		f.setVisible(true);
		// 3. 窗体关闭的时候，程序也关闭
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. 设定窗体起始坐标及大小
		// f.setLocation(400,200);
		// f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);// 同时设置起始坐标和大小
		
	}

}
