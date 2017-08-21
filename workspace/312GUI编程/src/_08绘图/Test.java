package _08绘图;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame//Frame类
{	
	final static int N = 14;
	final static int GRID = 40;
	final static int MARGIN = 50;
	
	
	public Test()//Frame的构造方法
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
		}
		@Override
		protected void paintComponent(Graphics g)
		{
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.black);
			for(int i=0;i<N;i++)
			{
				g.drawLine(i*GRID+MARGIN,MARGIN, i*GRID+MARGIN,(N-1)*GRID+MARGIN);
				g.drawLine(MARGIN,i*GRID+MARGIN,(N-1)*GRID+MARGIN,i*GRID+MARGIN);
			}
			g.setColor(Color.black);
			g.fillOval(MARGIN-GRID/2,MARGIN-GRID/2,GRID,GRID);
			g.fillOval(4*GRID+MARGIN-GRID/2,MARGIN-GRID/2,GRID,GRID);
			g.fillOval(3*GRID+MARGIN-GRID/2,2*GRID+MARGIN-GRID/2,GRID,GRID);
			g.setColor(Color.white);
			g.fillOval(MARGIN-GRID/2,9*GRID+MARGIN-GRID/2,GRID,GRID);
			g.fillOval(3*GRID+MARGIN-GRID/2,8*GRID+MARGIN-GRID/2,GRID,GRID);
			g.fillOval(6*GRID+MARGIN-GRID/2,5*GRID+MARGIN-GRID/2,GRID,GRID);
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test f = new Test();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,620,650);
	}

}
