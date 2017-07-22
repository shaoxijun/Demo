package 实例内部类;

public class test
{
	public static void main(String[] args)
	{
		Company c1 = new Company();
		Company c2 = new Company();	
		c1.name = "呵呵";
		c1.bossName = "haha";
		c2.name = "打酱油";
		c2.bossName = "食屎啦";
		c1.e[0] = c1.new employee();
		c1.e[0].name = "刘德华";
		c1.e[0].age = 10;
		c1.e[0].sex = true;
		c1.e[1] = c1.new employee();
		c1.e[1].name = "刘亦菲";
		c1.e[1].age = 11;
		c1.e[1].sex = false;
		c2.e[2] = c2.new employee();
		c2.e[2].name = "马云";
		c2.e[2].age = 18;
		c1.print();
		c1.e[0].print();
		c1.e[1].print();
		c2.e[2].print();
	}
}
