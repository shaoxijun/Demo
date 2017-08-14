package _04สนำร;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test f = new Test();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 250, 500, 450);
	}

	public Test()
	{
		PaintPanel p = new PaintPanel();
//		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		p.transferFocus();
	
	}
}
