package ��װ������;

public class Calc
{
	// 1. ��дһ���ۼƼ�����,�����´������:
//	Calc c = new Calc();
//	c.add(20);  // +20
//	c.print(); // ��ӡ���20
//	c.sub(6);  // -6
//	c.print(); // ��ӡ���14
//	c.mul(5);   // *5
//	c.print(); // ��ӡ���70
//	c.div(2);  // /2
//	c.print(); // ��ӡ���35
//	c.clear(); // ��0
//	c.print(); // ��ӡ���0
	private int a;
	static int b;
		
	
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public Calc()
	{}
	public Calc(int a)
	{
		super();
		this.a = a;
	}
//	----------------------
	public void print()
	{
		System.out.println(b);
	}
	public int add(int a)
	{
		b = this.a + a;		
		return b;
	}
	public int sub(int a)
	{
		b = b - a;

		return b;
	}
	public int mul(int a)
	{
		b = b * a;

		return b;
	}
	public int div(int a)
	{
		b = b / a;

		return b;
	}
	public int clear()
	{
		b = 0;

		return b;
	}
}
