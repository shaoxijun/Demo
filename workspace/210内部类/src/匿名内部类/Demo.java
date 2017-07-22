package 匿名内部类;

public class Demo
{

	public static void main(String[] args)
	{
		ICanDoAble i = new ICanDoAble()
				{

					@Override
					public void test()
					{
						// TODO Auto-generated method stub
						System.out.println("i can do everything !");
					}		
				};
				i.test();
		new ICanDoAble() {

			@Override
			public void test()
			{
				// TODO Auto-generated method stub
				System.out.println("我能上天入地");
			}
			
		}.test();;

	}


}
interface ICanDoAble
{
	public void test();
}