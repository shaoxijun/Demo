package _9Exercise;

public class Employee
{
	// 3. ����һ��Ա���� Ա����� ���� ����
			// ����һ��������������Ա������:
			// 10001 �ǲ�˹ ���۲�
			// 10002 �Ǵ� ���̲�
			// 10003 ���� �ͷ���
			// 10004 ���� ���ز�
			// �Ƴ�10001��ŵ�Ա�� ,��������ͬ����Ϊ��ͬһ���ˡ�
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
