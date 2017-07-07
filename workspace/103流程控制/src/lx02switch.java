import java.util.Scanner;
public class lx02switch
{

	public static void main(String[] args)
	{
		// 2. 纸牌
				// int type;// 花色 (范围0~3) 0 红桃 1黑桃 2 方片 3 草花
				// int num;// 数字 (范围0~12) 对应 A 2 3 4 ... 10 J Q K
				// 让用户输入花色和数字
				// 打印对应的牌面
				// 比如用户输入 type 为0 num 为 0 显示 红桃A
				// 1 2 显示 黑桃3
				// 2 3 显示 方片4

		
		
		Scanner sc=new Scanner(System.in);
		int num;
		int type;
		System.out.print("请输入花色：");
		type=sc.nextInt();
		System.out.print("请输入数字：");
		num=sc.nextInt();
		switch(type)
		{
		case 0:
			System.out.print("红桃\t");
			break;
		case 1:
			System.out.print("黑桃\t");
			break;
		case 2:
			System.out.print("方片\t");
			break;
		case 3:
			System.out.print("草花\t");
			break;
			default:
			{
				System.out.print("请正确输入花色\t");
			}
		}
		switch(num)
		{
		case 0:
			{
				System.out.println("A");
				break;
			}
		case 1:
		{
			System.out.println("2");
			break;
		}
		case 2:
		{
			System.out.println("3");
			break;
		}
		case 3:
		{
			System.out.println("4");
			break;
		}
		case 4:
		{
			System.out.println("5");
			break;
		}
		case 5:
		{
			System.out.println("6");
			break;
		}
		case 6:
		{
			System.out.println("7");
			break;
		}
		case 7:
		{
			System.out.println("8");
			break;
		}
		case 8:
		{
			System.out.println("9");
			break;
		}
		case 9:
		{
			System.out.println("10");
			break;
		}
		case 10:
		{
			System.out.println("J");
			break;
		}
		case 11:
		{
			System.out.println("Q");
			break;
		}
		case 12:
		{
			System.out.println("K");
			break;
		}
		default:
		{
			System.out.println("请正确输入数字");
		}
		
		
		
		
		}

	}

}
