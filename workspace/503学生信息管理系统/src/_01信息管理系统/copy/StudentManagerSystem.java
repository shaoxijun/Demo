package _01信息管理系统.copy;


import java.io.*;
import java.util.*;

public class StudentManagerSystem
{
	Scanner sc = new Scanner(System.in);

	// 选择一种容器保存你的数据
	ArrayList<Student> list;

	final static String FILE_PATH = "e:\\stus.txt";

	// 1. 主菜单
	// 2. 添加
	// 3. 删除
	// 4. 修改
	// 5. 查询
	public void start()
	{
		// 系统启动的时候，读取之前的存档
		read();
		
		// 是否要继续
		boolean con = true;

		do
		{
			// 显示菜单
			showMenu();

			// 让用户做出选择
			System.out.print("请输入你要做的操作:");
			int sel = sc.nextInt();

			switch (sel)
			{
			case 1:
				addInfo();
				break;
			case 2:
				printInfo();
				break;
			case 3:
				modifyInfo();
				break;
			case 4:
				delInfo();
				break;
			case 5:
				findInfo();
				break;
			case 6:
				find2Info();
				break;
			case 7:
				find3Info();
				break;				
			case 8:
				System.out.println("退出,欢迎再次光临");
				con = false;
				break;
			}

		} while (con);

	}

	private void find3Info()
	{
		// TODO Auto-generated method stub
		System.out.println("查询学生信息总分列表（从高到低）");
		
		ArrayList<Student> l = new ArrayList<>();
		l.addAll(list);
		
		// 使用Collections工具类中的sort方法进行
		Collections.sort(l, new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2)
			{
				// TODO Auto-generated method stub
				if(o1.getTotal()>o2.getTotal())
				{
					return -1;
				}
				else if(o1.getTotal()<o2.getTotal())
				{
					return 1;
				}
				return 0;
			}
		});
		
		System.out.println("===========================================");
		System.out.println("学号\t姓名\t语文\t数学\t英语\t总分");
		for (Student stu : l)
		{
			System.out.println(stu);
		}
		System.out.println("===========================================");
		
		
		
		
	}

	private void find2Info()
	{
		// TODO Auto-generated method stub
		System.out.println("查询不及格学生信息");

		
		Iterator<Student> it = list.iterator();
		boolean finded = false;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			if(s.chinese<60||s.math<60||s.english<60)
			{
				System.out.println("学号\t姓名\t语文\t数学\t英语\t总分");
				System.out.println(s);
				finded = true;
			}	
		}
		
		if(!finded)
		{
			System.out.println("没有不及格的学生");
		}
	}

	private void findInfo()
	{
		// TODO Auto-generated method stub

		System.out.println("查询学生信息");

		System.out.println("请输入要查询成绩的学生的学号:");
		int stuId = sc.nextInt();
		
		Iterator<Student> it = list.iterator();
		boolean finded = false;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			if(s.id == stuId)
			{
				System.out.println("学号\t姓名\t语文\t数学\t英语\t总分");
				System.out.println(s);
				finded = true;
				break;
			}	
		}
		
		if(!finded)
		{
			System.out.println("查无此人");
		}
		
	}

	private void delInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("删除学生信息");

		System.out.println("请删除要修改学生的学号:");
		int stuId = sc.nextInt();
		
		Iterator<Student> it = list.iterator();
		boolean deleted = false;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			if(s.id == stuId)
			{
				it.remove();
				deleted = true;
				save();
				break;
			}	
		}
		
		System.out.println(deleted? "删除成功":"删除失败");
		
	}

	private void modifyInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("修改学生信息");

		System.out.println("请输入要修改学生的学号:");
		int stuId = sc.nextInt();
		
		// 查找学生
		boolean modified = false;
		
		for(Student stu:list)
		{
			if(stu.id == stuId)
			{
				
				System.out.println("请输入学生姓名:");
				String name = sc.next();
				System.out.println("请输入学生语文成绩:");
				int chinese = sc.nextInt();
				System.out.println("请输入学生数学:");
				int math = sc.nextInt();
				System.out.println("请输入学生英语:");
				int english = sc.nextInt();
				stu.name = name;
				stu.chinese = chinese;
				stu.math = math;
				stu.english = english;

				// 保存一下
				save();
				
				modified = true;
				break;
			}
		}
		// 如果有，则修改
		// 没有则提示没有改学生
		if(!modified)
		{
			System.out.println("没有该学生");
		}
		
		
	}

	private void printInfo()
	{
		// TODO Auto-generated method stub

		System.out.println("===========================================");
		System.out.println("学号\t姓名\t语文\t数学\t英语\t总分");
		for (Student stu : list)
		{
			System.out.println(stu);
		}
		System.out.println("===========================================");
	}

	private void addInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("添加学生信息");

		System.out.println("请输入学生学号:");
		int stuId = sc.nextInt();
		System.out.println("请输入学生姓名:");
		String name = sc.next();
		System.out.println("请输入学生语文成绩:");
		int chinese = sc.nextInt();
		System.out.println("请输入学生数学:");
		int math = sc.nextInt();
		System.out.println("请输入学生英语:");
		int english = sc.nextInt();
		Student stu = new Student(stuId, name, chinese, math, english);
		list.add(stu);

		// 保存一下
		save();
	}

	private static void showMenu()
	{
		// TODO Auto-generated method stub
		System.out.println("欢迎来到xxx大学管理系统");
		System.out.println("1. 添加");
		System.out.println("2. 显示");
		System.out.println("3. 修改");
		System.out.println("4. 删除");
		System.out.println("5. 查询");
		System.out.println("6. 查询不及格");
		System.out.println("7. 查询总分");
		System.out.println("8. 退出");
	}

	// 保存数据
	public void save()
	{
		ObjectOutputStream out = null;
		try
		{
			out = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			out.writeObject(list);// 如果没有文件，创建一个新的文件，已有则是覆盖
		} catch (FileNotFoundException e)
		{
			System.out.println("存档没有找到");
		} catch (IOException e)
		{
			System.out.println("存档不能正常打开");
		}
		finally
		{
			if(out!=null)
			{
				try
				{
					out.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// 读取存档
	public void read()
	{
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream(new FileInputStream(FILE_PATH));
			list = (ArrayList<Student>)in.readObject();
		} catch (FileNotFoundException e)
		{
			System.out.println("存档没有找到");
		} catch (IOException e)
		{
			System.out.println("存档不能正常打开");
		} catch (ClassNotFoundException e)
		{
			System.out.println("存档中的数据异常");
		}
		finally
		{
			if(list==null) 
			{
				// 如果没有正常读取存档，我就创建一个空的容器
				list = new ArrayList<>();
			}
			if(in!=null)
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
		}

	}
}
