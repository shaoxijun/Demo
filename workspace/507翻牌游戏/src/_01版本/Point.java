package _01°æ±¾;

public class Point
{
	int x,y;
	String page;
	public Point(int x, int y, String page)
	{
		super();
		this.x = x;
		this.y = y;
		this.page = page;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((page == null) ? 0 : page.hashCode());
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
		if (page == null)
		{
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "Point [x=" + x + ", y=" + y + ", page=" + page + "]";
	}

	
}
