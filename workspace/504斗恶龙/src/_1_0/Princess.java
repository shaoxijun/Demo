package _1_0;

import _1_3.Monster;

public class Princess
{
	private String name;
	private int x ;
	private int y ;
	final static int N = 10;
	public Princess()
	{
		
	}
	
	
//	Hero hero ;
//	Monster m1;
//	Monster m2;
//	Monster m3;
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
	public Princess(String name, int x, int y)
	{
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	void psmove(char c)
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
	
	char direction()
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
