package ���鼯������_ѧ������;

public class test
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
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
	}
}
