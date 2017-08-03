package Ôú½ð»¨01;


public class Player extends Card
{
	String name;
	String sex;
	Card card1;
//	LinkedList<Card> card;

	public Player(String name)
	{
		super();
		this.name = name;
	}

	String deal(LinkedList<Card> card)
	{
		int p;
		int i =0;
		String result = "";
	
		p = (int)(Math.random()*(52-i)+1);
		int q = p ;	
//		System.out.println(q);
		result += card1.card.findIndex(q) +",";	
		card1.card.indexDelet(q);
		i++;		
		return result;
	}
	public void palycard()
	{		
		System.out.print(this.name+", "+this.deal(card));
		
	}
	
	public void check()
	{
		
	}
}
