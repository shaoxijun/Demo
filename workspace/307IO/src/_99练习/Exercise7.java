package _99练习;
import java.io.*;
public class Exercise7
{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		// 7. 编写一个联系人类，支持存档
		// 编写若干个联系人，使用对象流写入到文件，再读取显示。
		// 编写一个通讯簿类，含若干个联系人，支持当
		// 创建一个通讯簿，使用对象流写入到文件，再读取显示。
		write();
		read();
	}

	private static void read() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("e:\\e5.txt"));
		Person p1 = (Person)in.readObject();
		Person p2 = (Person)in.readObject();
		Person p3 = (Person)in.readObject();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

	private static void write() throws FileNotFoundException, IOException
	{
		// TODO Auto-generated method stub
		Person p1 = new Person("刘德华","123412323",true,"中南海");
		Person p2 = new Person("刘亦菲","234341323",false,"天安门");
		Person p3 = new Person("雷老虎","12341297988",true,"南海");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("e:\\e5.txt"));
		out.writeObject(p1);
		out.writeObject(p2);
		out.writeObject(p3);
		out.close();
		
	}

}
