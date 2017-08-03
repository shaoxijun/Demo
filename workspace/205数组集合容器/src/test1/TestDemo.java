package test1;

public class TestDemo
{
	public static void main(String[] args)
	{
		test1_LinkedList<Integer> l = new test1_LinkedList<>();
		l.add(3);
		l.add(4,5,6,7,8,6);
		l.print();
		
		test1_LinkedList<Student> s0 = new test1_LinkedList<>();
		test1_LinkedList<Student> s1 = new test1_LinkedList<>();
		test1_LinkedList<Student> s2 = new test1_LinkedList<>();
		Student s = new Student("ÁõÒà·Æ",20);
		s0.add(s);
		s0.add(new Student("liudehua",12));
		s0.add(new Student("liudehua3",22));
		s0.add(new Student("liudehua2",11));
		s0.add(new Student("liudehua1",34));
		s0.find(new Student("liudehua",12));
		s0.print();
		s0.find(s);
		s0.remove(s);
		s0.print();
	}
}
