package _¼Ì³ÐÒ»;

public class Rectangle extends Shape
{
	public Rectangle(int l, int k)
	{
		super(l, k);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area()
	{
		int s = l * k;
		System.out.println(s);
	}
		

	@Override
	void round()
	{
		int c = (k + l)*2;
		System.out.println(c);
	}
	
}
