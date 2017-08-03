package FinalTest;

public class testDemo
{
	public static void main(String[] args)
	{
		LinkedList<Integer> l = new LinkedList<>();
//		LinkedList<Student> s = new LinkedList<>();
//		Student stu1 = new Student("刘德华1",21);
//		Student stu2 = new Student("刘德华2",22);
//		Student stu3 = new Student("刘德华3",23);
//		Student stu4 = new Student("刘德华4",24);
//		s.add(stu1,stu2,stu3,stu4);
//		s.print();
		
		l.add(1);
		l.print();
		System.out.println("长度："+l.length);
		l.add(2);
		l.print();
		System.out.println("长度："+l.length);
		l.add(3,4,5,6,7,8);
		l.print();
		System.out.println("长度："+l.length);
		l.indexAdd(5, 11);
		l.print();
		System.out.println("长度："+l.length);
		l.changeData(5, 21);
		l.print();
		System.out.println("长度："+l.length);
		System.out.println(l.findIndex(1));
//		l.print();
		System.out.println("长度："+l.length);
		
		
//		LinkedList<AddressList> ad = new LinkedList<>();
//		AddressList a1 = new AddressList("刘德华","111");
//		AddressList a2 = new AddressList("吴彦祖","112");
//		AddressList a3 = new AddressList("周星驰","113");
//		AddressList a4 = new AddressList("周润发","114");
//		AddressList a5 = new AddressList("胡歌","115");
//		ad.add(a1,a2,a3,a4,a5);
//		ad.print();
		
		
//		Card[] c = new Card[3];
//		LinkedList<Card> card = new LinkedList<>();
//		for(int i=0;i<3;i++)
//		{
//			c[i] = new Card("haha");
//		}
//		for(int i =0;i<3;i++)
//		{
//			card.add(c[i]);
//		}
//		card.print();
	}
}
