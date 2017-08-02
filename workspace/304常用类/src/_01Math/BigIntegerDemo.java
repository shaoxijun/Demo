package _01Math;
import java.math.*;
public class BigIntegerDemo
{
	public static void main(String[] args)
	{
		 BigInteger i1 = new BigInteger("1111112112121212123");	
		 BigInteger i2 = new BigInteger("333232123232323");
		 BigInteger i3 = i1.add(i2);
		 System.out.println(i3);
	}
}
