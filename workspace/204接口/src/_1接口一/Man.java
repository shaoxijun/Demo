package _1�ӿ�һ;

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
		System.out.println(this.getName()+"��Ů���ѹ��ȥ��");
	}

	@Override
	public void watchFilm()
	{
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"��Ů���ѿ���Ӱȥ��");
	}

	@Override
	public void cook()
	{
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"�������ȥ��");
	}

}
