package _06对象流;
import java.io.*;
public class TestDemo
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
//		writeout();
		
		readin();
	}

	private static void readin() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("e:\\1.txt"));
		Student ss1 = (Student)in.readObject();
		System.out.println(ss1);
		Student ss2 = (Student)in.readObject();
		System.out.println(ss2);
		Student ss3 = (Student)in.readObject();
		System.out.println(ss3);
	}

	private static void writeout() throws IOException
	{
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"刘德华",13,true);
		Student s2 = new Student(102,"刘亦菲",19,false);
		Student s3 = new Student(103,"周润发",18,true);
		ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(("e:\\1.txt"))); 
		w.writeObject(s1);
		w.writeObject(s2);
		w.writeObject(s3);
		w.close();
	}

}
