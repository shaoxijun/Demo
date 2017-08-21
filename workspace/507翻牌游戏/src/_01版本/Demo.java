package _01版本;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Demo extends JFrame
{

	Demo()
	{
		MyPanel p = new MyPanel();
		p.setLayout(null);
		this.add(p);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Demo f = new Demo();
		// 2. 设置成可见
		f.setVisible(true);
		// 3. 窗体关闭的时候，程序也关闭
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. 设定窗体起始坐标及大小
		f.setBounds(100, 0, 730, 730);
	}

}
