package _99��ϰ;

public class E4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 4. һ������ס��6��ͬѧ
		// ������������Ҫ��6����:�𴲴��·�,ˢ��,ϴ��,�ϴ��,���緹��������Ʒ
		// ���в�����λֻ��һ����ֻ��һ��ͬѧ�ϴ�ţ��������鶼�ǿ���ͬʱִ�еġ�
		// ÿ������Ҫ����5���ӡ�
		// 6������������㶨����ʾһ�𵽽����ϿΡ�
		// ���1�������ÿ�������������±��������𴲴��·�,ˢ��,ϴ��,�ϴ��,���緹��������Ʒ�������� , ��ӡ�ܼƻ��ѵ��¼���
		
		// ���2�������ÿ��������������Ҳ���Բ�ͬ��������	,��ӡ�ܼƻ��ѵ��¼��� (ʹ����Ҫ�õ�Lock��tryLock()����)
		daylife mr = new daylife();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		Thread t4 = new Thread(mr);
		Thread t5 = new Thread(mr);
		Thread t6 = new Thread(mr);
		t1.setName("��");
		t2.setName("��");
		t3.setName("��");
		t4.setName("��");
		t5.setName("��");
		t6.setName("��");
		
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
		System.out.println(Thread.currentThread().getName()+",ȥ�Ͽ���,�ܹ�����"+(ti2-ti1));
		
	}

	private void clean()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",����������");
	}

	private void eat()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",���ڳ��緹");
	}

	private void dahao()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",���ڴ��");
	}

	private void washFace()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",����ϴ��");
	}

	private void brushTeeth()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",����ˢ��");
	}

	private void getUp()
	{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+",���𴲴��·���");
	}
	
}