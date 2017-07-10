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
//		    
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(' ');
//				if(i==j)
//				{System.out.print("*");}
//			}
//			for(int j=1;j<i;j++)
//			{
//				System.out.print(1);
//			}
//			for(int j=1;j<=i-2;j++)
//			{
//				System.out.print(2);//' '
//				if(j==i)
//				{ System.out.print(3);}
//				
//			}
//			
//			System.out.println();
//		}
//		输入n,打印出N行大小的实心菱形
//		输入n,打印出N行大小的空心菱形
//		用户输入一个数判断是不是素数
		System.out.print("输入一个数：");
		n=sc.nextInt();
		if(n<=3)
		{
			System.out.println(n+"是素数");
		}
		else if(n>3)
		{
			for(i=3;i<=n;i++)
			{
			if(n%(i-1)==0)
			{
				System.out.println(n+"不是素数");
				break;
			}
			else
			{
				System.out.println(n+"是素数");
				break;
			}
			}
		}
		else 
		{
		System.out.println(n+"是素数");
		}	

//  	找出1~1000中找出依次所有个素数
		for(i=2;i<=1000;i++)
		{
			int z=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					z=0;
					break;
				}
			}
		if(z==1)
				{System.out.print(i+"," );}
			
		}
	
		
		
//  	在1~1000中找出依次找出50个素数 (break)
		int count=0;
		for(i=2;i<=1000;i++)
		{
			int z=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					z=0;
					break;
				}
			}
		if(z==1)
				{System.out.print(i+"," );count++;}
		if(count==50) {break;}	
		}
// 抛出10次骰子，显示每次抛出的数字，如果得到6，显示你赢了，游戏结束。
		for(i=1;i<=10;i++)
		{
			int sz=(int)(6*Math.random());
			++sz;
			System.out.print(sz+",");
			if(sz==6)
			{
				System.out.print("你赢了");
				break;
			}
		}
		
		
// 如果抛了10次，没有都没抛出6，显示你输了
		for(i=1;i<=10;i++)
		{
			int sz=(int)(6*Math.random());
			++sz;
			System.out.print(sz+",");
			if(sz==6)
			{
				System.out.print("你赢了");
				break;
			}
			else if(i==10&&sz!=6)
			{
				System.out.print("你输了");
			}
		}
// 13) 抛在10次骰子，计算总和(如果抛出数字4，不计入总和)。(continue)
		for(i=1;i<=10;i++)
		{
			int sz=(int)(6*Math.random());
			++sz;
			System.out.print(sz+",");
			if(sz==4)
			{
				continue;
			}
				sum+=sz;
		}
		System.out.println("和为"+sum);
				
// 综合练习:
// 1. 编写一个猜拳游戏
// 电脑使用随机函数出拳
// 玩家出拳则由玩家输入 0 1 2
// 玩家进入后可以选择游戏模式
// 模式1 可以玩20次 (用for) 
// 模式2 可以一直玩到输20次为止(用while或者dowhile适合)
// 游戏结束，统计输赢平局次数
// 游戏结束，显示玩家的积分(赢得次数*10)  	
// (提示: 先完成1局猜拳游戏。然后再加入更多功能)
// 1. 玩家出拳
// 2. 电脑出拳
// 3. 显示输赢结果
	            
		
	}

}
