package _02创建多线程;

public class Test
{



	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		//方法一（不常用）
		MyThread t = new MyThread();
		t.start();
		
		//方法二（常用）
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		
		//方法三（常用）
		Thread t2 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++)
				{
					System.out.println("你他娘的我是方法三的");
				}
				System.out.println("三完");
			}
		});
		t2.start();
		System.out.println("我要开始打团团了");
//		for(int i = 0;i<8;i++)
//		{
//			
//			System.out.println("团团第"+i+"下，难受");
//			Thread.sleep(500);
//		}
//		System.out.println("打完了");
	}

}
//方法一（不常用）
class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("狗日的老子是方法一的");
		}
		System.out.println("一完");
	}
}
//方法二（常用）
class MyRunnable implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("老子是方法二的");
		}
		System.out.println("二完");
	}
	
}


