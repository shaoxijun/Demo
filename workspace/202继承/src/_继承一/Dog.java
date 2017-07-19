package _继承一;

public class Dog extends Animal
{

	public Dog(String propery, String name, int age)
	{
		super(propery, name, age);
		// TODO Auto-generated constructor stub
	}
	public Dog(String propery, String name, int age, String bone)
	{
		super(propery, name, age);
		this.bone = bone;
	}
	String bone;
	void watchDoor()
	{
		System.out.println("我特么看门贼厉害");
	}
}
