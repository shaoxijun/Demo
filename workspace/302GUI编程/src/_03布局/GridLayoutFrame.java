package _03����;
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
		// 1. ����һ������
				GridLayoutFrame f = new GridLayoutFrame();
				// 2. ���óɿɼ�
				f.setVisible(true);
				// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// 4. �趨������ʼ���꼰��С
//				f.setLocation(400,200);
//				f.setSize(500, 400);
				f.setBounds(300, 250, 500, 400);// ͬʱ������ʼ����ʹ�С
	}

}
