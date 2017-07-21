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

	public int N = 10;
	Scanner sc = new Scanner(System.in);
	
	 Game()
	{
		Hero hero = new Hero("刘德华",5,5);
		Princess ps = new Princess("刘亦菲",3,6);
		Monster[] monster = new Monster[3];
		for(int i=0;i<monster.length;i++)
		{
			monster[i] = new Monster("野猪",(int)(Math.random()*4),(int)(Math.random()*4));
		}		
	}
	
	void play()
	{
		while(true)
		{				
			printMap();			
			controlHero();			
			ps.randomMove((int)(Math.random()*4));
			for(int i=0;i<monster.length;i++)
			{
				monster[i].randomMove((int)(Math.random()*4));
			}
			int check = checkWin();
			if(check == 1)
			{
				printMap();
				System.out.println("游戏成功");
				break;
			}
			else if(check == -1)
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
		if(hero.x==ps.x&&hero.y==ps.y)
		{return 1;}
		for(int i=0;i<monster.length;i++)
		{
			if(monster[i].x==hero.x&&monster[i].y==hero.y)
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
		int[][] map = new int [N][N];		
		map[hero.x][hero.y] = 1;
		map[ps.x][ps.x] = 2;
		for(int i=0;i<monster.length;i++)
		{
			map[monster[i].x][monster[i].y]=0;
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(map[i][j]==1)
				{System.out.println('@');}
				else if(map[i][j]==2)
				{System.out.println('&');}
				else if(map[i][j]==0)
				{System.out.println('◆');}
				else
				{System.out.println('╋');}
			}
		}
	}
	
}
