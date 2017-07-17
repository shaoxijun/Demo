package ·â×°ºÍÒş²Ø;

public class Monster
{
	private int Hp;
	private String monster;
	public int getHp()
	{
		return Hp;
	}
	public void setHp(int hp)
	{
		Hp = hp;
	}
	public String getMonster()
	{
		return monster;
	}
	public void setMonster(String monster)
	{
		this.monster = monster;
	}
	public Monster( int Hp,String monster)
	{
		super();
		this.Hp = Hp;
		this.monster = monster;
	}
	public Monster()
	{
		
	}
	public void attack(Hero h)
	{
		double i = Math.random()*5+5;
		int mhp = h.getHp();
		mhp -=i;
		h.setHp(mhp);
		System.out.println("Ò°Öí¹¥»÷ÁËĞ¡Ã÷£¬Ğ¡Ã÷µôÑª"+i);
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
