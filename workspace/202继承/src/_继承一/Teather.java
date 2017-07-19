package _继承一;

public class Teather extends Person

{
	int workAge;

	public Teather(String name, int age, int workAge)
	{
		super(name, age);
		this.workAge = workAge;
	}
	
	void teach()
	{
		System.out.println("老师   "+name+"在讲课");
	}
	void code()
	{
		System.out.println("老师   "+name+"敲代码");
	}
}
