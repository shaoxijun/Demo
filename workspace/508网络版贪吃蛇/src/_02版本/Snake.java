package _02°æ±¾;

import java.awt.Color;
import java.util.LinkedList;

import javax.swing.JPanel;


public class Snake
{
	LinkedList<Point> body = new LinkedList<>();
	Point nextp = new Point();
	Snake()
	{
		
	}
	

	
	public Point move(char c)
	{
		// TODO Auto-generated method stub
		Point head = body.getFirst();
		nextp = head.getNext(c);
		return nextp;
	}

	public boolean isOver()
	{
		if (nextp.x < 0 || nextp.x >= MyServer.N || nextp.y < 0 || nextp.y >= MyServer.N || body.contains(nextp))
		{
			return true;
		} else
		{
			return false;
		}

	}



	


}
