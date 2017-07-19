package _¼Ì³ÐÒ»;

public class Animal
{
	String propery;
	String name;
	int age;
	
	public Animal(String propery, String name, int age)
	{
		super();
		this.propery = propery;
		this.name = name;
		this.age = age;
	}
	
	void sing(Animal a)
	{
		if(a.getClass() == Dog.class)
		{
			Dog d = (Dog)a;
			System.out.println(d.bone);
			d.watchDoor();
		}
		if(a.getClass() == Pig.class)
		{
			Pig p = (Pig)a;
			System.out.println(p.lazy);
			p.sleep();
		}
		if(a.getClass() == Cat.class)
		{
			Cat c = (Cat)a;
			System.out.println(c.eye);
			c.fish();
		}
	}
}
