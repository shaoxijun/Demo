package _01°æ±¾;

import java.awt.Color;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Snake
{
	LinkedList<Point> body = new LinkedList<>();
	LinkedList<Point> forfood = new LinkedList<>();
	LinkedList<JPanel> grids = new LinkedList<>();
	Point nextp = new Point();
	Snake s;
	Point food;
	Snake()
	{
		body.addFirst(new Point(0, 0));
		body.addFirst(new Point(1, 0));
		body.addFirst(new Point(2, 0));
	}

	public void createGrid()
	{
		for (int i = 0; i < MyServer.N; i++)
		{
			for (int j = 0; j < MyServer.N; j++)
			{
				JPanel newp = new JPanel();
				newp.setBackground(Color.LIGHT_GRAY);
				newp.setBounds(j * (MyServer.gridwidth + 2) + 2, i * (MyServer.gridwidth + 2) + 2, MyServer.gridwidth, MyServer.gridwidth);
				MyServer.p.add(newp);
				grids.add(newp);
				forfood.add(new Point(i, j));
			}
		}
	}
	public void move(char c)
	{
		// TODO Auto-generated method stub
		Point head = s.body.getFirst();
		nextp = head.getNext(c);
		if (!s.isOver())
		{
			if (!nextp.equals(food))
			{
				s.body.addFirst(nextp);
				s.body.removeLast();
			} else
			{
				s.body.addFirst(nextp);
				createFood();
			}
		} else
		{
			System.out.println("YOU LOSE !");
		}
	}

	void createFood()
	{
		forfood.removeAll(s.body);
		MyServer.food = forfood.get((int) (Math.random() * forfood.size()));
//		System.out.println(MyServer.food.x+","+MyServer.food.y);
	}
	
	public boolean isOver()
	{
		if (nextp.x < 0 || nextp.x >= MyServer.N || nextp.y < 0 || nextp.y >= MyServer.N || s.body.contains(nextp))
		{
			return true;
		} else
		{
			return false;
		}

	}
}
