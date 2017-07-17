package 封装和隐藏;

public class Point
{
	// 4. 给Point类机上构造方法，用以下代码测试
			// Point p1 = new Point(300,200);
			// p1.print();
			// Point p2 = new Point();
			// p2.setX(100);
			// p2.setY(200);
			// p2.print();
	
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
	public Point()
	{
		
	}
	public double distance(Point p)
	{
		int a = ((this.x - p.x) * (this.x - p.x) +(this.y - p.y) * (this.y - p.y));
		return Math.sqrt(a);
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return x+" , "+y;
	}
}
