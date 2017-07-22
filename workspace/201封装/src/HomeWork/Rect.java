package HomeWork;

public class Rect
{
//	private int x;
//	private int y;
//	private int weight;
//	private int height;
//	public int getX()
//	{
//		return x;
//	}
//	public void setX(int x)
//	{
//		this.x = x;
//	}
//	public int getY()
//	{
//		return y;
//	}
//	public void setY(int y)
//	{
//		this.y = y;
//	}
//	public int getWeight()
//	{
//		return weight;
//	}
//	public void setWeight(int weight)
//	{
//		this.weight = weight;
//	}
//	public int getHeight()
//	{
//		return height;
//	}
//	public void setHeight(int height)
//	{
//		this.height = height;
//	}
//	public Rect(int x, int y, int weight, int height)
//	{
//		super();
//		this.x = x;
//		this.y = y;
//		this.weight = weight;
//		this.height = height;
//	}
//	public Rect()
//	{
//		super();
//		// TODO Auto-generated constructor stub
//	}
	//判断两个矩形是否相交
//	void cross(Rect r)
//	{
//		if(this.getX() - r.getX()<=r.getWeight())
//		{
//			if(r.getY()<=this.getY()&&this.getY() - r.getY()<=r.getWeight())
//			{
//				System.out.println("这个矩形在原矩形的左下侧相交");
//			}
//			if(r.getY()>this.getY()&&r.getY() - this.getY()<=r.getWeight())
//			{
//				System.out.println("这个矩形在原矩形的左上侧相交");
//			}
//		}
//		else if(r.getX() - this.getX()<=this.getWeight())
//		{
//			if(r.getY()<=this.getY()&&this.getY() - r.getY()<=r.getWeight())
//			{
//				System.out.println("这个矩形在原矩形的右下侧相交");
//			}
//			if(r.getY()>this.getY()&&r.getY() - this.getY()<=r.getWeight())
//			{
//				System.out.println("这个矩形在原矩形的右上侧相交");
//			}
//		}
//		else
//		{System.out.println("这两个图形不相交");}
//	}
//	//判断一个矩形是否在另一个矩形内部
//	void inside(Rect r)
//	{
//		if(r.getX()>this.getX()&&r.getY()<this.getY()
//				&&r.getWeight()<=this.getWeight()&&r.getWeight()<=this.getWeight())
//		{
//			System.out.println("这个图形在原图形的内部");
//		}
//		else
//		{System.out.println("这个图形不在原图形的内部");}
//	}
//	//判断直接是否与矩形相交
//	void withLine(Line l)
//	{
//		int m = this.getX();
//		int n = this.getY();
//		int k = (l.getY1() - l.getY2())/(l.getX1() - l.getX2());
//		int b = l.getY2() - (k * l.getX2());
//		for(int i=0;i<=this.getWeight();i++)
//		{
//			if(m == (n+i)*k+b)
//			{
//				System.out.println("两个图形相交");
//				break;
//			}
//			if((m-this.getWeight()) == (n+i)*k+b)
//			{
//				System.out.println("两个图形相交");
//				break;
//			}
//		}
//		for(int i=0;i<=this.getWeight();i++)
//		{
//			if((m+i) == n*k+b)
//			{
//				System.out.println("两个图形相交");
//				break;
//			}
//			if((m+i) == (n+this.getWeight())*k+b)
//			{
//				System.out.println("两个图形相交");
//				break;
//			}
//		}
//	}
	Point p;
	Size s;
	public Point getP()
	{
		return p;
	}
	public void setP(Point p)
	{
		this.p = p;
	}
	public Size getS()
	{
		return s;
	}
	public void setS(Size s)
	{
		this.s = s;
	}
	public Rect(Point p, Size s)
	{
		super();
		this.p = p;
		this.s = s;
	}
	public Rect()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
