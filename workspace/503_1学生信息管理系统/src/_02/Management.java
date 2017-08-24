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
		// 提供一下交互功能
		// 1. 添加学生
		// 2. 修改学生信息
		// 3. 删除学生
		// 4. 查询
		// 4.1 查询某学号学生成绩
		// 4.2 查询补考名单
		// 4.3 查询不需要补考名单
		// 4.4 按照总分列出学生
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
			System.out.println("没有发现文档");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("空文档");
		}
		try
		{
			if(out != null)
			out.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("关");
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
			System.out.println("没有发现文档");
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("流错误");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("空文档");
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
			System.out.print("请选择你要的操作：1 添加学生信息  2修改学生信息 3删除学生 4 查询");
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
	private static void find()
	{
		// TODO Auto-generated method stub
		System.out.println("请选择你需要的操作1查询某学号学生的成绩 2查询补考名单 3查询不需要补考的名单 4按总分列出学生");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("请输入学号");
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
				System.out.println("输入错误");
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
		System.out.println("请输入你要删除学生信息的学号");
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
		System.out.println("输入你要修改学生的学号");
		int id = sc.nextInt();
		System.out.println("选择你要修改的内容：1名字 2数学成绩 3语文成绩 4英语成绩");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("将名字改为：");
			name = sc.next();
			break;
		case 2:
			System.out.println("将成绩改为：");
			c = sc.nextInt();
			break;
		case 3:
			System.out.println("将成绩改为：");
			c = sc.nextInt();
			break;
		case 4:
			System.out.println("将成绩改为：");
			c = sc.nextInt();
			break;
			default:
			{
				System.out.println("输入错误4");
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
		System.out.print("输入学号：");
		int n = sc.nextInt();
		System.out.print("输入姓名");
		String na = sc.next();
		System.out.print("输入英语成绩");
		int e = sc.nextInt();
		System.out.print("输入数学成绩");
		int ma = sc.nextInt();
		System.out.print("输入语文成绩");
		int c = sc.nextInt();
		stu.add(new Student(n,na,e,ma,c));
		save();
	}
}
