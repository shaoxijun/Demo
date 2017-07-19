package _¼Ì³ÐÒ»;


public class Card
{
	int money;
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
		this.money +=i;
	}
	void takeMoney(int i)
	{
		this.money -=i;
	}
	void print()
	{
		System.out.println(this.money);
	}
}
