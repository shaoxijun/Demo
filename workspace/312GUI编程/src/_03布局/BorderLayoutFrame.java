package _03����;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutFrame extends JFrame
{

	public BorderLayoutFrame()
	{
		JButton b1 = new JButton("���o1");
		JButton b2 = new JButton("���o2");
		JButton b3 = new JButton("���o3");
		JButton b4 = new JButton("���o4");
		JButton b5 = new JButton("���o5");
		JButton b6 = new JButton("���o6");
		this.add(b1,BorderLayout.CENTER);
		this.add(b2,BorderLayout.EAST);
		this.add(b3,BorderLayout.SOUTH);
		this.add(b4,BorderLayout.WEST);
		this.add(b5,BorderLayout.NORTH);
		
		
	}
	public static void main(String[] args)
	{
		// 1. ����һ������
		BorderLayoutFrame f = new BorderLayoutFrame();
		// 2. ���óɿɼ�
		f.setVisible(true);
		// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. �趨������ʼ���꼰��С
		// f.setLocation(400,200);
		// f.setSize(500, 400);��С
		f.setBounds(300, 250, 500, 400);// ͬʱ������ʼ�����	
	}

}
