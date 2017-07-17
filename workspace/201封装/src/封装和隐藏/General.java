package 封装和隐藏;

public class General
{
	// 5. 定义一个武将类 General类，
			// 提供setter getter方法
			// 提供多参数构造方法和无参数的构造方法
			// 提供打印的方法
			// 定义General对象存储以下信息,打印输出
			// 名字 年龄 武力 智力
			// 刘备 48 78 85
			// 曹操 52 88 90
			// 孙权 45 75 75
			// 吕布 35 100 65
	private String name;
	private int old;
	private int force;
	private int IQ;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getOld()
	{
		return old;
	}
	public void setOld(int old)
	{
		this.old = old;
	}
	public int getForce()
	{
		return force;
	}
	public void setForce(int force)
	{
		this.force = force;
	}
	public int getIQ()
	{
		return IQ;
	}
	public void setIQ(int iQ)
	{
		IQ = iQ;
	}
	public General(String name, int old, int force, int iQ)
	{
		super();
		this.name = name;
		this.old = old;
		this.force = force;
		IQ = iQ;
	}
	public General()
	{
		
	}
	
}
