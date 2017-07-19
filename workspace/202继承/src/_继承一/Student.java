package _继承一;

public class Student extends Person
{
	String num;
	
	public Student(String name, int age, String num)
	{
		super(name, age);
		this.num = num;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		if (num == null)
		{
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	void listenLesson()
	{
		System.out.println("学生  "+name+"在听课");
	}
	void LOL()
	{
		System.out.println("学生  "+name+"在打LOL");
	}
	void code()
	{
		System.out.println("学生  "+name+"在敲代码");
	}
	

}
