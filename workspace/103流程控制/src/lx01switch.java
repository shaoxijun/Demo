import java.util.Scanner;
public class lx01switch
{

	public static void main(String[] args)
	{
		// 让用户输入1~3，(分别代表石头剪子布)
				// 输出相应的用户输入的是哪一种手势

		
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("请输入一个1-3数");
		num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("剪刀");
			break;
		case 2:
			System.out.println("石头");
			break;
		case 3:
			System.out.println("布");
			break;
			default:
			{
				System.out.print("请输入一个1-3数");
			}
		}

	}

}
