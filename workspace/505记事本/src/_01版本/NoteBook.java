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
//		JTextField t = new JTextField();
//		t.setBounds(0,0,500,400);
//		t.setHorizontalAlignment(JTextField.LEFT);
		JTextField t = new JTextField();
		t.setBounds(0,0,500,400);
		t.setHorizontalAlignment(JTextField.LEFT);
//		t.setHorizontalAlignment(JTextField.TOP);
		p.add(t);
		//1.创建菜单栏
		JMenuBar mb = new JMenuBar();
		this.setJMenuBar(mb);
		//2.创建主菜单项
		JMenu m1 = new JMenu("新建");
		JMenu m2 = new JMenu("打开");
		JMenu m3 = new JMenu("保存");
		JMenu m4 = new JMenu("另存为");
		JMenu m5 = new JMenu("退出");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		//3.创建子菜单项
		m1.addMenuListener(new MenuListener()
		{
			
			@Override
			public void menuSelected(MenuEvent e)
			{
				// TODO Auto-generated method stub
//				System.out.println(1);
				
				NoteBook f = new NoteBook();
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setBounds(50+150,50+100,500,400);

			}
			
			@Override
			public void menuDeselected(MenuEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent e)
			{
				// TODO Auto-generated method stub
			}
		});
		
		m2.addMenuListener(new MenuListener()
		{
			
			@Override
			public void menuSelected(MenuEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuDeselected(MenuEvent e)
			{
				// TODO Auto-generated method stub
			}
			
			@Override
			public void menuCanceled(MenuEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		m3.addMenuListener(new MenuListener()
		{
			
			@Override
			public void menuSelected(MenuEvent e)
			{
				// TODO Auto-generated method stub
				String str = t.getText();
				try
				{
					Writer w = new FileWriter("e:\\abc\\1.txt");
					w.write(str);
					w.close();
					
				} catch (FileNotFoundException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
			@Override
			public void menuDeselected(MenuEvent e)
			{
				// TODO Auto-generated method stub
			}
			
			@Override
			public void menuCanceled(MenuEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		m4.addMenuListener(new MenuListener()
		{
			
			@Override
			public void menuSelected(MenuEvent e)
			{
				// TODO Auto-generated method stub
			}
			
			@Override
			public void menuDeselected(MenuEvent e)
			{
				// TODO Auto-generated method stub
			}
			
			@Override
			public void menuCanceled(MenuEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		m5.addMenuListener(new MenuListener()
		{
			
			@Override
			public void menuSelected(MenuEvent e)
			{
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void menuDeselected(MenuEvent e)
			{
				// TODO Auto-generated method stub
			}
			
			@Override
			public void menuCanceled(MenuEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
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
