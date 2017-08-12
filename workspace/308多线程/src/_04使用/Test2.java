package _04使用;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame//Frame类
{	
	final static int N = 14;
	final static int GRID = 40;
	final static int MARGIN = 50;
	int x1,x2,y1,y2;
	
	public Test2()//Frame的构造方法
	{
		MyPanel p = new MyPanel();
		p.setLayout(null);
		this.add(p);
		
	}
	
	public class MyPanel extends JPanel//JPanel类
	{
		MyPanel()
		{
			
			this.setBackground(Color.gray);
			this.addMouseListener(new MouseListener()
			{
				
				@Override
				public void mouseReleased(MouseEvent e)
				{
					// TODO Auto-generated method stub
					x2 = e.getX();
					y2 = e.getY();
					System.out.println("songkai"+x2+","+y2);
				}
				
				@Override
				public void mousePressed(MouseEvent e)
				{
					// TODO Auto-generated method stub
					x1 = e.getX();
					y1 = e.getY();
					System.out.println("anxia"+x1+","+y1);
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
					
				}
			});
		}
		
		
		
		@Override
		protected void paintComponent(Graphics g)
		{
			// TODO Auto-generated method stub
			super.paintComponent(g);
			new Thread(new Runnable()
			{
				
				@Override
				public void run()
				{
					// TODO Auto-generated method stub
					g.setColor(Color.red);
					g.drawLine(x1, y1, x2, y2);
					repaint();
				}
			}).start();;
//			g.setColor(Color.red);
//			g.drawLine(x1, y1, x2, y2);
//			for(int i=0;i<N;i++)
//			{
//				g.drawLine(i*GRID+MARGIN,MARGIN, i*GRID+MARGIN,(N-1)*GRID+MARGIN);
//				g.drawLine(MARGIN,i*GRID+MARGIN,(N-1)*GRID+MARGIN,i*GRID+MARGIN);
//			}
//			g.setColor(Color.black);
//			g.fillOval(MARGIN-GRID/2,MARGIN-GRID/2,GRID,GRID);
//			g.fillOval(4*GRID+MARGIN-GRID/2,MARGIN-GRID/2,GRID,GRID);
//			g.fillOval(3*GRID+MARGIN-GRID/2,2*GRID+MARGIN-GRID/2,GRID,GRID);
//			g.setColor(Color.white);
//			g.fillOval(MARGIN-GRID/2,9*GRID+MARGIN-GRID/2,GRID,GRID);
//			g.fillOval(3*GRID+MARGIN-GRID/2,8*GRID+MARGIN-GRID/2,GRID,GRID);
//			g.fillOval(6*GRID+MARGIN-GRID/2,5*GRID+MARGIN-GRID/2,GRID,GRID);
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test2 f = new Test2();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,620,650);
	}

}
