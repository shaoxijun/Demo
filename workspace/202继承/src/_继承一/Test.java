package _�̳�һ;

public class Test
{

	public static void main(String[] args)
	{
//		Student stu = new Student("liudehua",20,"hahaa");
//		Teather tea = new Teather("liuyifei",40,10);		
//		stu.sayHello();
//		tea.sayHello();
		
//		Dog d = new Dog("��Ȯ","�ƶ�",2,"������");
//		Pig p = new Pig("����","����",3,"��˯������ҹ");
//		Cat c = new Cat("��è","Ԫ��",1,"ҹ��ᷢ�����۾�");
//		Animal[] a = new Animal[3];
//		a[0] = d;
//		a[1] = p;
//		a[2] = c;
//		for(int i=0;i<a.length;i++)
//		{
//				a[i].sing(a[i]);
//		}
//		 Card c = new Card();
//				 c.id = "1234123423423423";
//				 c.password = "123456";
//				 c.money = 1000;
//				 c.print();
//				 c.saveMoney(1000);
//				 c.print();// ��ǰ���2000
//				 c.takeMoney(500);
//				 c.print();// ��ǰ���1500
//				 c.takeMoney(10000);// ��ʾ:��ǰ����
//				 c.print();// ��ǰ���1500
				
//				 CreditCard c2 = new CreditCard();
//				 c2.id = "1234123423423423";
//				 c2.password = "123456";
//				 c2.money = 0;
//				 c2.credit = 5000;
//				 c2.print();
//				 c2.takeMoney(1000);
//				 c2.print();// ��ǰ���-1000
//				 c2.takeMoney(5000);// ��ǰ:���ö�Ȳ���
//				 c2.print();// ��ǰ���-1000
//				 c2.saveMoney(1000);
//				 c2.print();// ��ǰ���0
//				 c2.saveMoney(1000);
//				 c2.print();// ��ǰ���1000

//		Square s = new Square(3,3);
		
//		PlayRole[] pr = new PlayRole[6];
//		Hero hero = new Hero("���»�",(int)(Math.random()*10),(int)(Math.random()*10));
//		Princess ps = new Princess("�����",(int)(Math.random()*10),(int)(Math.random()*10));
//		Boss boss = new Boss("����",(int)(Math.random()*10),(int)(Math.random()*10));
//		Monster m1 = new Monster("Ұ���1",(int)(Math.random()*10),(int)(Math.random()*10));
//		Monster m2 = new Monster("Ұ���2",(int)(Math.random()*10),(int)(Math.random()*10));
//		Monster m3 = new Monster("Ұ���3",(int)(Math.random()*10),(int)(Math.random()*10));
//		pr[0] = hero;hero.gun = "����";
//		pr[1] = ps;ps.shoes = "ˮ��Ь";
//		pr[2] = boss;boss.car = "����";
//		pr[3] = m1;m1.weapon = "��ͷ";
//		pr[4] = m2;m2.weapon = "��ͷ";
//		pr[5] = m3;m3.weapon = "�˵�";
//		for(int i=0;i<pr.length;i++)
//		{
//			pr[i].print(pr[i]);
//		}
		
//		Shape s = new Square(3,3);
//		Shape r = new Rectangle(6,4);
//		s.area();
//		s.round();
//		r.area();
//		r.round();
		
		
//		Student s1 =new Student("liudehua",20,"12345");
//		Student s2 =new Student("liuyifei",22,"12345");
//		if(s1.equals(s2))
//		{System.out.println("ok");}
		
		
		Person[] p = new Person[4];
		p[0] = new Student("liudehua",3,"12345");
		p[1] = new Student("liuyifei",4,"22345");
		p[2] = new Student("liuluoguo",2,"32345");
		p[3] = new Teather("huangjun",3,2);
		for(int i=0;i<p.length;i++)
		{
			p[i].eat();
			p[i].sleep();
			if(p[i].getClass() == Student.class)
			{
				Student s = (Student)p[i];
				s.listenLesson();
				s.code();
				s.LOL();
			}
			if(p[i].getClass() == Teather.class)
			{
				Teather t = (Teather)p[i];
				t.teach();
				t.code();
			}
			
			
		}
	}

}
