package 代码块;

public class Test
{
	 private int a;
	 int i = 11;
	 static int j = 10;

	 {
		 System.out.println("1初始化完成");//每个方法都会执行
	 }	  
	 static
	 {
		 System.out.println("2初始化又完成了");//只运行一次
	 }
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}

	public int getI()
	{
		return i;
	}	
	public void setI(int i)
	{
		this.i = i;
	}
	public Test()
	{}

	public Test(int a, int i)
	{
		super();
		this.a = a;
		this.i = i;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return  "a="+a;
	}
}
