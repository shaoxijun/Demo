package _01信息管理系统;

import java.util.*;

public class Student implements Comparable
{
	// 学号 名字 英语 数学 语文
	// 10001 张三 98 34 89
	// 10002 李四 75 78 89
	// 10003 王五 38 82 100
	// 10004 赵六 87 86 75
	// 10005 小乔 29 100 98
	// 10006 曹操 87 65 100
	long num;
	String name;
	int english;
	int math;
	int chinese;
	Scanner sc = new Scanner(System.in);
	public Student( String name, int english, int math, int chinese)
	{
		super();
		this.name = name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return num + ", 姓名" + name + ", 英语成绩" + english + ", 数学成绩" + math + ", 语文成绩"
				+ chinese ;
	}
	@Override
	public int compareTo(Object a)
	{
		Student stu = (Student)a;
		int sum = this.math+this.chinese+this.english;
		int sum1 = stu.math+stu.english+stu.chinese;
		if(sum<sum1)
		{
			return -1;
		}else if(sum>sum1)
		{
			return 1;
		}return 0;
	}

	
}
