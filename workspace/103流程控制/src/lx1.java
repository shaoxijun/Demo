import java.util.Scanner;

public class lx1
{
	public static void main(String[] args)
	{
		// 1. ���û�����2�������ж�������нϴ��(if...else...)
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("��ֱ�������������");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("�������Ϊ" + x + "," + y);
		if (x > y)
		{
			System.out.println(x);

		} else
		{
			System.out.println(y);

		}
	}
}
