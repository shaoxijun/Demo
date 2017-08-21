package _01信息管理系统;

import java.util.*;

public class _00Test
{
	static Map<Long,Student> m = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{

		m.put(10001l, new Student("张三",98,34,89));
		m.put(10002l, new Student("李四",97,54,79));
		m.put(10003l, new Student("王五",56,90,99));
		m.put(10004l, new Student("赵六",100,84,81));
		m.put(10005l, new Student("赵云",98,49,82));
		m.put(10006l, new Student("小乔",98,99,89));
		
		// 2. 编写学生程序管理系统2.0，采用集合容器
		// 学号 名字 英语 数学 语文
		// 10001 张三 98 34 89
		// 10002 李四 75 78 89
		// 10003 王五 38 82 100
		// 10004 赵六 87 86 75
		// 10005 小乔 29 100 98
		// 10006 曹操 87 65 100
		// 提供一下交互功能
		// 1. 添加学生
		// 2. 修改学生信息
		// 3. 删除学生
		// 4. 查询
		// 4.1 查询某学号学生成绩
		// 4.2 查询补考名单
		// 4.3 查询不需要补考名单
		// 4.4 按照总分列出学生
		
		while(true)
		{
			System.out.println("请选择你要的操作：1 添加学生信息  2修改学生信息 3删除学生 4 查询");
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
					System.out.println("输入有误");
				}
			}
		}



	}
	// 提供一下交互功能
	// 1. 添加学生
	public static void add()
	{
		System.out.print("输入学号，姓名，英语成绩，数学成绩，语文成绩，中间以空格键隔开：");
		long n = sc.nextLong();
		String na = sc.next();
		int e = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		_00Test.m.put(n, new Student(na,e,m,c));
	}
	// 2. 修改学生信息
	public static void change()
	{
		System.out.print("请输入你要修改学生的学号：");
		long num = sc.nextLong();
		System.out.println("选择要修改的项目:1 姓名 2 英语成绩 3数学成绩 4语文成绩");
		int x =sc.nextInt();
		switch(x)
		{
		case 1:
			System.out.print("将姓名修改为：");
			String cn = sc.next();
			m.get(num).name = "cn";
			break;
		case 2:
			System.out.print("将英语成绩修改为：");
			int ce = sc.nextInt();
			m.get(num).english = ce;
			break;
		case 3:
			System.out.print("将数学成绩修改为：");
			int cm = sc.nextInt();
			m.get(num).english = cm;
			break;
		case 4:
			System.out.print("将语文成绩修改为：");
			int cc = sc.nextInt();
			m.get(num).english = cc;
			break;
			default:
			{
				System.out.println("输入有误");
			}
		}
	}
	// 3. 删除学生
	public static void delet()
	{
		System.out.println("请输入要删除学生的学号：");
		long ld = sc.nextLong();
		if(m.remove(ld) == null)
		{
			System.out.println("删除成功");
		}else
		{
			System.out.println("删除失败，请重新操作。");
		}
	}
	// 4. 查询
	public static void find()
	{
		System.out.println("选择你需要的操作：1查询某学号学生的成绩 2 查询补考名单 3查询不需要补考的名单 4按照总分列出学生");
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
				System.out.println("输入有误");
			}
		}
	}
			// 4.1 查询某学号学生成绩
	public static void find1()
	{
		System.out.print("请输入学号：");
		long f41 = sc.nextLong();
		System.out.println(m.get(f41));
	}
			// 4.2 查询补考名单
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
			// 4.3 查询不需要补考名单
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
			// 4.4 按照总分列出学生
	public static void find4()
	{
		for(long s:m.keySet())
		{
			System.out.println(" "+s+m.get(s));
		}
	}
}
