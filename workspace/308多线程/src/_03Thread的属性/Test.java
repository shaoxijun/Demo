package _03Thread的属性;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable());
		t.start();
		Thread tt = Thread.currentThread();
		System.out.println(tt.getName()+"开始");
		System.out.println("线程编号"+tt.getId());
		System.out.println("优先级"+tt.getPriority());
		for(int i=0;i<10;i++)
		{
			System.out.println("老子是主方法里的");
		}
		System.out.println("呵呵");
	}

}
class MyRunnable implements Runnable
{
	

	@Override
	public void run()
	{
//		System.out.println(getName()+"开始");
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("老子是被创建出来的");
		}
		System.out.println("老子完了");
	}
	
}