package _01EatSnake;
import java.util.*;

public class _00Test
{
	static Snake s = new Snake();
	static final int N = 10;
	static Scanner sc = new Scanner(System.in);
	static char f;
	public static void main(String[] args)
	{
		// 3. 编写贪吃蛇1.0游戏 命令行版本 输入一个方向 蛇往该方向移动一格
		// ********
		// *****$**
		// ********
		// **@#****
		// ***####*
		while(true)
		{
			if(s.point.peekFirst().getX()<0||s.point.peekFirst().getX()>=N||
					s.point.peekFirst().getY()<0||s.point.peekFirst().getY()>=N)
			{
				System.out.println("撞墙，你输了");
				break;
			}
			print();
			move();
		}
		// Point x y
		// Snake 蛇的身体由一个个点构成，需要保存所有身体信息的容器
		// 采用LinkedList来存放比较方便，每移动一次，相当于，将移动方向上的一点，进队列，尾部出队列

		// ###@****
		// ********
		// ********
		// ********
		// ********
		// (0,3)(0,2)(0,1)(0,0)

		// *###@***
		// ********
		// ********
		// ********
		// ********
		// (0,4)(0,3)(0,2)(0,1)

		// **###@**
		// ********
		// ********
		// ********
		// ********
		// (0,5)(0,4)(0,3)(0,2)

		// ***###**
		// *****@**
		// ********
		// ********
		// ********
		// (1,5)(0,5)(0,4)(0,3)
		
		
		// 4. 编写推箱子游戏1.0版本
		// 人 & 箱子 □ 已经移到位置的箱子 ■ 空地 * 箱子目标点 ● 障碍物▓
		// ▓▓▓▓▓▓▓▓▓▓▓▓
		// ▓**********▓
		// ▓****&*****▓
		// ▓******□***▓
		// ▓**********▓
		// ▓***■**●***▓
		// ▓**********▓
		// ▓▓▓▓▓▓▓▓▓▓▓▓

		// 人的位置 x y
		// 箱子 (用一个容器保存)
		// 目标点(用一个容器保存)
		// 障碍物(用一个容器保存)
	}
	static void move()
	{
		System.out.println("请输入方向：a左 w上 d下 s右");
		char dir = sc.next().charAt(0);
		char d = ' ';
		f = dir;
		if(dir == 'a')
		{
			d = 'd';
		}else if(dir == 'd')
		{
			d = 'a';
		}
		else if(dir == 'w')
		{
			d = 's';
		}
		else if(dir == 's')
		{
			d = 'w';
		}
		if(f == d)
		{
			System.out.println("不能往反方向运动");
		}else
		{
				switch(dir)
				{
				
				case 'a':
					s.point.removeLast();
					s.point.addFirst(new Point(s.point.getFirst().getX(),s.point.getFirst().getY()-1));
					break;
				case 'd':
					s.point.removeLast();
					s.point.addFirst(new Point(s.point.getFirst().getX(),s.point.getFirst().getY()+1));
					break;
				case 'w':
					s.point.removeLast();
					s.point.addFirst(new Point(s.point.getFirst().getX()-1,s.point.getFirst().getY()));
					break;
				case 's':
					s.point.removeLast();
					s.point.addFirst(new Point(s.point.getFirst().getX()+1,s.point.getFirst().getY()));
					break;
					default:
					{
						System.out.println("输入错误");
					}
				}
		}
	}
	static void print()
	{
//		if(s.equals(obj))
//		s.point.add(new )
		for(int i = 0;i<N;i++)
		{
			for(int j = 0;j<N;j++)
			{
				if(s.contains(i, j))
				{
					if(s.point.getFirst().getX() == i&&s.point.getFirst().getY() == j)
					{
						System.out.print("@");
					}else
					System.out.print("#");
				}
//				else if(!s.contains((int)(Math.random()*21), (int)(Math.random()*21)))
//				{
//					System.out.print("$");
//				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
