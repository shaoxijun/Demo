package _02;

import java.io.Serializable;
import java.util.*;

public class Student implements Serializable
{
	// 学号 名字 英语 数学 语文
	// 10001 张三 98 34 89
	// 10002 李四 75 78 89
	// 10003 王五 38 82 100
	// 10004 赵六 87 86 75
	// 10005 小乔 29 100 98
	// 10006 曹操 87 65 100
	int num;
	String name;
	int english;
	int math;
	int chinese;
	int sum ;
	
	public Student(int num, String name, int english, int math, int chinese)
	{
		super();
		this.num = num;
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
				+ chinese + ", 总分"+(sum = english + math + chinese );
	}


	
}
