import java.util.Scanner;
public class lx7
{

	public static void main(String[] args)
	{
		// 7. 让用户输入一个3位数,判断是否是水仙花数
				// 如:153是一个水仙花数 153 = 1*1*1 + 5*5*5 +3*3*3
		
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.print("请输入一个三位数");
			num=sc.nextInt();
			if(num<=999&num>=100)
			{
			int a=num%10;
			int b=num/10%10;
			int c=num/100%10;
			if(num==a*a*a+b*b*b+c*c*c)
			{
				System.out.println("此数是水仙花数");
				
			}
			else
			{
				
				System.out.println("此数不是水仙花数");
			}
			}
			else
			{
				System.out.println("请输入一个三位数");
			}
	}

}
