package HomeWork;

public class Circle
{
	private int x;
	private int y;
	private int r;
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
	public int getR()
	{
		return r;
	}
	public void setR(int r)
	{
		this.r = r;
	}
	public Circle(int x, int y, int r)
	{
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public Circle()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	void cross(Circle c)
	{
		Point c1 = new Point(c.getX(),c.getY());
		Point c2 = new Point(this.getX(),this.getY());
		if(c1.distance(c2) <= this.getR()+c.getR())
		{
			System.out.println("这两个圆相交");
		}		
	}
	void inside(Point p)
	{
		Point p1 = new Point(this.getX(),this.getY());
		Point p2 = new Point(p.getX(),p.getY());
		if(p1.distance(p2) < this.getR())
		{
			System.out.println("这个点在圆内");
		}
		else if(p1.distance(p2) == this.getR())
		{
			System.out.println("这个点在圆上");
		}
		else
		{System.out.println("这个点在圆外");}
	}
}
