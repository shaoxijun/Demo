package _99练习;

public class E4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 4. 一个宿舍住了6个同学
		// 他们早上起来要干6件事:起床穿衣服,刷牙,洗脸,上大号,吃早饭，整理物品
		// 其中厕所坑位只有一个，只能一个同学上大号，其他事情都是可以同时执行的。
		// 每件事需要花费5分钟。
		// 6个人所有事情搞定后，显示一起到教室上课。
		// 情况1：如果，每个人做着六件事必须依照起床穿衣服,刷牙,洗脸,上大号,吃早饭，整理物品次序的情况 , 打印总计花费的事件。
		
		// 情况2：如果，每个人做着六件事也可以不同次序的情况	,打印总计花费的事件。 (使用需要用到Lock的tryLock()方法)
		daylife mr = new daylife();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		Thread t4 = new Thread(mr);
		Thread t5 = new Thread(mr);
		Thread t6 = new Thread(mr);
		t1.setName("甲");
		t2.setName("乙");
		t3.setName("丙");
		t4.setName("丁");
		t5.setName("戊");
		t6.setName("戌");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
	}

}
class daylife implements Runnable
{

	@Override
	public void run()
	{
		int a=0;
		// TODO Auto-generated method stub
		long ti1 = System.currentTimeMillis();
		for(int i=4;i>=0;i--)
		{
			switch(i)
			{
			case 4:
				getUp();
				break;
			case 3:
				brushTeeth();
				break;
			case 2:
				washFace();
				break;
			case 1:
				synchronized (this)
				{
				a++; 
				dahao();
				System.out.println(a);
				}
				break;
			case 0:
				clean();
				break;
			}
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long ti2 = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName()+",去上课了,总共花了"+(ti2-ti1));
		
	}

	private void clean()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",我在整理东西");
	}

	private void eat()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",我在吃早饭");
	}

	private void dahao()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",我在大号");
	}

	private void washFace()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",我在洗脸");
	}

	private void brushTeeth()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",我在刷牙");
	}

	private void getUp()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",我起床穿衣服了");
	}
	
}