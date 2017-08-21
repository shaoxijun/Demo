package _1枚举类型;

public enum Light
{
	GREEN("绿色") ,RED("红色"),YELLOW("黄色");
	private Light(String n)
	{
		this.name = n;
	}
	private String name;
	public String getName()
	{
		return name;
	}
}
