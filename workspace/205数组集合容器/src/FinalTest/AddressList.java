package FinalTest;

public class AddressList
{
	String name;
	String tel;
	String address;
	public AddressList(String name, String tel, String address)
	{
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public AddressList(String name, String tel)
	{
		super();
		this.name = name;
		this.tel = tel;
	}
	public AddressList()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "姓名：" + name + ", 电话：" + tel + ", 地址：" + address ;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
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
		AddressList other = (AddressList) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tel == null)
		{
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
	
}
