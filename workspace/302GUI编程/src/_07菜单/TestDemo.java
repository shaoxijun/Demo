package _07菜单;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestDemo extends JFrame
{

	TestDemo()
	{
		// 1. 创建菜单栏
		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);

		// 2. 创建主菜单项
		JMenu m1 = new JMenu("文件");
		JMenu m2 = new JMenu("编辑");
		JMenu m3 = new JMenu("帮助");
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);

		// 3. 创建子菜单项
		JMenuItem m1Item1 = new JMenuItem("新建", new ImageIcon("logo.gif"));
		JMenuItem m1Item2 = new JMenuItem("保存", new ImageIcon("logo.gif"));
		JMenuItem m1Item3 = new JMenuItem("退出", new ImageIcon("logo.gif"));

		m1.add(m1Item1);
		m1.add(m1Item2);
		m1.add(m1Item3);

		m1Item1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "新建文件");
			}
		});

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. 创建一个窗体
		TestDemo f = new TestDemo();
		// 2. 设置成可见
		f.setVisible(true);
		// 3. 窗体关闭的时候，程序也关闭
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. 设定窗体起始坐标及大小
		// f.setLocation(400,200);
		// f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);
	}

}