package _05���ÿؼ�;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class TextFieldDemo extends JFrame
{
	public TextFieldDemo()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		
		JLabel l = new JLabel();
		l.setText("�û���");
		l.setBounds(50, 50, 80, 50);
		p.add(l);
		
		JTextField t = new JTextField();
		t.setBounds(150, 50, 120, 50);
		p.add(t);
		
		JLabel l2 = new JLabel();
		l2.setText("����:");
		l2.setBounds(50, 100, 80, 50);
		p.add(l2);
		
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(150,100,120,50);
		p.add(pass);
		
		
		JButton btn = new JButton("ȷ��");
		btn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(TextFieldDemo.this, "�������"+t.getText()+"����"+new String(pass.getPassword()));
			}
		});
		p.add(btn);
		btn.setBounds(50, 200, 100, 50);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setRows(20);// �и�
		txtArea.setColumns(10);// �п�
		JScrollPane scrollPane = new JScrollPane(txtArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(150, 150, 200, 200);
		p.add(scrollPane);
		
	}
	public static void main(String[] args)
	{
		TextFieldDemo f = new TextFieldDemo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
	}
}
