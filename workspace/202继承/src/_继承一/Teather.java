package _�̳�һ;

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
		System.out.println("��ʦ   "+name+"�ڽ���");
	}
	void code()
	{
		System.out.println("��ʦ   "+name+"�ô���");
	}
}
