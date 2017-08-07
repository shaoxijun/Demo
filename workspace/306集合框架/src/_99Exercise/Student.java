package _99Exercise;

public class Student implements Comparable
{
	// 6. 定义一个Student类，并使用List容器存放以下数据
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
		return  num + ", 姓名" + name + ", 英语=" + english + ", 数学=" + math + ", 语文="
				+ chinese ;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object a)
	{
		Student s = (Student)a;
		int ssum = s.chinese+s.math+s.english;
		int tsum = this.chinese+this.math+this.english;
		if(ssum > tsum)
		{
			return 1;
		}else if(ssum < tsum)
		{
			return -1;
		}else
		{
			if(s.chinese > this.chinese)
			{
				return 1;
			}else if(s.chinese < this.chinese)
			{
				return -1;
			}else
			{
				if(s.math > this.math)
				{
					return 1;
				}else if(s.math < this.math)
				{
					return -1;
				}else
				{
					if(s.num > this.num)
					{
						return 1;
					}else if(s.num < this.num)
					{
						return -1;
					}else
					{
						return 0;
					}
				}
			}
		}
	}
	
}
