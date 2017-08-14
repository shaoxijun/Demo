package _04สนำร;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;

class PaintPanel extends JPanel
{
	int x1=10;
	int x2=50;
	int y1=20;
	int y2=100;
	PaintPanel()
	{
//		this.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		this.setBackground(Color.WHITE);
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
		repaint();
	}
	
	@Override
	public void paintComponents(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		g.drawLine(11, 24, 146, 245);

		
		
	}
	
	
}
