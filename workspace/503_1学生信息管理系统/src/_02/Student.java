package _02;

import java.io.Serializable;
import java.util.*;

public class Student implements Serializable
{
	// ѧ�� ���� Ӣ�� ��ѧ ����
	// 10001 ���� 98 34 89
	// 10002 ���� 75 78 89
	// 10003 ���� 38 82 100
	// 10004 ���� 87 86 75
	// 10005 С�� 29 100 98
	// 10006 �ܲ� 87 65 100
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
		return num + ", ����" + name + ", Ӣ��ɼ�" + english + ", ��ѧ�ɼ�" + math + ", ���ĳɼ�"
				+ chinese + ", �ܷ�"+(sum = english + math + chinese );
	}


	
}
