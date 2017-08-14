package _04สนำร;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

import javax.swing.*;

public class Demo extends JFrame
{
	
	Demo()
	{
		MPanel p = new MPanel();
		p.setLayout(null);
		this.add(p);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Demo f = new Demo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,700,650);
	}

}
class MPanel extends JPanel
{
	int x,y;
	LinkedList<dian> l = new LinkedList<>();
	MPanel()
	{
		this.setBackground(Color.white);
		this.addMouseMotionListener(new MouseMotionListener()
		{
			
			@Override
			public void mouseMoved(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e)
			{
				// TODO Auto-generated method stub
				l.add(new dian(e.getX(),e.getY()));
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.BLACK);
//		g.drawLine(20, 20, x, y);
		for(int i=0;i<l.size()-1;i++)
		{
			g.drawLine(l.get(i).x, l.get(i).y,l.get(i+1).x, l.get(i+1).y);
		}
	}
}




