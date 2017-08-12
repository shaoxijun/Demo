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
		MyPanel p = new MyPanel();
		p.setLayout(null);
		this.add(p);
		p.transferFocus();
	}
}
class MyPanel extends JPanel
{
	int x1=10;
	int x2=50;
	int y1=20;
	int y2=100;
	MyPanel()
	{
//		this.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
//		this.setBackground(Color.WHITE);
		this.addMouseListener(new MouseListener()
		{
			
			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub
				x2 = e.getX();
				y2 = e.getY();
				System.out.println(x2+","+y2);
			}
			
			@Override
			public void mousePressed(MouseEvent e)
			{
				// TODO Auto-generated method stub
				x1 = e.getX();
				y1 = e.getY();
				System.out.println(x1+","+y1);
			}
			@Override
			public void mouseExited(MouseEvent e){}
			@Override
			public void mouseEntered(MouseEvent e){}
			@Override
			public void mouseClicked(MouseEvent e){}
		});
	}
	
	@Override
	public void paintComponents(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.drawLine(x1, y1, x2, y2);
//		new Thread(new Runnable()
//		{
//			
//			@Override
//			public void run()
//			{
//				// TODO Auto-generated method stub
//				g.setColor(Color.BLACK);
//				g.drawLine(x1, y1, x2, y2);
//			}
//		}).start();;
		
		
	}
	
	
}