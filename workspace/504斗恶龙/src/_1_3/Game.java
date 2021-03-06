package _1_3;

import java.util.Scanner;

import _1_3.Monster;

public class Game
{
	boolean win = false;
	boolean lose = false;
	Hero hero;
	Princess ps;
	Monster[] monster;

	Scanner sc = new Scanner(System.in);
	
	Game()
	{
		hero = new Hero("刘德华",5,6);
		ps = new Princess("刘亦菲",4,4);
		monster = new Monster[3];
		for(int i=0;i<monster.length;i++)
		{
			monster[i] = new Monster("野猪",(int)(Math.random()*4),(int)(Math.random()*4));
//			monster[i] = new Monster("野猪",3+i,4+i);
		}		
	}
	
	void play()
	{
		while(true)
		{	
			printMap();			
			controlHero();	
			int check = checkWin();
			if(check == 1)
			{
				printMap();
				System.out.println("游戏成功");
				break;
			}
			ps.randomMove((int)(Math.random()*4));
			for(int i=0;i<monster.length;i++)
			{
				monster[i].randomMove((int)(Math.random()*4));
			}
			System.out.println("hero:"+hero.getX()+","+hero.getY()+'\n'
							+"ps:"+ps.getX()+","+ps.getY()+'\n'
							+"m0:"+monster[0].getX()+","+monster[0].getY()+'\n'
							+"m1:"+monster[1].getX()+","+monster[1].getY()+'\n'
							+"m2:"+monster[2].getX()+","+monster[2].getY()
					);
			
			if(check == -1)
			{
				printMap();
				System.out.println("游戏结束，你被猪吃了");
				break;				
			}		
		}
		System.out.println("游戏结束");
	}

	int checkWin()
	{
		if(hero.getX()==ps.getX()&&hero.getY()==ps.getY())
		{return 1;}
		for(int i=0;i<monster.length;i++)
		{
			if(monster[i].getX()==hero.getX()&&monster[i].getY()==hero.getY())
			{return -1;}
		}
		return 0;
	}
	
	  void controlHero()
	{
		// TODO Auto-generated method stub
		System.out.println("请输入方向：（w向上 a向左 s向下 d向右）");
		char d = sc.nextLine().charAt(0);
		hero.move(d);
		
	}

	void printMap()
	{
		int[][] map = new int [PlayRole.N][PlayRole.N];		
		map[hero.getX()][hero.getY()] = 1;
		map[ps.getX()][ps.getY()] = 2;
		for(int i=0;i<monster.length;i++)
		{
//			System.out.println(monster[i].getX()+","+monster[i].getY());
			map[monster[i].getX()][monster[i].getY()]=3;
		}
		for(int i=0;i<PlayRole.N;i++)
		{
			for(int j=0;j<PlayRole.N;j++)
			{
				if(map[i][j]==1)
				{System.out.print('H');}
				else if(map[i][j]==2)
				{System.out.print('P');}				
				else if(map[i][j]==3)
				{System.out.print('M');}
				else
				{System.out.print('╋');}
			}
			System.out.println();
		}
	}
	
}
