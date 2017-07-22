package ¾²Ì¬ÄÚ²¿Àà;

public class Outter
{
	String name = "outter.name";
	static String name1 = "static.name1";
	
	static class Inner
	{
		String name = "Inner.name";
		static String name1 = "static.name1";
		void test()
		{
			System.out.println(name);
			System.out.println(name1);
			System.out.println(Outter.name1);
		}
	}
	Inner i = new Inner();
	
	
}
