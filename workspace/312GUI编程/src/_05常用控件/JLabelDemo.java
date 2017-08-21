package _05³£ÓÃ¿Ø¼þ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelDemo extends JFrame
{
	public JLabelDemo()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		JLabel  l1 = new JLabel("abc");
		l1.setBounds(0,0,50,50);
		p.add(l1);
		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("ren1.jpg");
		l2.setIcon(icon);
		l2.setBounds(80, 10, 80, 80);
		p.add(l2);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JLabelDemo f = new JLabelDemo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
	}

}
