package HomeWork;

public class Point
{
	private int x;
	private int y;
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public Point(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	public Point(Point p)
	{
		this.x = p.x;
		this.y = p.y;
//		this.setX(p.getX());
//		this.setY(p.getY());
	}
	public Point()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	double distance(Point p)
	{
		double d;
		d = Math.hypot(this.getX() - p.x, this.getY() - p.y);
		return d;
	}
	
}
