package 数组集合容器;

public class test
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.print();
		l.add(2);
		l.print();
		l.add(3);
		l.print();
		l.add(4);
		l.add(3);
		l.add(3);
		l.print();
		l.add(5);
		l.add(3);
		l.print();
		l.removeFromLast(5);
		l.print();
//		l.add(3,3,21,4,123,321,23,1,12,23,131,32);
//		System.out.println("你要找的数在"+l.find(3)+"的位置");//l.find(3);
//		l.print();
//		System.out.println("你要找的数在"+l.findFromLast(4)+"的位置");
	
		
	}
}
