package _9��ϰ;

public class Car
{
	void drive() throws TrraficException
	{
		System.out.println("����Ҫ����ȥ�ϰ�");
		int a = (int)(Math.random()*5);
		if(a == 1)
		{
			throw new TrraficException("����ô��������");
		}
	}
}
