package _01��Ϣ����ϵͳ;

import java.util.*;
import java.io.*;

public class _00Test
{
	static Map<Long,Student> m = new HashMap() ;
	static LinkedList<Student> stu ;
	static Scanner sc = new Scanner(System.in);
	static final String PATH = "f:\\aa.txt";
	public static void main(String[] args)
	{

//		m.put(10001l, new Student("����",98,34,89));
//		m.put(10002l, new Student("����",97,54,79));
//		m.put(10003l, new Student("����",56,90,99));
//		m.put(10004l, new Student("����",100,84,81));
//		m.put(10005l, new Student("����",98,49,82));
//		m.put(10006l, new Student("С��",98,99,89));
//		
		// 2. ��дѧ���������ϵͳ2.0�����ü�������
		// ѧ�� ���� Ӣ�� ��ѧ ����
		// 10001 ���� 98 34 89
		// 10002 ���� 75 78 89
		// 10003 ���� 38 82 100
		// 10004 ���� 87 86 75
		// 10005 С�� 29 100 98
		// 10006 �ܲ� 87 65 100
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
			out.writeObject(m);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read()
	{
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream(new FileInputStream(PATH));
			m = (Map<Long, Student>) in.readObject();
			
		}  catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("�浵�����쳣");
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			File f = new File(PATH);
			try
			{
				f.createNewFile();
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			System.out.println("�ĵ�·������");
		} catch (IOException e)
		{
//			 TODO Auto-generated catch block
			System.out.println("�ĵ�Ϊ��");
		}
		finally
		{
			
			if(in != null)
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
			System.out.println(m);
			for(Long i:m.keySet())
			{
				System.out.println(""+i+m.get(i));
			}
					
		}
		
	}
	


	public static void showMenu()
	{
		while(true)
		{
			System.out.println("��ѡ����Ҫ�Ĳ�����1 ���ѧ����Ϣ  2�޸�ѧ����Ϣ 3ɾ��ѧ�� 4 ��ѯ");
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
	// �ṩһ�½�������
	// 1. ���ѧ��
	public static void add()
	{
		System.out.print("����ѧ�ţ�������Ӣ��ɼ�����ѧ�ɼ������ĳɼ���");
		long n = sc.nextLong();
		System.out.println("��������");
		String na = sc.next();
		System.out.println("����Ӣ��ɼ�");
		int e = sc.nextInt();
		System.out.println("������ѧ�ɼ�");
		int ma = sc.nextInt();
		System.out.println("�������ĳɼ�");
		int c = sc.nextInt();
		m.put(n, new Student(na,e,ma,c));
		save();
	}
	// 2. �޸�ѧ����Ϣ
	public static void change()
	{
		System.out.print("��������Ҫ�޸�ѧ����ѧ�ţ�");
		long num = sc.nextLong();
		System.out.println("ѡ��Ҫ�޸ĵ���Ŀ:1 ���� 2 Ӣ��ɼ� 3��ѧ�ɼ� 4���ĳɼ�");
		int x =sc.nextInt();
		switch(x)
		{
		case 1:
			System.out.print("�������޸�Ϊ��");
			String cn = sc.next();
			m.get(num).name = "cn";
			break;
		case 2:
			System.out.print("��Ӣ��ɼ��޸�Ϊ��");
			int ce = sc.nextInt();
			m.get(num).english = ce;
			break;
		case 3:
			System.out.print("����ѧ�ɼ��޸�Ϊ��");
			int cm = sc.nextInt();
			m.get(num).english = cm;
			break;
		case 4:
			System.out.print("�����ĳɼ��޸�Ϊ��");
			int cc = sc.nextInt();
			m.get(num).english = cc;
			break;
			default:
			{
				System.out.println("��������");
			}
		}
	}
	// 3. ɾ��ѧ��
	public static void delet()
	{
		System.out.println("������Ҫɾ��ѧ����ѧ�ţ�");
		long ld = sc.nextLong();
		if(m.remove(ld) == null)
		{
			System.out.println("ɾ���ɹ�");
		}else
		{
			System.out.println("ɾ��ʧ�ܣ������²�����");
		}
	}
	// 4. ��ѯ
	public static void find()
	{
		System.out.println("ѡ������Ҫ�Ĳ�����1��ѯĳѧ��ѧ���ĳɼ� 2 ��ѯ�������� 3��ѯ����Ҫ���������� 4�����ܷ��г�ѧ��");
		int f4 = sc.nextInt();
		switch(f4)
		{
			case 1:
				find1();
				break;
			case 2:
				find2();
				break;
			case 3:
				find3();
				break;
			case 4:
				find4();
				break;
			default:
			{
				System.out.println("��������");
			}
		}
	}
			// 4.1 ��ѯĳѧ��ѧ���ɼ�
	public static void find1()
	{
		System.out.print("������ѧ�ţ�");
		long f41 = sc.nextLong();
		System.out.println(m.get(f41));
	}
			// 4.2 ��ѯ��������
	public static void find2()
	{
		Set<Long> sl = m.keySet();
		for(Long l:sl)
		{
			if(m.get(l).chinese<60||m.get(l).math<60||m.get(l).english<60)
			{
				System.out.println(l+","+m.get(l));
			}
		}
//		Collection<Student> v = m.values();
//		for(Student s:m.values())
//		{
//			if(s.chinese<60||s.english<60||s.math<60)
//			{
//				System.out.println(s);
//			}
//		}
	}
			// 4.3 ��ѯ����Ҫ��������
	public static void find3()
	{
		Set<Long> sl = m.keySet();
		for(Long l:sl)
		{
			if(m.get(l).chinese>=60||m.get(l).math>=60||m.get(l).english>=60)
			{
				System.out.println(l+","+m.get(l));
			}
		}
		
//		Collection<Student> v = m.values();
//		for(Student s:m.values())
//		{
//			if(s.chinese>=60||s.english>=60||s.math>=60)
//			{
//				System.out.println(s);
//			}
//		}
	}
			// 4.4 �����ܷ��г�ѧ��
	public static void find4()
	{
		for(long s:m.keySet())
		{
			System.out.println(" "+s+m.get(s));
		}
	}
}
