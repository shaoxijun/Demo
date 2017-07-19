package _1_3;

public abstract class PlayRole
{
	private String name;
	private int x ;
	private int y ;
	private int N = 10;
	
	public int getN()
	{
		return N;
	}
	public void setN(int n)
	{
		N = n;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		if(x>=0&&x<N)
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		if(y>=0&&y<N)
		this.y = y;
	}
	public PlayRole(String name, int x, int y)
	{
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public PlayRole()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void move(char m)
	{
		switch (m)
		{
		case 'w':
			setX(x-1);
			break;
		case 'd':
			setY(y+1);
			break;
		case 'a':
			setY(y-1);
			break;
		case 's':
			setX(x+1);
			break;
			default:
				System.out.println("输入错误");
		}
	}
	void randomMove(int c)
	{		
		switch (c)
		{
		case 0://向上
			setX(x-1);
			break;
		case 1://向右
			setY(y+1);
			break;
		case 2://向左
			setY(y-1);
			break;
		case 3://向下
			setX(x+1);
			break;
			default:
				System.out.println("输入错误");
		}
		
	}
}
