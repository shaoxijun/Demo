package _01��Ϣ����ϵͳ;

import java.util.*;

public class Student implements Comparable
{
	// ѧ�� ���� Ӣ�� ��ѧ ����
	// 10001 ���� 98 34 89
	// 10002 ���� 75 78 89
	// 10003 ���� 38 82 100
	// 10004 ���� 87 86 75
	// 10005 С�� 29 100 98
	// 10006 �ܲ� 87 65 100
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
		return num + ", ����" + name + ", Ӣ��ɼ�" + english + ", ��ѧ�ɼ�" + math + ", ���ĳɼ�"
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
