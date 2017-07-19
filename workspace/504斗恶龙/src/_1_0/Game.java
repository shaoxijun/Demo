package _1_0;

import java.util.Scanner;

import _1_3.Monster;

public class Game
{
	boolean win = false;
	boolean lose = false;
	Hero hero;
	Princess ps;
	Monster m1;
	Monster m2;
	Monster m3;
	public int N = 10;
	Scanner sc = new Scanner(System.in);
	
	 Game()
	{
		hero = new Hero("���»�",5,5);
		ps = new Princess("�����",3,6);
		m1 = new Monster("Ұ��һ��",1,3);
		m2 = new Monster("Ұ�����",9,6);
		m3 = new Monster("Ұ������",9,9);
	}
	
	void play()
	{
		while(true)
		{	
			printMap();			
			controlHero();
			if(win)
			{System.out.println("��Ϸ�ɹ�");break;}	
//			ps.psmove(ps.direction());
//			m1.monMove(m1.direction());
//			m2.monMove(m2.direction());
//			m3.monMove(m3.direction());
//			if(lose)
			{System.out.println("��Ϸʧ�ܣ��㱻�����");break;}
			
			
		}
	}

	  void controlHero()
	{
		// TODO Auto-generated method stub
		System.out.println("�����뷽�򣺣�w���� a���� s���� d���ң�");
		char d = sc.nextLine().charAt(0);
		hero.heroMove(d);
		if(hero.getX()==ps.getX()&&hero.getY()==ps.getY())
		{win = true;}
		if(m1.getX()==hero.getX()&&m1.getY()==hero.getY())
			{lose = true;}
		if(m2.getX()==hero.getX()&&m2.getY()==hero.getY())
			{lose = true;}
		if(m3.getX()==hero.getX()&&m3.getY()==hero.getY())
			{lose = true;}
	}

	void printMap()
	{
		// TODO Auto-generated method stub
	
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{				
				if(i==hero.getX()&&j==hero.getY())
				{					
					System.out.print('@');
				}
				else if(i==ps.getX()&&j==ps.getY())
				{					
					System.out.print('&');
				}
				else if(i==m1.getX()&&j==m1.getY())
				{					
					System.out.print('��');
				}
				else if(i==m2.getX()&&j==m2.getY())
				{					
					System.out.print('��');
				}
				else if(i==m3.getX()&&j==m3.getY())
				{					
					System.out.print('��');
				}
				else
				{System.out.print('��');}
				
			}
			System.out.println();
		}
	
	}
	
}
