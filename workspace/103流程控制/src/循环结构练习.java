import java.util.Scanner;
public class 循环结构练习
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=1;
		long n;
//		打印100个*
		while(i<=100)
		{
			System.out.print("*");
			i++;
		}
		System.out.print("\n");
//		计算1+2+3...+n的值
		System.out.print("请输入一个数字计算1+2+...+n的值：");
		n=sc.nextInt();
		int sum=0,l;
		for(l=0;l<=n;l++)
		{
			sum+=l;	
		}
		System.out.println("1+2+...+n="+sum);
//		打印1-500数字之间用，分割
		
		for(int m=1;m<=500;m++)
		{
			System.out.print(m+",");
			
		}
		System.out.print("\n");
//		打印-100，-98.。。-2，0
		for(int num=-100;num<=0;)
		{
			System.out.print(num+",");
			num+=2;
			
		}
		System.out.print("\n");
//		计算1*2*...*10
		n=1;
		for(i=1;i<=10;i++)
		{
			
			n*=i;
			
		}
//		用户输入一个数字n,打印n个*
		System.out.print("请输入一个数字用来输出*：");
		n=sc.nextInt();
		
		for(l=1;l<=n;l++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
//		将一个数字逆序输出
		System.out.print("请输入一串数字：");
		n=sc.nextInt();
		while(n!=0)
		{
	        System.out.print(n%10);
	        n/=10;
		}
		System.out.println("\n");
//		让用户输入数字n，打印：0 2 4 ...2^n
		sum=1; 
		int a=0;
		System.out.print("请输入数字n（2^n）:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=(sum*=2);//sum=((sum*=2)/2)?
			a=sum/2;
			System.out.print("2^"+i+"="+a+",");
		}
		
		System.out.println();
//		让用户输入数字n，打印：0  1  4....n^2
		System.out.print("请输入数字n（n^2）:");
		n=sc.nextInt();
		double n2;
		for(i=1;i<=n;i++)
		{
			
			n2=i*i;
			System.out.print(i+"^2="+n2+",");
		}
		System.out.println();
//		打印-10.0 -9.9 -9.8 ....9.9  10.0
		float m;
		for(m=-100;m<=100;m+=1)
		{
			
			System.out.print(m/10+",");
		}
		System.out.println();
		
/*		一个球从100米高度自由下路，每次落地后反弹高度为原高度一半，再次落下.
		求它第10此落地时，共经过多少米？第10此反弹多高？
*/
		m=100;
		a=100;
		for(i=1;i<=10;i++)
		{
			m/=2;
			a+=(2*m);
		}
		l= (int)(a-2*m);
		System.out.println("第10次落地经过"+l+"米");
		System.out.println("第10次反弹为"+m+"米");
//		遍历判断所有三位数是否水仙花数，输出他们。
		for( i = 100; i < 1000; i++)
		{
            int b = i / 100;
            int s = i % 100 / 10;
            int g = i % 10;
            if(b * b * b + s * s * s + g * g * g == i)
            {
                System.out.print(i+",");
            }
		}
		System.out.println();
//		打印
//		*
//		**
//		***
//		****
//		*****
		for(i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
//		打印
//		*****
//		****
//		***
//		**
//		*
		for(i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
//		打印
//		    *
//		   **
//		  ***
//		 ****
//		*****

		for(i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print('\0');	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
//		打印
//		 ****
//		  ***
//		   **
//		    *
		for(i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(1);
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

		
		
		
		
//		打印
//		    *
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
		
		for(i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print('\0');	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for(i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=3;j<=i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		for(i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(' ');
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int j=2;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}       
//	       打印空心菱形
		for(i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				
			}
		}
	            
		
	}

}
