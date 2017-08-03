package _9练习;

public class Car
{
	void drive() throws TrraficException
	{
		System.out.println("今天要开车去上班");
		int a = (int)(Math.random()*5);
		if(a == 1)
		{
			throw new TrraficException("我特么出车祸了");
		}
	}
}
