package _1�෺��;

public class test
{
	public static void main(String[] args)
	{
		LinkedList<Student> l = new LinkedList<>();
		l.add(new Student(100,"���»�",10));
		l.add(new Student(101,"���»�1",10));
		l.add(new Student(102,"���»�2",10));
		l.add(new Student(103,"���»�3",10));
		l.add(new Student(104,"���»�4",10));
		l.add(new Student(105,"���»�5",10));
		l.print();
		
		l.remove(new Student(102));// ɾ��ͷ���
		l.remove(new Student(104));		
		l.print();
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(2);
		l1.add(4);
		l1.add(19);
		l1.print();
	}
}
