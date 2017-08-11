package _01版本;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class NoteBook extends JFrame
{
	NoteBook()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		JTextArea t = new JTextArea();
		t.setBounds(0,0,500,400);
		t.setRows(30);//行高
		t.setColumns(20);//列宽
//		JScrollPane scrollPane = new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(0,0,480,335);
		p.add(scrollPane);
		//1.创建菜单栏
		JMenuBar mb = new JMenuBar();
		this.setJMenuBar(mb);
		//2.创建主菜单项
		JMenu m1 = new JMenu("文件");
		mb.add(m1);
		JMenuItem m1Item1 = new JMenuItem("新建", new ImageIcon("logo.gif"));
		m1Item1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				NoteBook f = new NoteBook();
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setBounds(100,150,500,400);
				
			}
		});
		
		JMenuItem m1Item2 = new JMenuItem("打开", new ImageIcon("logo.gif"));
		m1Item2.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem m1Item3 = new JMenuItem("保存", new ImageIcon("logo.gif"));
		m1Item3.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem m1Item4 = new JMenuItem("另存为", new ImageIcon("logo.gif"));
		m1Item4.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem m1Item5 = new JMenuItem("退出", new ImageIcon("logo.gif"));
		m1Item5.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		m1.add(m1Item1);
		m1.add(m1Item2);
		m1.add(m1Item3);
		m1.add(m1Item4);
		m1.add(m1Item5);
		JMenu m2 = new JMenu("编辑");
		mb.add(m2);
		JMenuItem m2Item1 = new JMenuItem("新建", new ImageIcon("logo.gif"));
		JMenuItem m2Item2 = new JMenuItem("打开", new ImageIcon("logo.gif"));
		JMenuItem m2Item3 = new JMenuItem("保存", new ImageIcon("logo.gif"));
		JMenuItem m2Item4 = new JMenuItem("另存为", new ImageIcon("logo.gif"));
		JMenuItem m2Item5 = new JMenuItem("退出", new ImageIcon("logo.gif"));
		m2.add(m2Item1);
		m2.add(m2Item2);
		m2.add(m2Item3);
		m2.add(m2Item4);
		m2.add(m2Item5);
		JMenu m3 = new JMenu("格式");
		mb.add(m3);
		JMenuItem m3Item1 = new JMenuItem("新建", new ImageIcon("logo.gif"));
		JMenuItem m3Item2 = new JMenuItem("打开", new ImageIcon("logo.gif"));
		JMenuItem m3Item3 = new JMenuItem("保存", new ImageIcon("logo.gif"));
		JMenuItem m3Item4 = new JMenuItem("另存为", new ImageIcon("logo.gif"));
		JMenuItem m3Item5 = new JMenuItem("退出", new ImageIcon("logo.gif"));
		m3.add(m3Item1);
		m3.add(m3Item2);
		m3.add(m3Item3);
		m3.add(m3Item4);
		m3.add(m3Item5);
//		JMenu m4 = new JMenu("查看");
//		mb.add(m4);
//		JMenuItem m4Item1 = new JMenuItem("新建", new ImageIcon("logo.gif"));
//		JMenuItem m4Item2 = new JMenuItem("打开", new ImageIcon("logo.gif"));
//		JMenuItem m4Item3 = new JMenuItem("保存", new ImageIcon("logo.gif"));
//		JMenuItem m4Item4 = new JMenuItem("另存为", new ImageIcon("logo.gif"));
//		JMenuItem m4Item5 = new JMenuItem("退出", new ImageIcon("logo.gif"));
//		m1.add(m1Item1);
//		m1.add(m1Item2);
//		m1.add(m1Item3);
//		m1.add(m1Item4);
//		m1.add(m1Item5);
//		JMenu m5 = new JMenu("帮助");
//		mb.add(m5);
		//3.创建子菜单项
	
	
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 综合练习
		// 1. 仿照windows附件中的记事本 编写一个GUI文本编辑器
		// 提供:
		// 1. 新建
		// 2. 打开
		// 3. 保存
		// 4. 另存为
		// 5. 退出
		NoteBook f = new NoteBook();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,150,500,400);
	}

}
