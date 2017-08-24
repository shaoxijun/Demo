package _06对象流;
import java.io.*;
import java.util.LinkedList;
public class TestDemo
{

	public static void main(String[] args) //throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
//		writeout();
		
		readin();
	}

	private static void readin() 
	{
		// TODO Auto-generated method stub
		LinkedList<Student> l = new LinkedList<>();
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream(new FileInputStream("e:\\1.txt"));
			l = (LinkedList<Student>) in.readObject();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("没有发现文档");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("流错误");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("空文档");
		} 
		finally
		{
			try
			{
				in.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(Student s:l)
		{
			System.out.println(s);
		}
	}

	private static void writeout() //
	{
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"刘德华",13,true);
		Student s2 = new Student(102,"刘亦菲",19,false);
		Student s3 = new Student(103,"周润发",18,true);
		LinkedList<Student> l = new LinkedList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		ObjectOutputStream w = null;
		try
		{
			w = new ObjectOutputStream(new FileOutputStream("e:\\2.txt"));
			w.writeObject(l);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			w.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
