package _03����;
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
		JButton b1 = new JButton("���o1");
		JButton b2 = new JButton("���o2");
		JButton b3 = new JButton("���o3");
		JButton b4 = new JButton("���o4");
		JButton b5 = new JButton("���o5");
		JButton b6 = new JButton("���o6");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. ����һ������
		BoxLayoutFrame f = new BoxLayoutFrame();
		// 2. ���óɿɼ�
		f.setVisible(true);
		// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. �趨������ʼ���꼰��С
//		f.setLocation(400,200);
//		f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);// ͬʱ������ʼ����ʹ�С
	}

}
