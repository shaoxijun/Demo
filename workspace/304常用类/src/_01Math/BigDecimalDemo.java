package _01Math;

import java.math.BigDecimal;

public class BigDecimalDemo
{
	public static void main(String[] args)
	{
		BigDecimal b1 = new BigDecimal("0.312");
		BigDecimal b2 = new BigDecimal("1.231234");
		BigDecimal b3 = b1.multiply(b2);
		System.out.println(b3);
	}
}
