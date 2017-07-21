package _1接口一;

public class Man implements IBoyfriendAble
{
	private String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public Man(String name)
	{
		super();
		this.name = name;
	}

	public Man()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void goStreet()
	{
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"和女朋友逛街去了");
	}

	@Override
	public void watchFilm()
	{
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"和女朋友看电影去了");
	}

	@Override
	public void cook()
	{
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"买菜做饭去了");
	}

}
