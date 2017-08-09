package _01°æ±¾;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestDemo extends JFrame
{

	TestDemo()
	{
		MyPanel p = new MyPanel();
		p.setLayout(null);
		JTextField t1 = new JTextField("ÆåÍõÕû°É");
		t1.setBounds(280, 16,60,30 );
		t1.setBackground(Color.red);
		this.add(t1);
		this.add(p);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TestDemo f = new TestDemo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,700,650);
	}


}
