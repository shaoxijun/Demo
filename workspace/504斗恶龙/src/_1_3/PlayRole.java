package _1_3;

public abstract class PlayRole
{
	 String name;
	 int x ;
	 int y ;
	 int N = 10;
	

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
		if(x<=N&&x>=0&&y<=N&&y>=0)
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
		if(x<=N&&x>=0&&y<=N&&y>=0)
		{
			switch (c)
			{
			case 0://����
				this.x(x-1);
				break;
			case 1://����
				this.y(y+1);
				break;
			case 2://����
				this.y(y-1);
				break;
			case 3://����
				this.x(x+1);
				break;
				default:
					System.out.println("�������");
			}
		}
		
	}
}
