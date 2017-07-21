package _继承一;

public class CreditCard extends Card
{
	int credit;
	@Override
	void takeMoney(int i)
	{
		System.out.println("取"+i);
		if(money+credit>=i)
		{
			this.money -=i;
		}
		else
		{System.out.println("额度不足");}
	}
	
}
