package 封装和隐藏;

import java.util.Scanner;

public class AddressBookManager
{
	
	static Scanner sc = new Scanner(System.in);
	static int q;
	
	

	public static void main(String[] args)
	{
		while (true)
		{
			System.out.println("0添加学生信息   1打印学生信息  2修改学生成绩  3删除学生成绩  4查询学生成绩  5查询补考学生");
			int k = sc.nextInt();
			switch (k)
			{
			case 0:
				addinfor();
				break;
			case 1:
				type();
				break;
			case 2:
				change();
				break;
			case 3:
				del();
				break;
			case 4:
				search();
				break;							
			default:
				System.out.println("请输入正确指令");
			}
		}
	}

	// 添加学生信息
	static void addinfor()
	{
		System.out.print("输入姓名和手机号，中间以空格分隔");
		String name = sc.next();
		String num = sc.next();
		AddressCard ad = new AddressCard("name","num");
		AddressBook ab = new AddressBook("name","num");
	}

	// 打印学生信息
	static void type()
	{
		System.out.println("学号   英语      数学     语文");
		
	}

	// 修改学生信息
	static void change()
	{

		System.out.println("选择需要修改的学生的学号");
	
		
	}

	// 删除学生信息
	static void del()
	{
		
		System.out.println("删除完成");
	}

	// 查询某个学号的成绩
	static void search()
	{
		

		System.out.println();
	}



}
