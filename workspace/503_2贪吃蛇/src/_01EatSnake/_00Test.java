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
		// 3. ��д̰����1.0��Ϸ �����а汾 ����һ������ �����÷����ƶ�һ��
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
				System.out.println("ײǽ��������");
				break;
			}
			print();
			move();
		}
		// Point x y
		// Snake �ߵ�������һ�����㹹�ɣ���Ҫ��������������Ϣ������
		// ����LinkedList����űȽϷ��㣬ÿ�ƶ�һ�Σ��൱�ڣ����ƶ������ϵ�һ�㣬�����У�β��������

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
		
		
		// 4. ��д��������Ϸ1.0�汾
		// �� & ���� �� �Ѿ��Ƶ�λ�õ����� �� �յ� * ����Ŀ��� �� �ϰ��行
		// ������������������������
		// ��**********��
		// ��****&*****��
		// ��******��***��
		// ��**********��
		// ��***��**��***��
		// ��**********��
		// ������������������������

		// �˵�λ�� x y
		// ���� (��һ����������)
		// Ŀ���(��һ����������)
		// �ϰ���(��һ����������)
	}
	static void move()
	{
		System.out.println("�����뷽��a�� w�� d�� s��");
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
			System.out.println("�������������˶�");
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
						System.out.println("�������");
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
