package ʵ���ڲ���;

public class test
{
	public static void main(String[] args)
	{
		Company c1 = new Company();
		Company c2 = new Company();	
		c1.name = "�Ǻ�";
		c1.bossName = "haha";
		c2.name = "����";
		c2.bossName = "ʳʺ��";
		c1.e[0] = c1.new employee();
		c1.e[0].name = "���»�";
		c1.e[0].age = 10;
		c1.e[0].sex = true;
		c1.e[1] = c1.new employee();
		c1.e[1].name = "�����";
		c1.e[1].age = 11;
		c1.e[1].sex = false;
		c2.e[2] = c2.new employee();
		c2.e[2].name = "����";
		c2.e[2].age = 18;
		c1.print();
		c1.e[0].print();
		c1.e[1].print();
		c2.e[2].print();
	}
}
