package ʵ���ڲ���;

public abstract class PlayRole
{
	 String name;
	private int x ;
	private int y ;
	static int N = 10;
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		if(x>=0&&x<N)
		{this.x = x;}
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		if(y>=0&&y<N)
		{this.y = y;}
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
				this.x(x-1);
				break;
			case 'd':
				this.y(y+1);
				break;
			case 'a':
				this.y(y-1);
				break;
			case 's':
				this.x(x+1);
				break;
				default:
					System.out.println("�������");
			}		
	}
	private void y(int i)
	{
		// TODO Auto-generated method stub
		this.y = i;
	}
	private void x(int i)
	{
		// TODO Auto-generated method stub
		this.x = i;
	}
	void randomMove(int c)
	{			
			switch (c)
			{
			case 0://����
				this.setX(x-1);
				break;
			case 1://����
				this.setY(y+1);
				break;
			case 2://����
				this.setY(y-1);
				break;
			case 3://����
				this.setX(x+1);
				break;
				default:
					System.out.println("�������");
			}			
	}
}
