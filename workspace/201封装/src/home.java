import java.util.Arrays;
import java.util.Scanner;

public class home
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		Dog d1 = new Dog();
//		d1.name = "���»�";
//		d1.age =1;
//		Dog d2 = new Dog();
//		d2.name = "����";
//		d2.age =3;
//		d1.lookhome();
//		d2.lookhome();
//		d1.sleep();
//		d2.sleep();
//		d1.bone();
//		d2.bone();
		
//		Car c1 = new Car();
//		c1.brand = "�µ�";
//		c1.color = "��ɫ";
//		c1.model = "A4L";
//		c1.num = "��A88888";
//		c1.price = 998;
//		c1.drive();
//		c1.info();

//		Mark m = new Mark();
//		m.a = 2;
//		m.b = 2;
//		m.print();
		
//		Point p = new Point();
//		p.x = 3;
//		p.y = 3;
//		System.out.println(Arrays.toString(p.type()));
		
//		Round rou = new Round();
//		rou.r = 3;
//		System.out.println(rou.area());
//		System.out.println(rou.round());
//		
		
//		Rectangle rec = new Rectangle();
//		rec.height = 3;
//		rec.width=4;
//		System.out.println(rec.round());
//		System.out.println(rec.area());
		
		
		
		RPG r1 = new RPG();
		r1.property = "��ʦ";
		r1.name = "���»�";
		r1.MaxHP = 100;
		r1.MaxMP = 100;
		r1.MP = 3;
		r1.HP = 1;
		r1.information();
		while(true)
		{
			r1.direction();
			System.out.println("1����  0�˳�");
			int i=sc.nextInt();
			if(i==1)
				;
			else if(i==0)
			{break;}
			else
			{
				System.out.println("��������");
			}
		}
		
	}

}
