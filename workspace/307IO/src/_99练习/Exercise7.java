package _99��ϰ;
import java.io.*;
public class Exercise7
{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		// 7. ��дһ����ϵ���֧࣬�ִ浵
		// ��д���ɸ���ϵ�ˣ�ʹ�ö�����д�뵽�ļ����ٶ�ȡ��ʾ��
		// ��дһ��ͨѶ���࣬�����ɸ���ϵ�ˣ�֧�ֵ�
		// ����һ��ͨѶ����ʹ�ö�����д�뵽�ļ����ٶ�ȡ��ʾ��
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
		Person p1 = new Person("���»�","123412323",true,"���Ϻ�");
		Person p2 = new Person("�����","234341323",false,"�찲��");
		Person p3 = new Person("���ϻ�","12341297988",true,"�Ϻ�");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("e:\\e5.txt"));
		out.writeObject(p1);
		out.writeObject(p2);
		out.writeObject(p3);
		out.close();
		
	}

}
