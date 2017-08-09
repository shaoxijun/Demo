package _01版本;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class MyPanel extends JPanel
{
	final static int N = 14;
	final static int GRID = 40;
	final static int MARGIN = 50;
	LinkedList<Point> l = new LinkedList<>();
	boolean black = true;
	
	MyPanel()
	{
		JTextField t = new JTextField("黑方下");
		t.setBounds(600, 500,60,30 );
	
		this.add(t);
		this.setBackground(Color.gray);
		this.addMouseListener(new MouseListener()
		{
			
			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e)
			{
				// TODO Auto-generated method stub
				int xPos = e.getX();
				int yPos = e.getY();
				int x= (xPos-MARGIN+GRID/2)/(GRID);
				int y= (yPos-MARGIN+GRID/2)/(GRID);
				// 待完善: 此处得
				Point np = new Point(x,y);
				boolean pd = false;
				for(Point po:l)
				{
					if(po.x == np.x&&po.y ==np.y)
					{
						pd = true;
					}else
					{
						pd = false;
					}
				}
//				System.out.println(pd);
				if(!pd)
				{
					if(!black)
					{
						t.setText("黑方下");
					}else
					{
						t.setText("白方下");
					}
					//判断是否已有棋子
					// 创建棋子添加到棋子列表
					l.add(new Point(x,y,black));
					// 切换玩家
					black = !black;
					// 让界面重新绘制，系统会在合适的时间调用paintComponent进行重绘
					repaint();
				}
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.black);
		//画棋盘
		for(int i=0;i<N;i++)
		{
			g.drawLine(i*GRID+MARGIN,MARGIN, i*GRID+MARGIN,(N-1)*GRID+MARGIN);
			g.drawLine(MARGIN,i*GRID+MARGIN,(N-1)*GRID+MARGIN,i*GRID+MARGIN);
		}
		//画棋子
		for(Point p:l)
		{
			int x = p.x*GRID+MARGIN-GRID/2;
			int y = p.y*GRID+MARGIN-GRID/2;
			g.setColor(p.isBlack?Color.BLACK:Color.white);
			g.fillOval(x, y, GRID, GRID);
		}
	}
}
