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
//		1.����һ��ѧ����ѧ�ɼ������飬���10��ѧ���ɼ�
//		a.��ӡ��ʮ��ѧ���ĳɼ�
//		b.���㲢��ӡ��ʾ��ʮ��ѧ���ܷ֣���߷֣���ͷ֣�ƽ���֡�
//		int[] mark= {79,70,32,90,100,99,98,79,89,59};
//		int sum=0,max=0,min=mark[0],ave=0;
//		for(int i=0;i<mark.length;i++)
//		{
//			System.out.print(mark[i]+",");
//			sum+=mark[i];
//			ave=sum/(i+1);
//		}
//		System.out.println();
//		System.out.println("�ܷ�Ϊ��"+sum+",ƽ����Ϊ��"+ave);
//		for(int i=0;i<mark.length;i++)
//		{
//			max=mark[i]>max?mark[i]:max;
//			min=mark[i]<min?mark[i]:min;
//		}
//		System.out.println("���Ϊ��"+max+",��СΪ��"+min);
//		     x	  e  m   c  
		//1.ѧ��     Ӣ�� ��ѧ ���� �ܷ�
		//  10001 98 90 98 
	   //   10002 89 89 78 
		//  10003 98 79 87 
		//  10004 79 89 69 
		//��ӡÿ��ѧ���ĸ��ųɼ����ܷ�
//		int[] x= {10001,98,90,98};
//		int[] e= {10002,89,89,78};
//		int[] m= {10003,98,79,87};
//		int[] c= {10004,79,89,69};
//		int[] sum=new int[4];
//		int[][] mark= {x,e,m,c};	
//		System.out.println("ѧ��        Ӣ��   ��ѧ   ����   �ܷ�");
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
		
		//��ӡ�������
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
		
		
		
		//�Ӽ���������10��ѧ���ɼ�
		//��ʾ�����ѧ���ɼ�
		//�������ƽ�ֳɼ���ѧ���ɼ�
//		Scanner sc=new Scanner(System.in);
//		int[] mark=new int[10];
//		
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("������ѧ��"+(i+1)+"�ɼ�");
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
//		System.out.println("ƽ���ɼ�Ϊ��"+sum/10);
//		System.out.print("����ƽ���ɼ���Ϊ��");
//		for(int i=0;i<10;i++)
//		{
//			if(mark[i]<sum/10)
//			{
//				System.out.print(mark[i]+"  ");
//			}
//		}
		
		
		
		// 2. ����һ��10*10��ά���飬���ڴ��������������Ϣ(0 ����,1����,2����)
				//    ��3,3λ�÷���һ�ź��� ���������и�λ������Ϊ1
				//    ��3,4λ�÷���һ�Ű��� ���������и�λ������Ϊ2
				//    ��4,4λ�÷���һ�ź���
				//    ��5,4λ�÷���һ�Ű���
				//    ����������Ϣ��ӡ����:
				//     ��ӡ������Ч��
				char [][] arr=new char[10][10];
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						arr[i][j]='��';
					}
				}
				arr[3][3]=arr[4][4]='��';
				arr[3][4]=arr[5][4]='��';
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
