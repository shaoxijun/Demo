package _¼Ì³ÐÒ»;

public class  Monster extends PlayRole
{

	public Monster(String name, int x, int y)
	{
		super(name, x, y);
		// TODO Auto-generated constructor stub
	}
	String weapon;
	void type()
	{
		System.out.println(name+" ×ø±ê"+this.x+"  "+this.y+"  "+this.weapon);
	}
}
