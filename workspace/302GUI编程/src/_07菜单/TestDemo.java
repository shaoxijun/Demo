package _07�˵�;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestDemo extends JFrame
{

	TestDemo()
	{
		// 1. �����˵���
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);

		// 2. �������˵���
		JMenu m1 = new JMenu("�ļ�");
		JMenu m2 = new JMenu("�༭");
		JMenu m3 = new JMenu("����");
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);

		// 3. �����Ӳ˵���
		JMenuItem m1Item1 = new JMenuItem("�½�", new ImageIcon("logo.gif"));
		JMenuItem m1Item2 = new JMenuItem("����", new ImageIcon("logo.gif"));
		JMenuItem m1Item3 = new JMenuItem("�˳�", new ImageIcon("logo.gif"));

		m1.add(m1Item1);
		m1.add(m1Item2);
		m1.add(m1Item3);

		m1Item1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "�½��ļ�");
			}
		});

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. ����һ������
		TestDemo f = new TestDemo();
		// 2. ���óɿɼ�
		f.setVisible(true);
		// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. �趨������ʼ���꼰��С
		// f.setLocation(400,200);
		// f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);
	}

}