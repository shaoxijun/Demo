package ��̬�ڲ���;

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
					name = "����";
					System.out.println(name+":����ô�ᳪ��");
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
