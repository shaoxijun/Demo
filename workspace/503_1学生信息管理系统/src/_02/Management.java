package _02;
import java.util.*;


import java.io.*;
public class Management
{
	static Scanner sc = new Scanner(System.in);
	static LinkedList<Student> stu = new LinkedList<>();
	static String PATH = "f://ai.txt";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// �ṩһ�½�������
		// 1. ���ѧ��
		// 2. �޸�ѧ����Ϣ
		// 3. ɾ��ѧ��
		// 4. ��ѯ
		// 4.1 ��ѯĳѧ��ѧ���ɼ�
		// 4.2 ��ѯ��������
		// 4.3 ��ѯ����Ҫ��������
		// 4.4 �����ܷ��г�ѧ��
		read();
		showMenu();
	}
	public static void save()
	{
		ObjectOutputStream out = null;
		try
		{
			out = new ObjectOutputStream(new FileOutputStream(PATH));
			out.writeObject(stu);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("û�з����ĵ�");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("���ĵ�");
		}
		try
		{
			if(out != null)
			out.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("��");
		}
		
	}
	public static void read()
	{
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream(new FileInputStream(PATH));
			stu = (LinkedList<Student>) in.readObject();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("û�з����ĵ�");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("������");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("���ĵ�");
		} 
		finally
		{
			try
			{
				if(in != null)
				in.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		for(Student s:stu)
		{
			System.out.println(s);
		}

	}
	public static void showMenu()
	{
		while(true)
		{
			System.out.print("��ѡ����Ҫ�Ĳ�����1 ���ѧ����Ϣ  2�޸�ѧ����Ϣ 3ɾ��ѧ�� 4 ��ѯ");
			int a = sc.nextInt();
			switch(a)
			{
			case 1:
				add();
				break;
			case 2:
				change();
				break;
			case 3:
				delet();
				break;
			case 4:
				find();
				break;
				default:
				{
					System.out.println("��������");
				}
			}
		}
	}
	private static void find()
	{
		// TODO Auto-generated method stub
		System.out.println("��ѡ������Ҫ�Ĳ���1��ѯĳѧ��ѧ���ĳɼ� 2��ѯ�������� 3��ѯ����Ҫ���������� 4���ܷ��г�ѧ��");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("������ѧ��");
			int id = sc.nextInt();
			find1(id);
			break;
		case 2:
			fidn2();
			break;
		case 3:
			fidn3();
			break;
		case 4:
			find4();
			break;
			default:
			{
				System.out.println("�������");
			}
		}
	}
	private static void find4()
	{
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2)
			{
				// TODO Auto-generated method stub
				if(o1.sum<o2.sum)
				{
					return 1;
				}
				else if(o1.sum>o2.sum)
				{
					return -1;
				}
				return 0;
			}
		});
		for(Student s:stu)
		{
			ts.add(s);
		}
		for(Student s:ts)
		{
			System.out.println(s);
		}
	}
	private static void fidn3()
	{
		// TODO Auto-generated method stub
		for(Student s:stu)
		{
			if(s.math>=60&&s.english>=60&&s.chinese>=60)
			{
				System.out.println(s);
			}
		}
	}
	private static void fidn2()
	{
		// TODO Auto-generated method stub
		for(Student s:stu)
		{
			if(s.math<60||s.english<60||s.chinese<60)
			{
				System.out.println(s);
			}
		}
	}
	private static void find1(int id)
	{
		// TODO Auto-generated method stub
		Iterator it = stu.iterator();
		while(it.hasNext())
		{
			Student s = (Student) it.next();
			if(s.num == id)
			{
				System.out.println(s);
				break;
			}
		}
	}
	private static void delet()
	{
		// TODO Auto-generated method stub
		System.out.println("��������Ҫɾ��ѧ����Ϣ��ѧ��");
		int in = sc.nextInt();
		Iterator it = stu.iterator();
		while(it.hasNext())
		{
			Student s = (Student) it.next();
			if(s.num == in)
			{
				it.remove();
				break;
			}
		}
		save();
	}
	private static void change()
	{
		// TODO Auto-generated method stub
		Iterator it = stu.iterator();
		String name = null;
		int c = 0;
		System.out.println("������Ҫ�޸�ѧ����ѧ��");
		int id = sc.nextInt();
		System.out.println("ѡ����Ҫ�޸ĵ����ݣ�1���� 2��ѧ�ɼ� 3���ĳɼ� 4Ӣ��ɼ�");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("�����ָ�Ϊ��");
			name = sc.next();
			break;
		case 2:
			System.out.println("���ɼ���Ϊ��");
			c = sc.nextInt();
			break;
		case 3:
			System.out.println("���ɼ���Ϊ��");
			c = sc.nextInt();
			break;
		case 4:
			System.out.println("���ɼ���Ϊ��");
			c = sc.nextInt();
			break;
			default:
			{
				System.out.println("�������4");
			}
		}
		while(it.hasNext())
		{
			Student s = (Student) it.next();
			if(s.num == id)
			{
				switch(choice)
				{
				case 1:
					s.name = name ;
					break;
				case 2:
					s.math = c;
					break;
				case 3:
					s.chinese = c;
					break;
				case 4:
					s.english = c;
					break;
				}
				break;
			}
		}
		save();
		
	}
	private static void add()
	{
		// TODO Auto-generated method stub
		System.out.print("����ѧ�ţ�");
		int n = sc.nextInt();
		System.out.print("��������");
		String na = sc.next();
		System.out.print("����Ӣ��ɼ�");
		int e = sc.nextInt();
		System.out.print("������ѧ�ɼ�");
		int ma = sc.nextInt();
		System.out.print("�������ĳɼ�");
		int c = sc.nextInt();
		stu.add(new Student(n,na,e,ma,c));
		save();
	}
}
