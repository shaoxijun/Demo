package _�̳�һ;

public class CreditCard extends Card
{
	int credit;
	@Override
	void takeMoney(int i)
	{
		System.out.println("ȡ"+i);
		if(money+credit>=i)
		{
			this.money -=i;
		}
		else
		{System.out.println("��Ȳ���");}
	}
	
}
