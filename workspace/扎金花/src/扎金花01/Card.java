package ����01;

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
			c[0] = new Card("�ݻ�","A");
			c[1] = new Card("�ݻ�","2");
			c[2] = new Card("�ݻ�","3");
			c[3] = new Card("�ݻ�","4");
			c[4] = new Card("�ݻ�","5");
			c[5] = new Card("�ݻ�","6");
			c[6] = new Card("�ݻ�","7");
			c[7] = new Card("�ݻ�","8");
			c[8] = new Card("�ݻ�","9");
			c[9] = new Card("�ݻ�","10");
			c[10] = new Card("�ݻ�","J");
			c[11] = new Card("�ݻ�","Q");
			c[12] = new Card("�ݻ�","K");	
			
			c[13] = new Card("����","A");	
			c[14] = new Card("����","2");
			c[15] = new Card("����","3");
			c[16] = new Card("����","4");
			c[17] = new Card("����","5");
			c[18] = new Card("����","6");
			c[19] = new Card("����","7");
			c[20] = new Card("����","8");
			c[21] = new Card("����","9");
			c[22] = new Card("����","10");
			c[23] = new Card("����","J");
			c[24] = new Card("����","Q");
			c[25] = new Card("����","K");
			
			c[26] = new Card("����","A");
			c[27] = new Card("����","2");
			c[28] = new Card("����","3");
			c[29] = new Card("����","4");
			c[30] = new Card("����","5");
			c[31] = new Card("����","6");
			c[32] = new Card("����","7");
			c[33] = new Card("����","8");
			c[34] = new Card("����","9");
			c[35] = new Card("����","10");
			c[36] = new Card("����","J");
			c[37] = new Card("����","Q");
			c[38] = new Card("����","K");
			
			c[39] = new Card("����","A");
			c[40] = new Card("����","2");
			c[41] = new Card("����","3");
			c[42] = new Card("����","4");
			c[43] = new Card("����","5");
			c[44] = new Card("����","6");
			c[45] = new Card("����","7");
			c[46] = new Card("����","8");
			c[47] = new Card("����","9");
			c[48] = new Card("����","10");
			c[49] = new Card("����","J");
			c[50] = new Card("����","Q");
			c[51] = new Card("����","K");

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
