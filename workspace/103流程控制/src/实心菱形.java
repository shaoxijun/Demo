import java.util.Scanner;

public class ʵ������
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
//		for(int i=1;i<=5;i++)//5��...(a+1)/2
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
//		for(int i=4;i>=1;i--)//4��(a-1/2)
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
		
		System.out.print("��������Ҫ�������Σ�");
		int a=sc.nextInt();
		for(int i=1;i<=(a+1)/2;i++)//5��...(a+1)/2
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
		for(int i=(a-1)/2;i>=1;i--)//4��(a-1/2)
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
		
		
		
		
		
//		��ӡ
//	    *
//	   ***
//	  *****
//	 *******
//	  *****
//	   ***
//	    *

	}

}
