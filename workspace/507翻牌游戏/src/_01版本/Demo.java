package _01�汾;
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
		// 2. ���óɿɼ�
		f.setVisible(true);
		// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. �趨������ʼ���꼰��С
		f.setBounds(100, 0, 730, 730);
	}

}
