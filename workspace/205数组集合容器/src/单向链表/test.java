package 单向链表;

public class test
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(10);
		l.add(9);
		l.add(8);
		l.print();
		
		l.remove(2);// 删除头结点
		l.remove(8);
		l.remove(10);
		l.print();
	}
}
