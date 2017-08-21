package _99练习;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import _04监听.MouseEventFrame;

public class _01RedButton extends JFrame
{
	int x=0,y=0;
	public _01RedButton()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		JButton b = new JButton();
		b.setBounds(x,y,50,50);
		b.setBackground(Color.RED);
		p.add(b);
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
//				System.out.println("出去");
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
//				System.out.println("进入");
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
				x = e.getX();
				y = e.getY();
				b.setBounds(x,y,50,50);
//				System.out.println("移动"+e.getX()+","+e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e)
			{
				// TODO Auto-generated method stub
//				System.out.println("拖动"+e.getX()+","+e.getY());
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
		// 创建一个窗体 ，窗体内有一个50*50的红色按钮
		// 让鼠标移动的时候，让按钮跟着鼠标移动。
		_01RedButton f = new _01RedButton();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
	}

}
