package _03Thread������;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable());
		t.start();
		Thread tt = Thread.currentThread();
		System.out.println(tt.getName()+"��ʼ");
		System.out.println("�̱߳��"+tt.getId());
		System.out.println("���ȼ�"+tt.getPriority());
		for(int i=0;i<10;i++)
		{
			System.out.println("���������������");
		}
		System.out.println("�Ǻ�");
	}

}
class MyRunnable implements Runnable
{
	

	@Override
	public void run()
	{
//		System.out.println(getName()+"��ʼ");
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("�����Ǳ�����������");
		}
		System.out.println("��������");
	}
	
}