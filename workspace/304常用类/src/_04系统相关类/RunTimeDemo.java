package _04ϵͳ�����;

public class RunTimeDemo
{
	public static void main(String[] args)
	{
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());//����Java�������ʣ������ڴ���
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.availableProcessors());
		
	}
}
