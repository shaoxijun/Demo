package 扎金花03;

public class Test
{

	public static void main(String[] args)
	{
		Player p1 = new Player("刘德华");
		Player p2 = new Player("周润发");
		Player p3 = new Player("周星驰");
		Poker poker = new Poker();
		poker.deal(p1);
		poker.deal(p2);
		poker.deal(p3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
