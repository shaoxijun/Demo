package _99��ϰ;

public class E1
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		// 1. ������С��һ���100����ͷ��ÿ�γԣ���Ҫ��100-200ms,��ͷ���б�š�
		// ��ӡ������С��������Щ��ͷ���ֱ�����˼�������ʾ�ܼƳ��˶��ٸ�.
		Person p = new Person();
		Thread t1 = new Thread(p);
		t1.setName("С��");
		Thread t2 = new Thread(p);
		t2.setName("����");
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
			System.out.println(Thread.currentThread().getName() + "���˵�" + count + "����ͷ");

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