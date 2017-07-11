import java.util.Scanner;

public class 实心菱形
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
//		for(int i=1;i<=5;i++)//5层...(a+1)/2
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(' ');
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			
//		}
//		for(int i=4;i>=1;i--)//4层(a-1/2)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(' ');
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.print("请输入需要几行菱形；");
		int a=sc.nextInt();
		for(int i=1;i<=(a+1)/2;i++)//5层...(a+1)/2
		{
			for(int j=(a+1)/2-1;j>=i;j--)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		for(int i=(a-1)/2;i>=1;i--)//4层(a-1/2)
		{
			for(int j=(a-1)/2;j>=i;j--)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
//		打印
//	    *
//	   ***
//	  *****
//	 *******
//	  *****
//	   ***
//	    *

	}

}
