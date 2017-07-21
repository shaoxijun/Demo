package HomeWork;

public class Line
{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public int getX1()
	{
		return x1;
	}
	public void setX1(int x1)
	{
		this.x1 = x1;
	}
	public int getY1()
	{
		return y1;
	}
	public void setY1(int y1)
	{
		this.y1 = y1;
	}
	public int getX2()
	{
		return x2;
	}
	public void setX2(int x2)
	{
		this.x2 = x2;
	}
	public int getY2()
	{
		return y2;
	}
	public void setY2(int y2)
	{
		this.y2 = y2;
	}
	public Line(int x1, int y1, int x2, int y2)
	{
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public Line()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	void cross(Line l)
	{
		System.out.println("请输入需要判断直线两个端点的坐标");
		if(this.getX1()<=l.getX1()&&this.getX2()>=l.getX2()
				&&this.getY1()<=l.getY1()&&this.getY2()>=l.getY2())
		{
			System.out.println("这个两条直线相交了");
		}
		else
		{
			System.out.println("这个两条直线没有相交");
		}
	}
}
