package _9Exercise;

public class Employee
{
	// 3. 定义一个员工类 员工编号 姓名 部门
			// 创建一个容器，将以下员工放入:
			// 10001 乔布斯 销售部
			// 10002 盖茨 工程部
			// 10003 赵云 客服部
			// 10004 貂蝉 公关部
			// 移除10001编号的员工 ,如果编号相同。认为是同一个人。
	int num;
	String name;
	String department;
	public Employee(int num, String name, String department)
	{
		super();
		this.num = num;
		this.name = name;
		this.department = department;
	}
	
	@Override
	public String toString()
	{
		return  num + "," + name + "," + department ;
	}

	public Employee()
	{
		super();
		// TODO Auto-generated constructor stub
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
		Employee other = (Employee) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
