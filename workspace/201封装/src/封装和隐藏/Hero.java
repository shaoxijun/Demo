package ·â×°ºÍÒş²Ø;

public class Hero
{
	private int Hp;
	private String hero;
	public int getHp()
	{
		return Hp;
	}
	public void setHp(int hp)
	{
		Hp = hp;
	}
	public String getHero()
	{
		return hero;
	}
	public void setHero(String hero)
	{
		this.hero = hero;
	}
	public Hero( int Hp,String hero)
	{
		super();
		this.Hp = Hp;
		this.hero = hero;
	}	
	public Hero()
	{}
	public void attack(Monster m)
	{
		double i = Math.random()*10+10;
		int mhp = m.getHp();
		mhp -=i;
		m.setHp(mhp);
		System.out.println("Ğ¡Ã÷¹¥»÷ÁËÒ°Öí¹Ö£¬Ò°ÖíµôÑª"+i);
	}
	public boolean isAlive()
	{
		boolean i = false;
		if(this.Hp>0)
		{
			i = true;
		}
		return i;
		
	}
}
