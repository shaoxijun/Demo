package _99��ϰ;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import _04����.MouseEventFrame;

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
				System.out.println("�ɿ�");
			}
			
			@Override
			public void mousePressed(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("��ѹ");
			}
			
			@Override
			public void mouseExited(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
//				System.out.println("��ȥ");
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
//				System.out.println("����");
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				// TODO Auto-generated method stub
				System.out.println("���");
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
//				System.out.println("�ƶ�"+e.getX()+","+e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e)
			{
				// TODO Auto-generated method stub
//				System.out.println("�϶�"+e.getX()+","+e.getY());
			}
		});
		
		p.addMouseWheelListener(new MouseWheelListener()
		{
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("����"+e.getWheelRotation());
			}
		});
	}
	public static void main(String[] args)
	{
		// ����һ������ ����������һ��50*50�ĺ�ɫ��ť
		// ������ƶ���ʱ���ð�ť��������ƶ���
		_01RedButton f = new _01RedButton();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
	}

}
