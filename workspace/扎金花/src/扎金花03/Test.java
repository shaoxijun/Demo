package ����03;

public class Test
{

	public static void main(String[] args)
	{
		Player p1 = new Player("���»�");
		Player p2 = new Player("����");
		Player p3 = new Player("���ǳ�");
		Poker poker = new Poker();
		poker.deal(p1);
		poker.deal(p2);
		poker.deal(p3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
