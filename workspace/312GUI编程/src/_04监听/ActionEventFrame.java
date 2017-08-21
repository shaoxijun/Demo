package _04¼àÌý;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ActionEventFrame extends JFrame
{

	public ActionEventFrame()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		
		JButton b = new JButton("b");
		b.setBackground(new Color((int)(Math.random()*255)));
		b.setBounds(80, 10, 80, 80);
		p.add(b);
		
	
		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ActionEventFrame f = new ActionEventFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
	}

}
