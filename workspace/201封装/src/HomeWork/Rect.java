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
	//�ж����������Ƿ��ཻ
//	void cross(Rect r)
//	{
//		if(this.getX() - r.getX()<=r.getWeight())
//		{
//			if(r.getY()<=this.getY()&&this.getY() - r.getY()<=r.getWeight())
//			{
//				System.out.println("���������ԭ���ε����²��ཻ");
//			}
//			if(r.getY()>this.getY()&&r.getY() - this.getY()<=r.getWeight())
//			{
//				System.out.println("���������ԭ���ε����ϲ��ཻ");
//			}
//		}
//		else if(r.getX() - this.getX()<=this.getWeight())
//		{
//			if(r.getY()<=this.getY()&&this.getY() - r.getY()<=r.getWeight())
//			{
//				System.out.println("���������ԭ���ε����²��ཻ");
//			}
//			if(r.getY()>this.getY()&&r.getY() - this.getY()<=r.getWeight())
//			{
//				System.out.println("���������ԭ���ε����ϲ��ཻ");
//			}
//		}
//		else
//		{System.out.println("������ͼ�β��ཻ");}
//	}
//	//�ж�һ�������Ƿ�����һ�������ڲ�
//	void inside(Rect r)
//	{
//		if(r.getX()>this.getX()&&r.getY()<this.getY()
//				&&r.getWeight()<=this.getWeight()&&r.getWeight()<=this.getWeight())
//		{
//			System.out.println("���ͼ����ԭͼ�ε��ڲ�");
//		}
//		else
//		{System.out.println("���ͼ�β���ԭͼ�ε��ڲ�");}
//	}
//	//�ж�ֱ���Ƿ�������ཻ
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
//				System.out.println("����ͼ���ཻ");
//				break;
//			}
//			if((m-this.getWeight()) == (n+i)*k+b)
//			{
//				System.out.println("����ͼ���ཻ");
//				break;
//			}
//		}
//		for(int i=0;i<=this.getWeight();i++)
//		{
//			if((m+i) == n*k+b)
//			{
//				System.out.println("����ͼ���ཻ");
//				break;
//			}
//			if((m+i) == (n+this.getWeight())*k+b)
//			{
//				System.out.println("����ͼ���ཻ");
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
