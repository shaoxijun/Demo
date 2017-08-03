package Ôú½ğ»¨01;

public class Card
{
	
	String color,size;

	@Override
	public String toString()
	{
		return color+size;
	}

	public Card(String color, String size)
	{
		super();
		this.color = color;
		this.size = size;
	}

	public Card()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	LinkedList<Card> card= new LinkedList<>();
	Card[] c = new Card[52];
	void allcard()
	{
			c[0] = new Card("²İ»¨","A");
			c[1] = new Card("²İ»¨","2");
			c[2] = new Card("²İ»¨","3");
			c[3] = new Card("²İ»¨","4");
			c[4] = new Card("²İ»¨","5");
			c[5] = new Card("²İ»¨","6");
			c[6] = new Card("²İ»¨","7");
			c[7] = new Card("²İ»¨","8");
			c[8] = new Card("²İ»¨","9");
			c[9] = new Card("²İ»¨","10");
			c[10] = new Card("²İ»¨","J");
			c[11] = new Card("²İ»¨","Q");
			c[12] = new Card("²İ»¨","K");	
			
			c[13] = new Card("ºÚÌÒ","A");	
			c[14] = new Card("ºÚÌÒ","2");
			c[15] = new Card("ºÚÌÒ","3");
			c[16] = new Card("ºÚÌÒ","4");
			c[17] = new Card("ºÚÌÒ","5");
			c[18] = new Card("ºÚÌÒ","6");
			c[19] = new Card("ºÚÌÒ","7");
			c[20] = new Card("ºÚÌÒ","8");
			c[21] = new Card("ºÚÌÒ","9");
			c[22] = new Card("ºÚÌÒ","10");
			c[23] = new Card("ºÚÌÒ","J");
			c[24] = new Card("ºÚÌÒ","Q");
			c[25] = new Card("ºÚÌÒ","K");
			
			c[26] = new Card("ºìÌÒ","A");
			c[27] = new Card("ºìÌÒ","2");
			c[28] = new Card("ºìÌÒ","3");
			c[29] = new Card("ºìÌÒ","4");
			c[30] = new Card("ºìÌÒ","5");
			c[31] = new Card("ºìÌÒ","6");
			c[32] = new Card("ºìÌÒ","7");
			c[33] = new Card("ºìÌÒ","8");
			c[34] = new Card("ºìÌÒ","9");
			c[35] = new Card("ºìÌÒ","10");
			c[36] = new Card("ºìÌÒ","J");
			c[37] = new Card("ºìÌÒ","Q");
			c[38] = new Card("ºìÌÒ","K");
			
			c[39] = new Card("·½¿é","A");
			c[40] = new Card("·½¿é","2");
			c[41] = new Card("·½¿é","3");
			c[42] = new Card("·½¿é","4");
			c[43] = new Card("·½¿é","5");
			c[44] = new Card("·½¿é","6");
			c[45] = new Card("·½¿é","7");
			c[46] = new Card("·½¿é","8");
			c[47] = new Card("·½¿é","9");
			c[48] = new Card("·½¿é","10");
			c[49] = new Card("·½¿é","J");
			c[50] = new Card("·½¿é","Q");
			c[51] = new Card("·½¿é","K");

		for(int i=0;i<52;i++)
		{
			card.add(c[i]);
		}
//		String result = "";
//		for(int i=0;i<3;i++)
//		{
//			p = (int)(Math.random()*(52-i)+1);
//			int q = p ;			
//			result += card.findIndex(q) +",";
//			card.indexDelet(q);
//			
//		}
//		return result;
	}
}
