package _03布局;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BoxLayoutFrame extends JFrame
{

	public BoxLayoutFrame()
	{
		JPanel p = new JPanel();
		p.setBackground(new Color(255,210,200));
		BoxLayout l = new BoxLayout(p,BoxLayout.Y_AXIS);
		p.setLayout(l);
		this.add(p);
		JButton b1 = new JButton("按鈕1");
		JButton b2 = new JButton("按鈕2");
		JButton b3 = new JButton("按鈕3");
		JButton b4 = new JButton("按鈕4");
		JButton b5 = new JButton("按鈕5");
		JButton b6 = new JButton("按鈕6");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. 创建一个窗体
		BoxLayoutFrame f = new BoxLayoutFrame();
		// 2. 设置成可见
		f.setVisible(true);
		// 3. 窗体关闭的时候，程序也关闭
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. 设定窗体起始坐标及大小
//		f.setLocation(400,200);
//		f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);// 同时设置起始坐标和大小
	}

}
