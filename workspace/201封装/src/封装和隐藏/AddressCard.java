package ��װ������;

public class AddressCard
{
	// 2. ��дһ����ϵ���࿨ƬAddressCard(����,�绰����)
			// ��װ �ṩSetter Getter���� ���ṩ���췽����toString����
	private String name;
	private long num;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public long getNum()
	{
		return num;
	}
	public void setNum(long num)
	{
		this.num = num;
	}
	public AddressCard(String name, long num)
	{
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return name+"  "+getNum();
	}
}
