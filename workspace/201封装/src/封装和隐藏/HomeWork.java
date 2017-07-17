package 封装和隐藏;

public class HomeWork
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p = new Person();
		
//		p1.setAge(15);
//		p1.setName("我是刘德华");
//		p1.setHeight(77);
//		p1.setWeight(34);
//		p1.setMarried(false);
		
//		System.out.println();
//		System.out.println(p1.getAge());
//		System.out.println(p1.getName());
//		System.out.println(p1.getWeight());
//		System.out.println(p1.getWeight());
//		System.out.println(p1.getMarried());
		
		
//		House h1 = new House();
//		h1.setAddress("中南海");
//		h1.setArea(45);
//		h1.setAtFloor(5);
//		h1.setPrice(5);
//		h1.setProperty("不对外出售");
//		h1.setTotalFloors(150);
//		
		
		//Fraction
//		Arithmetic f1 = new Arithmetic(3,7);
//		Arithmetic f2 = new Arithmetic(2,5);
//		Arithmetic f3 = f1.sub(f2);
//		System.out.println(f3);
//		Arithmetic f4 = new Arithmetic(4,6);
////		f4.reduce();
//		System.out.println(f4);
//		f4.mul(f2);
//		System.out.println(f4.mul(f2));
		
		//point
//		 Point p1 = new Point(0,0);
//		 Point p2 = new Point(4,3);
////		System.out.println(p1); 
////		System.out.println(p2);		
//		System.out.println(p1.distance(p2));
		
		Hero h = new Hero(100,"小明");
		Monster m = new Monster(50,"野猪怪");
		while (h.isAlive() && m.isAlive())// 如果野猪怪，小明都还活着的
		{
			h.attack(m);// 小明攻击一下野猪怪，造成野猪怪HP减少,打印一下结果。
			m.attack(h);// 野猪怪攻击一下小明
		}
		if (h.isAlive())
		{
			System.out.println("小明打死了野猪怪");
		} else
		{
			System.out.println("小明被野猪怪打死了");
		}
		
//		Calc c = new Calc();
//		c.add(20); // +20
//		c.print(); // 打印输出20
//		c.sub(6);  // -6
//		c.print(); // 打印输出14
//		c.mul(5);   // *5
//		c.print(); // 打印输出70
//		c.div(2);  // /2
//		c.print(); // 打印输出35
//		c.clear(); // 清0
//		c.print(); // 打印输出0
		AddressCard ac = new AddressCard("刘德华",1315447854);
		System.out.println(ac);
		
	}
	


}
