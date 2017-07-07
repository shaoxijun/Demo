import java.util.Scanner;
public class lx2
{

	public static void main(String[] args)
	{
		// 2. 让用户输入1个数,判断输出时偶数还是奇数(if...else...)
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("请输入一个数：");
		num =sc.nextInt();
		System.out.println("输入的数为："+num);
		if(num%2==0)
		{
			System.out.println("偶数");
			
		}
		else
		{
			System.out.println("奇数");
			
		}
	}

}
