import java.util.Arrays;
import java.util.Scanner;
public class lx1_105
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		char[] a=new char[5];
//		a=new char[5];
//		a[0]='a';
//		a[1]='b';
//		a[2]='c';
//		a[3]='d';
//		a[4]='e';	
//		
//		1.定义一个学生数学成绩的数组，存放10个学生成绩
//		a.打印这十个学生的成绩
//		b.计算并打印显示着十个学生总分，最高分，最低分，平均分。
//		int[] mark= {79,70,32,90,100,99,98,79,89,59};
//		int sum=0,max=0,min=mark[0],ave=0;
//		for(int i=0;i<mark.length;i++)
//		{
//			System.out.print(mark[i]+",");
//			sum+=mark[i];
//			ave=sum/(i+1);
//		}
//		System.out.println();
//		System.out.println("总分为："+sum+",平均分为："+ave);
//		for(int i=0;i<mark.length;i++)
//		{
//			max=mark[i]>max?mark[i]:max;
//			min=mark[i]<min?mark[i]:min;
//		}
//		System.out.println("最大为："+max+",最小为："+min);
//		     x	  e  m   c  
		//1.学号     英语 数学 语文 总分
		//  10001 98 90 98 
	   //   10002 89 89 78 
		//  10003 98 79 87 
		//  10004 79 89 69 
		//打印每个学生的各门成绩及总分
//		int[] x= {10001,98,90,98};
//		int[] e= {10002,89,89,78};
//		int[] m= {10003,98,79,87};
//		int[] c= {10004,79,89,69};
//		int[] sum=new int[4];
//		int[][] mark= {x,e,m,c};	
//		System.out.println("学号        英语   数学   语文   总分");
//		for(int i=0;i<mark.length;i++)
//		{
//			for(int j=0;j<mark[i].length;j++)
//			{
//				sum[i]+=mark[i][j];
//				System.out.print(mark[i][j]+"  ");
//			}
//			
//			System.out.print(sum[i]-mark[i][0]);
//			System.out.println();
//		}
		
		//打印杨辉三角
//		1 0 0 0 0 0 0 0 0 0 0 
//		1 1 0 0 0 0 0 0 0 0 0 
//		1 2 1 0 0 0 0 0 0 0 0 
//		1 3 3 1 0 0 0 0 0 0 0
//		1 4 6 4 1 0 0 0 0 0 0 
//		1 5 10 10 5 1 0 0 0 0 
//		1 6 12 20 126 1 0 0
//		int[][] arr= new int[10][10];
//		int i,j;
//		for(i=0;i<10;i++)
//		{
//			arr[i][0]=arr[i][i]=1;
//			for(j=0;j<10;j++)
//			{
//				if(i>1&&j>0&&j<i)
//				{
//					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//				}			
//			}			
//		}
//		for(int a=0;a<10;a++)
//		{
//			for(int b=0;b<10;a++)
//			{
//				System.out.print(arr[a][b]+"  ");
//			}
//		}
//		
		
		
		
		//从键盘上输入10个学生成绩
		//显示输入的学生成绩
		//输出低于平局成绩的学生成绩
//		Scanner sc=new Scanner(System.in);
//		int[] mark=new int[10];
//		
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("请输入学生"+(i+1)+"成绩");
//			int in=sc.nextInt();
//			mark[i]=in;			
//		}
//		for(int i=0;i<10;i++)
//		{
//			System.out.print(mark[i]+"  ");
//		}
//		int sum=0;
//		for(int i=0;i<10;i++)
//		{
//			sum+=mark[i];
//		}
//		System.out.println("平均成绩为："+sum/10);
//		System.out.print("低于平均成绩的为：");
//		for(int i=0;i<10;i++)
//		{
//			if(mark[i]<sum/10)
//			{
//				System.out.print(mark[i]+"  ");
//			}
//		}
		
		
		
		// 2. 定义一个10*10二维数组，用于存放五子棋棋盘信息(0 无棋,1黑棋,2白棋)
				//    在3,3位置放置一颗黑棋 即将数组中该位置设置为1
				//    在3,4位置放置一颗白棋 即将数组中该位置设置为2
				//    在4,4位置放置一颗黑棋
				//    在5,4位置放置一颗白棋
				//    根据数组信息打印棋盘:
				//     打印出如下效果
				char [][] arr=new char[10][10];
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						arr[i][j]='╋';
					}
				}
				arr[3][3]=arr[4][4]='◆';
				arr[3][4]=arr[5][4]='◇';
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
				
			
	} 
}
