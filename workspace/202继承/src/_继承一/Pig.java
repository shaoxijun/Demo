package _�̳�һ;

public class Pig extends Animal
{

	public Pig(String propery, String name, int age)
	{
		super(propery, name, age);
		// TODO Auto-generated constructor stub
	}
	public Pig(String propery, String name, int age, String lazy)
	{
		super(propery, name, age);
		this.lazy = lazy;
	}
	String lazy;
	void sleep()
	{
		System.out.println("����ô˯��������");
	}
}
