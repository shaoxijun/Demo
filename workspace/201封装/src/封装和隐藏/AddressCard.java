package 封装和隐藏;

public class AddressCard
{
	// 2. 编写一个联系人类卡片AddressCard(名字,电话号码)
			// 封装 提供Setter Getter方法 ，提供构造方法、toString方法
	private String name;
	private String num;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getNum()
	{
		return num;
	}
	public void setNum(String num)
	{
		this.num = num;
	}
	public AddressCard(String name, String num)
	{
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return " 姓名：  "+name+" 手机： "+getNum();
	}
}
