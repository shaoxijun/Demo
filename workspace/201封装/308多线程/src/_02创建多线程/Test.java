package _02�������߳�;

public class Test
{



	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		//����һ�������ã�
		MyThread t = new MyThread();
		t.start();
		
		//�����������ã�
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		
		//�����������ã�
		Thread t2 = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++)
				{
					System.out.println("����������Ƿ�������");
				}
				System.out.println("����");
			}
		});
		t2.start();
		System.out.println("��Ҫ��ʼ��������");
//		for(int i = 0;i<8;i++)
//		{
//			
//			System.out.println("���ŵ�"+i+"�£�����");
//			Thread.sleep(500);
//		}
//		System.out.println("������");
	}

}
//����һ�������ã�
class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("���յ������Ƿ���һ��");
		}
		System.out.println("һ��");
	}
}
//�����������ã�
class MyRunnable implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("�����Ƿ�������");
		}
		System.out.println("����");
	}
	
}


