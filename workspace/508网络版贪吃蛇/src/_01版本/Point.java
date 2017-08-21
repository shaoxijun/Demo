package _01°æ±¾;

import java.io.Serializable;


public class Point implements Serializable
{
	int x, y;

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
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public Point getNext(char c)
	{
		// TODO Auto-generated method stub
		Point p = new Point();
		switch (c) {
		case 'w':
			p = new Point(this.x, this.y - 1);
			break;
		case 's':
			p = new Point(this.x, this.y + 1);
			break;
		case 'a':
			p = new Point(this.x - 1, this.y);
			break;
		case 'd':
			p = new Point(this.x + 1, this.y);
			break;
		}

		return p;
	}

}
