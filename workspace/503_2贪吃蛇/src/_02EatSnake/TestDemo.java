package _02EatSnake;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.util.*;

public class TestDemo extends JFrame
{

	public static void main(String[] args)
	{
		TestDemo f = new TestDemo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
		
	}
	
	public class Snake
	{
		LinkedList<Point> s1 = new LinkedList<>();
		
	}
	
	public class Point
	{
		private int x,y;

		public Point(int x, int y)
		{
			super();
			this.x = x;
			this.y = y;
		}

		public Point()
		{
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		private TestDemo getOuterType()
		{
			return TestDemo.this;
		}
		
	}
}
