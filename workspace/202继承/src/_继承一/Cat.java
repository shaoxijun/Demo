package _继承一;

public class Cat extends Animal
{

	public Cat(String propery, String name, int age)
	{
		super(propery, name, age);
		// TODO Auto-generated constructor stub
	}	
	String eye;
	public Cat(String propery, String name, int age, String eye)
	{
		super(propery, name, age);
		this.eye = eye;
	}
	void fish()
	{
		System.out.println("我特么贼喜欢吃鱼");
	}

}
