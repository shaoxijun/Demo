package ʵ���ڲ���;

public class Company
{
	String name;
	String bossName;
	employee[] e = new employee[10];
	
	void print()
	{
		System.out.println("��˾����"+name+"���ˣ�"+bossName);
		for(int i=0;i<e.length;i++)
		{
			if(e[i] != null)
			{
				e[i].print();
			}
		}
		
	}
	class employee
	{
		String name;
		int age;
		boolean sex;
		void print()
		{
			System.out.println(name+"����"+age+"��"+"����"+Company.this.bossName+"����");
		}
	}
}
