package ��װ������;

public class HomeWork
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p = new Person();
		
//		p1.setAge(15);
//		p1.setName("�������»�");
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
//		h1.setAddress("���Ϻ�");
//		h1.setArea(45);
//		h1.setAtFloor(5);
//		h1.setPrice(5);
//		h1.setProperty("���������");
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
		
		Hero h = new Hero(100,"С��");
		Monster m = new Monster(50,"Ұ���");
		while (h.isAlive() && m.isAlive())// ���Ұ��֣�С���������ŵ�
		{
			h.attack(m);// С������һ��Ұ��֣����Ұ���HP����,��ӡһ�½����
			m.attack(h);// Ұ��ֹ���һ��С��
		}
		if (h.isAlive())
		{
			System.out.println("С��������Ұ���");
		} else
		{
			System.out.println("С����Ұ��ִ�����");
		}
		
//		Calc c = new Calc();
//		c.add(20); // +20
//		c.print(); // ��ӡ���20
//		c.sub(6);  // -6
//		c.print(); // ��ӡ���14
//		c.mul(5);   // *5
//		c.print(); // ��ӡ���70
//		c.div(2);  // /2
//		c.print(); // ��ӡ���35
//		c.clear(); // ��0
//		c.print(); // ��ӡ���0
		AddressCard ac = new AddressCard("���»�",1315447854);
		System.out.println(ac);
		
	}
	


}
