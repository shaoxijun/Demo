import java.util.Scanner;

public class 空心菱形
{
	public static void main(String [] args)
	{
//		     *
//	        * *
//	       *   *
//	      *     *
//	     *       *
//	    *         *
//	   *           *
//	  *             *
//	 *               *
//	*                 *
//	*                  *
//	*                 *
//	 *               *
//	  *             *
//	   *           *
//	    *         *
//	     *       *
//	      *     *
//	       *   *
//	        * *
//	         *
				Scanner sc=new Scanner(System.in);
				System.out.print("请输入需要几行菱形；");
				int a=sc.nextInt();
				
				for(int i=1;i<=(a+1)/2;i++)//5层...(a+1)/2
				{
					 
					for(int j=(a+1)/2-1;j>=i;j--)
					{
						System.out.print(' ');
					
					}
					System.out.print("*");

					for(int j=2;j<=i;j++)
					{
						System.out.print(' ');
					}
					for(int j=3;j<=i;j++)
					{
						System.out.print(' ');
					}
					if(i>1)
					{
						System.out.print("*");
					}

					System.out.println();
					
				}

				for(int i=(a-1)/2;i>=1;i--)//4层(a-1)/2
				{
					for(int j=(a-1)/2;j>=i;j--)
					{
						System.out.print(' ');
					}
					System.out.print("*");

					for(int j=2;j<=i;j++)
					{
						System.out.print(' ');
					}
					for(int j=2;j<=i-1;j++)
					{
						System.out.print(' ');
					}
					if(i>1)
					{
						System.out.print("*");
					}
					System.out.println();
				}

	}
}
