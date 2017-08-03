package _1类泛型;

public class test
{
	public static void main(String[] args)
	{
		LinkedList<Student> l = new LinkedList<>();
		l.add(new Student(100,"刘德华",10));
		l.add(new Student(101,"刘德华1",10));
		l.add(new Student(102,"刘德华2",10));
		l.add(new Student(103,"刘德华3",10));
		l.add(new Student(104,"刘德华4",10));
		l.add(new Student(105,"刘德华5",10));
		l.print();
		
		l.remove(new Student(102));// 删除头结点
		l.remove(new Student(104));		
		l.print();
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(2);
		l1.add(4);
		l1.add(19);
		l1.print();
	}
}
