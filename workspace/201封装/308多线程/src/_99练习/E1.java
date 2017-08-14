package _99练习;

public class E1
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// 1. 大明、小明一起吃100个馒头，每次吃，需要花100-200ms,馒头上有编号。
		// 打印大明、小明吃了哪些馒头。分别各吃了几个，显示总计吃了多少个.
		Person p = new Person();
		Thread t1 = new Thread(p);
		t1.setName("小明");
		Thread t2 = new Thread(p);
		t2.setName("大明");
		t1.start();
		Thread.yield();
		t2.start();

	}

}

class Person implements Runnable
{

	String name;
	int count = 0;
	int sum = 100;

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		while (count <= 100)
		{
			System.out.println(Thread.currentThread().getName() + "吃了第" + count + "个馒头");

			count++;
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				;
			}
		}
	}

}