package _99Á·Ï°;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class _03GuessFinger extends JFrame
{

	public _03GuessFinger()
	{
		super();
		JPanel p = new JPanel();
		this.add(p);
		JLabel  l1 = new JLabel("1234");
		l1.setBounds(0,0,10,10);
		p.add(l1);
		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("wang.gif");
		l2.setIcon(icon);
		l2.setBounds(30, 20, 30, 30);
		p.add(l2);
			
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 3. ±àÐ´Ò»¸ö²ÂÈ­ÓÎÏ·
		_03GuessFinger f = new _03GuessFinger();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
	}

}
