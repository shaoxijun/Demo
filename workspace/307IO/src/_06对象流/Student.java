package _06¶ÔÏóÁ÷;
import java.io.*;
public class Student implements Serializable
{
	int id;
	String name;
	int age;
	transient boolean sex;
	
	public Student(int id, String name, int age, boolean sex)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
