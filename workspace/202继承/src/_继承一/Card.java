package _¼Ì³ÐÒ»;


public class Card
{
	public int money;
	String id;
	String password;
	public Card()
	{}
	public Card(int balance, String count, String passwd)
	{
		super();
		this.money = balance;
		this.id = count;
		this.password = passwd;
	}
	void saveMoney(int i)
	{
		System.out.println("´æ"+i);

		this.money +=i;
	}
	void takeMoney(int i)
	{
		System.out.println("È¡"+i);
		if(money>=i)
		{
		this.money -=i;
		}
		else
		{System.out.println("Óà¶î²»×ã");}
	}
	void print()
	{
		System.out.println(this.money);
	}
}
