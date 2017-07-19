package _¼Ì³ÐÒ»;

public class Square extends Shape
{

	public Square(int l, int k)
	{
		super(l, k);		
	}

	@Override
	void area()
	{
		// TODO Auto-generated method stub
		int s = l * k;
		System.out.println(s);
	}

	@Override
	void round()
	{
		// TODO Auto-generated method stub
		int c = l*4;
		System.out.println(c);
	}
	
}
