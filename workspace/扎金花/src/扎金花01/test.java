package 扎金花01;

public class test
{
	public static void main(String[] args)
	{
		Card card1 = new Card();
		card1.allcard();
		Player p1 = new Player("刘德华");
		Player p2 = new Player("周润发");
		Player p3 = new Player("赌神");
		Player p4 = new Player("赌侠");
		
				p1.palycard();
				p2.palycard();
				p3.palycard();
				p4.palycard();
//				p1.card.print();
	}
}
