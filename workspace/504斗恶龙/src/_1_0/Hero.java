package _1_0;

import _1_2.Monster;

public class Hero
{
	private String name = "ÁõµÂ»ª";
	private int x ;
	private int y ;
	final static int N = 10;
	Princess ps ;
	Monster m1;
	Monster m2;
	Monster m3;
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

	public Hero(String name, int x, int y)
	{
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public Hero()
	{
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString()
	{
		return "Hero [name=" + name + ", x=" + x + ", y=" + y + "]";
	}

	public void heroMove(char m)
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
				System.out.println("ÊäÈë´íÎó");
		}
		
	}
	
}
