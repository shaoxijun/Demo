package _01��Ϣ����ϵͳ;

import java.util.*;

public class _00Test
{
	static Map<Long,Student> m = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{

		m.put(10001l, new Student("����",98,34,89));
		m.put(10002l, new Student("����",97,54,79));
		m.put(10003l, new Student("����",56,90,99));
		m.put(10004l, new Student("����",100,84,81));
		m.put(10005l, new Student("����",98,49,82));
		m.put(10006l, new Student("С��",98,99,89));
		
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
		System.out.print("����ѧ�ţ�������Ӣ��ɼ�����ѧ�ɼ������ĳɼ����м��Կո��������");
		long n = sc.nextLong();
		String na = sc.next();
		int e = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		_00Test.m.put(n, new Student(na,e,m,c));
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
