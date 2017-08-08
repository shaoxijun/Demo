package _03布局;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutFrame extends JFrame
{

	public GridLayoutFrame()
	{
		JPanel p = new JPanel();
		GridLayout l = new GridLayout(10,10,1,1);
		p.setLayout(l);
		this.add(p);
		for(int i=0;i<100;i++)
		{
			JButton btn = new JButton();
			p.add(btn);	
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. 创建一个窗体
				GridLayoutFrame f = new GridLayoutFrame();
				// 2. 设置成可见
				f.setVisible(true);
				// 3. 窗体关闭的时候，程序也关闭
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// 4. 设定窗体起始坐标及大小
//				f.setLocation(400,200);
//				f.setSize(500, 400);
				f.setBounds(300, 250, 500, 400);// 同时设置起始坐标和大小
	}

}
