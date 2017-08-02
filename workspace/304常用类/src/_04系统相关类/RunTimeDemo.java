package _04系统相关类;

public class RunTimeDemo
{
	public static void main(String[] args)
	{
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());//返回Java虚拟机中剩余空闲内存量
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.availableProcessors());
		
	}
}
