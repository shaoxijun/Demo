package _01�汾;
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
		t.setRows(30);//�и�
		t.setColumns(20);//�п�
//		JScrollPane scrollPane = new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane scrollPane = new JScrollPane(t);
		scrollPane.setBounds(0,0,480,335);
		p.add(scrollPane);
		//1.�����˵���
		JMenuBar mb = new JMenuBar();
		this.setJMenuBar(mb);
		//2.�������˵���
		JMenu m1 = new JMenu("�ļ�");
		mb.add(m1);
		JMenuItem m1Item1 = new JMenuItem("�½�", new ImageIcon("logo.gif"));
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
		
		JMenuItem m1Item2 = new JMenuItem("��", new ImageIcon("logo.gif"));
		m1Item2.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem m1Item3 = new JMenuItem("����", new ImageIcon("logo.gif"));
		m1Item3.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem m1Item4 = new JMenuItem("���Ϊ", new ImageIcon("logo.gif"));
		m1Item4.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		JMenuItem m1Item5 = new JMenuItem("�˳�", new ImageIcon("logo.gif"));
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
		JMenu m2 = new JMenu("�༭");
		mb.add(m2);
		JMenuItem m2Item1 = new JMenuItem("�½�", new ImageIcon("logo.gif"));
		JMenuItem m2Item2 = new JMenuItem("��", new ImageIcon("logo.gif"));
		JMenuItem m2Item3 = new JMenuItem("����", new ImageIcon("logo.gif"));
		JMenuItem m2Item4 = new JMenuItem("���Ϊ", new ImageIcon("logo.gif"));
		JMenuItem m2Item5 = new JMenuItem("�˳�", new ImageIcon("logo.gif"));
		m2.add(m2Item1);
		m2.add(m2Item2);
		m2.add(m2Item3);
		m2.add(m2Item4);
		m2.add(m2Item5);
		JMenu m3 = new JMenu("��ʽ");
		mb.add(m3);
		JMenuItem m3Item1 = new JMenuItem("�½�", new ImageIcon("logo.gif"));
		JMenuItem m3Item2 = new JMenuItem("��", new ImageIcon("logo.gif"));
		JMenuItem m3Item3 = new JMenuItem("����", new ImageIcon("logo.gif"));
		JMenuItem m3Item4 = new JMenuItem("���Ϊ", new ImageIcon("logo.gif"));
		JMenuItem m3Item5 = new JMenuItem("�˳�", new ImageIcon("logo.gif"));
		m3.add(m3Item1);
		m3.add(m3Item2);
		m3.add(m3Item3);
		m3.add(m3Item4);
		m3.add(m3Item5);
//		JMenu m4 = new JMenu("�鿴");
//		mb.add(m4);
//		JMenuItem m4Item1 = new JMenuItem("�½�", new ImageIcon("logo.gif"));
//		JMenuItem m4Item2 = new JMenuItem("��", new ImageIcon("logo.gif"));
//		JMenuItem m4Item3 = new JMenuItem("����", new ImageIcon("logo.gif"));
//		JMenuItem m4Item4 = new JMenuItem("���Ϊ", new ImageIcon("logo.gif"));
//		JMenuItem m4Item5 = new JMenuItem("�˳�", new ImageIcon("logo.gif"));
//		m1.add(m1Item1);
//		m1.add(m1Item2);
//		m1.add(m1Item3);
//		m1.add(m1Item4);
//		m1.add(m1Item5);
//		JMenu m5 = new JMenu("����");
//		mb.add(m5);
		//3.�����Ӳ˵���
	
	
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// �ۺ���ϰ
		// 1. ����windows�����еļ��±� ��дһ��GUI�ı��༭��
		// �ṩ:
		// 1. �½�
		// 2. ��
		// 3. ����
		// 4. ���Ϊ
		// 5. �˳�
		NoteBook f = new NoteBook();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,150,500,400);
	}

}
