package ��װ������;

public class Person
{
	// ��ϰ:
	// 1. ����һ��Person��
	// ����: ���� ��� ����
	// ����:
	// ��ӡ�˵���Ϣ
	// ���Է�װ���ṩsetter getter���������������غ�����ں���Χ��
	private int age;
	private String name;
	private int height;
	private int weigth;
	private boolean married;
	
	
	//setAge and getAge
	public void setAge(int age)
	{
		if(age<=120&&age>=1)
		{
			this.age = age;
		}
		else {System.out.println("��������ȷ������");}
		System.out.println(this.age);
	}
	public int getAge() 
	{
		
		return this.age-1;
	}
	//setName and getName
	public void setName(String name)
	{
		this.name = name;
		System.out.println(this.name);
	}
	public String getName()
	{
		return this.name ;
	}
	
	//setHeight and getHeight
	public void setHeight(int height)
	{
		if(height<=310&&height>=1)
		{	
		this.height = height;
		
		}
		else {System.out.println("��������ȷ����");}
		System.out.println(this.height);
	}
	public int getHeight()
	{
		return this.height;
	}
	
	//setWeight and getWeight
	public void setWeight(int weight)
	{
		if(weight<=500&&weight>=1)
		{	
		this.weigth = weight;
		
		}
		else {System.out.println("��������ȷ����");}
	
		System.out.println(this.weigth);
	}
	public int getWeight()
	{
		return this.weigth;
	}
	
	//setMarried and getMarried
	public void setMarried(boolean married)
	{
		this.married = married;
		System.out.println(this.married);
	}
	public boolean getMarried()
	{
		return this.married;
	}
	
	
}
