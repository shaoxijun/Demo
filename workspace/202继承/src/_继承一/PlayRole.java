package _¼Ì³ÐÒ»;

public class PlayRole
{
	String name;
	int x;
	int y;
	
	public PlayRole(String name, int x, int y)
	{
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	void print(PlayRole a)
	{
		if(a.getClass() == Hero.class)
		{
			Hero h = (Hero)a;
			h.type();
		}
		if(a.getClass() == Princess.class)
		{
			Princess p = (Princess)a;
			p.type();
		}
		if(a.getClass() == Boss.class)
		{
			Boss b = (Boss)a;
			b.type();
		}
		if(a.getClass() == Monster.class)
		{
			Monster m = (Monster)a;
			m.type();

		}
		
	}
}
