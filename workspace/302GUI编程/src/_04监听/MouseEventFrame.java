package _04监听;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventFrame extends JFrame
{
	public MouseEventFrame()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		p.setFocusable(true);
		p.addMouseListener(new MouseListener()
		{
			
			@Override
			public void mouseReleased(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("松开");
			}
			
			@Override
			public void mousePressed(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("按压");
			}
			
			@Override
			public void mouseExited(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("出去");
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("进入");
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("点击");
			}
		});
		
		p.addMouseMotionListener(new MouseMotionListener()
		{
			
			@Override
			public void mouseMoved(MouseEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("移动"+e.getX()+","+e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("拖动"+e.getX()+","+e.getY());
			}
		});
		
		p.addMouseWheelListener(new MouseWheelListener()
		{
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("滚轮"+e.getWheelRotation());
			}
		});
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		MouseEventFrame f = new MouseEventFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
	}

}
