package �����ڲ���;

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
				System.out.println("�����������");
			}
			
		}.test();;

	}


}
interface ICanDoAble
{
	public void test();
}