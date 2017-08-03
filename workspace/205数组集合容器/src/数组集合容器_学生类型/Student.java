package 数组集合容器_学生类型;

public class Student
{
	int ID;
	String name;
	int age;
	public Student(int iD, String name, int age)
	{
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}
	public Student(int iD)
	{
		this.ID = iD;
	}
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return ID+","+name+","+age;
	}
}
