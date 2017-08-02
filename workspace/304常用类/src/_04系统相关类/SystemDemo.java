package _04系统相关类;

import java.util.Map;

public class SystemDemo
{
	public static void main(String[] args)
	{
		long bt = System.currentTimeMillis();
		System.out.println(bt);
		double a = 1501583592914l/1000/3600/24/365;
		System.out.println(a);
		System.out.println(System.getenv());
		System.out.println(System.getSecurityManager());
	}
}
