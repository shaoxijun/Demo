package _1_2;

import _1_0.Hero;
import _1_0.Princess;

public class Monster
{
	private String name;
	private int x;
	private int y;
	static final int N = 10;
	Hero hero ;
	Princess ps ;
	public Monster()
	{
		super();
		// TODO Auto-generated constructor stub
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
	public Monster(String name, int x, int y)
	{
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public void monMove(char c)
	{			
			switch (c)
			{
			case 'w'://向上
				setX(x-1);
				break;
			case 'd'://向右
				setY(y+1);
				break;
			case 'a'://向左
				setY(y-1);
				break;
			case 's'://向下
				setX(x+1);
				break;
				default:
					System.out.println("输入错误");
			}			
	}
	public char direction()
	{
		char dir;
		double d = Math.random()*4;
		int a = (int)d;
		switch(a)
		{
		case 0:
			dir = 'w';
			break;
		case 1:
			dir = 'd';
			break;
		case 2:
			dir = 'a';
			break;
		default:
			dir = 's';			
		}
		return dir;
	}
	
	
}
