package _06��������;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo extends JFrame
{

	public TestDemo()
	{
		JPanel p = new JPanel();
		BoxLayout l = new BoxLayout(p,BoxLayout.Y_AXIS);
		p.setLayout(l);
		this.add(p);
		JButton btn1 = new JButton("��ť1");
		JButton btn2 = new JButton("��ť2");
		JButton btn3 = new JButton("��ť3");
		JButton btn4 = new JButton("��ť4");
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		
		btn1.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
//				JOptionPane.showMessageDialog(null, "�¿���");
//				JOptionPane.showMessageDialog(TestDemo.this, "�¿���");
//				JOptionPane.showMessageDialog(this, "�¿���");// ����
				JOptionPane.showMessageDialog(TestDemo.this, "�¿���","��Ҫ֪ͨ",JOptionPane.QUESTION_MESSAGE);
				
//				 /** Used for error messages. */
//			    public static final int  ERROR_MESSAGE = 0;
//			    /** Used for information messages. */
//			    public static final int  INFORMATION_MESSAGE = 1;
//			    /** Used for warning messages. */
//			    public static final int  WARNING_MESSAGE = 2;
//			    /** Used for questions. */
//			    public static final int  QUESTION_MESSAGE = 3;
//			    /** No icon is used. */
//			    public static final int   PLAIN_MESSAGE = -1;
			}
		});
		
		btn2.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
//				int sel = JOptionPane.showConfirmDialog(null, "����ô?");
				int sel = JOptionPane.showConfirmDialog(null, "����ô?","ѯ��",JOptionPane.YES_NO_CANCEL_OPTION);				
				System.out.println(sel);
			}
		});
		
		
		btn3.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				String s = JOptionPane.showInputDialog(null,"�����밵��:","��ʾ",JOptionPane.PLAIN_MESSAGE);
				System.out.println(s);
			}
		});
		
		btn4.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				String[] names = {"�ǵ�","�Ʊ�","ղķ˹"};
				String s = (String)JOptionPane.showInputDialog(null,"ѡ����ϲ��������","��ʾ",JOptionPane.PLAIN_MESSAGE,null,names,"�Ʊ�");
				System.out.println(s);
			}
		});
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TestDemo f = new TestDemo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
	}

}
