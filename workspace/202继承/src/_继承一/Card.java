package _�̳�һ;


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
		System.out.println("��"+i);

		this.money +=i;
	}
	void takeMoney(int i)
	{
		System.out.println("ȡ"+i);
		if(money>=i)
		{
		this.money -=i;
		}
		else
		{System.out.println("����");}
	}
	void print()
	{
		System.out.println(this.money);
	}
}
