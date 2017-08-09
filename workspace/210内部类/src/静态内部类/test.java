package 静态内部类;

public class test
{
	public static void main(String[] args)
	{		
		
		abstract class Animal
			{
				String name;
				abstract void sing();
				abstract void sleep();			
			}
			
			class Dog extends Animal
			{
				@Override
				void sing()
				{
					// TODO Auto-generated method stub
					name = "花儿";
					System.out.println(name+":我特么会唱歌");
				}
	
				@Override
				void sleep()
				{
					// TODO Auto-generated method stub
					
				}			
			}
		
			Dog d = new Dog();
			d.sing();
	
			
		
		
			
	}
	
}
