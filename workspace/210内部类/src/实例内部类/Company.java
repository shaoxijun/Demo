package 实例内部类;

public class Company
{
	String name;
	String bossName;
	employee[] e = new employee[10];
	
	void print()
	{
		System.out.println("公司名："+name+"法人："+bossName);
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
			System.out.println(name+"今年"+age+"岁"+"我是"+Company.this.bossName+"的人");
		}
	}
}
