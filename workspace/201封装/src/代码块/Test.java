package �����;

public class Test
{
	 private int a;
	 int i = 11;
	 static int j = 10;

	 {
		 System.out.println("1��ʼ�����");//ÿ����������ִ��
	 }	  
	 static
	 {
		 System.out.println("2��ʼ���������");//ֻ����һ��
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
