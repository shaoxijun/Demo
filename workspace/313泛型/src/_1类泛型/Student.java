package _1Àà·ºÐÍ;

public class Student
{
	long ID;
	String name;
	int age;
	public Student(long iD, String name, int age)
	{
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}
	public Student(long iD)
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
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
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
		if (ID != other.ID)
			return false;
		return true;
	}
	
}
