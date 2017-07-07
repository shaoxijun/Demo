import java.util.Scanner;

public class lx1
{
	public static void main(String[] args)
	{
		// 1. 让用户输入2个数，判断输出其中较大的(if...else...)
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("请分别输入两个数：");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("输入的数为" + x + "," + y);
		if (x > y)
		{
			System.out.println(x);

		} else
		{
			System.out.println(y);

		}
	}
}
