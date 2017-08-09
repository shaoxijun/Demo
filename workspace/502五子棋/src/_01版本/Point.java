package _01°æ±¾;

class Point
{
	int x;
	int y;
	boolean isBlack;
	
	public Point(int x, int y, boolean isBlack)
	{
		super();
		this.x = x;
		this.y = y;
		this.isBlack = isBlack;
	}
	
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
	public String toString()
	{
		return  x + ", " + y ;
	}
	
}