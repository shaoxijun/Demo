package _01EatSnake;

import java.util.*;

public class Snake
{
	LinkedList<Point> point = new LinkedList<>();
	public Snake()
	{
		point.add(new Point(0,2));
		point.add(new Point(0,1));
		point.add(new Point(0,0));
	}
	public boolean contains(int i, int j)
	{
		return point.contains(new Point(i,j));
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((point == null) ? 0 : point.hashCode());
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
		Snake other = (Snake) obj;
		if (point == null)
		{
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		return true;
	}
	
}
