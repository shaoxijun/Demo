package _01信息管理系统.copy;

import java.io.Serializable;

public class Student implements Serializable
{
	// 属性
	
	int id;
	String name;
	int chinese;
	int math;
	int english;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getChinese()
	{
		return chinese;
	}
	public void setChinese(int chinese)
	{
		this.chinese = chinese;
	}
	public int getMath()
	{
		return math;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public int getEnglish()
	{
		return english;
	}
	public void setEnglish(int english)
	{
		this.english = english;
	}
	
	
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int chinese, int math, int english)
	{
		super();
		this.id = id;
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	@Override
	public String toString()
	{
		return id + "\t" + name + "\t" + chinese + "\t" + math + "\t"
				+ english+"\t"+getTotal();
	}
	
	public int getTotal()
	{
		return chinese+math+english;
	}
	
	

}
