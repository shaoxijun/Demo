package _9练习;

public class Car
{
	void drive() throws TrraficException
	{
<<<<<<< HEAD
		System.out.println("    今天要开车去上班");
		int a = (int)(Math.random()*5);
		if(a == 1)
		{
			throw new TrraficException("    我特么出车祸了");
=======
		System.out.println("今天要开车去上班");
		int a = (int)(Math.random()*5);
		if(a == 1)
		{
			throw new TrraficException("我特么出车祸了");
>>>>>>> 7059dc851c41379569a06af8bf4495f9dc87c5e2
		}
	}
}
