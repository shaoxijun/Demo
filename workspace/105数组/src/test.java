
import java.util.Arrays;
import java.util.Scanner;

public class test
{
	static final int N=10;
	static int[][] chess = new int[N][N];
	static Scanner sc=new Scanner(System.in);
	static boolean black=true;
	static int win=0;
	static int x,y;
	public static void main(String[] args)
	{
			//��ӡ����
			type();
		for(int i=1;i<=N*N;i++) 
		{
			
			//ĳ������
			play();
			//��ӡ����
			type();
			//�ж���Ӯ
			decide();
			if(win==1|win==2)
			{break;}			
		}
		if(win==1)
			{System.out.println("�ڷ�Ӯ");}
		if(win==2)
			{System.out.println("�׷�Ӯ");}
	}
	//�ж���Ӯ
	static void decide()
	{
		//������							
		int h1=0,h2=0;
		int a=y;
		++a;
		if(a<=5)
		{
			for(int i=1;i<=a-1;i++)
			{
				if(chess[x][y]==chess[x][y-i])
				{h1=i;}
				else {break;}
			}
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x][y+i])
				{h2=i;}
				else {break;}
			}
			if(h1+h2>=4)
			{ win=black?2:1;}
		}
		if(N-a<5&&a>=5)
		{
			for(int i=1;i<=N-a;i++)
			{
				if(chess[x][y]==chess[x][y+i])
				{h1=i;}
				else {break;}
			}
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x][y-i])
				{h2=i;}
				else {break;}
			}
			if(h1+h2>=4)
			{ win=black?2:1;}
		}

		//�������
		int z1=0,z2=0;
		int b=x;
		++b;
		if(b<=5)
		{
			for(int i=1;i<=b-1;i++)
			{
				if(chess[x][y]==chess[x-i][y])
				{z1=i;}
				else {break;}
			}
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x+i][y])
				{z2=i;}
				else {break;}
			}
		}
		if(N-b<5&&b>=5)
		{
			for(int i=1;i<=N-b;i++)
			{
				if(chess[x][y]==chess[x+i][y])
				{z1=i;}
				else {break;}
			}
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x-i][y])
				{z2=i;}
				else {break;}
			}
		}
		if(z1+z2>=4)
		{win=black?2:1;}
		//������ϣ�����
		int zs=0,yx=0;
		//b=x,a=y
		if(b<=5||a<=5)
		{
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x+i][y+i])
				{yx=i;}
				else {break;}
			}
			if(a>=b)
			{
				for(int i=1;i<=b-1;i++)
				{
					if(chess[x][y]==chess[x-i][y-i])
					{zs=i;}
					else {break;}
				}
			}
			else
			{
				for(int i=1;i<=a-1;i++)
				{
					if(chess[x][y]==chess[x-i][y-i])
					{zs=i;}
					else {break;}
				}
			}
		}		
		if(N-b<5||N-a<5)
		{
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x-i][y-i])
				{zs=i;}
				else {break;}
			}
			if(a<=b)
			{
				for(int i=1;i<b-1;i++)
				{
					if(chess[x][y]==chess[x+i][y+i])
					{yx=i;}
					else {break;}
				}
			}
			else
			{
				for(int i=1;i<a-1;i++)
				{
					if(chess[x][y]==chess[x+i][y+i])
					{yx=i;}
					else {break;}
				}
			}
		}
		if(zs+yx>=4)
		{win=black?2:1;}
		//������ϣ�����
		int zx=0,ys=0;
		//b=x,a=y
		if(b<=5||N-a<=5)
		{
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x+i][y-i])
				{zx=i;}
				else {break;}
			}
			if(N-a>=b)
			{
				for(int i=1;i<=b-1;i++)
				{
					if(chess[x][y]==chess[x-i][y+i])
					{ys=i;}
					else {break;}
				}
			}
			else
			{
				for(int i=1;i<=a-1;i++)
				{
					if(chess[x][y]==chess[x-i][y+i])
					{ys=i;}
					else {break;}
				}
			}
		}
		if(N-b<5||a<5)
		{
			for(int i=1;i<=4;i++)
			{
				if(chess[x][y]==chess[x-i][y+i])
				{ys=i;}
				else {break;}
			}
			if(N-a<=b)
			{
				for(int i=1;i<b-1;i++)
				{
					if(chess[x][y]==chess[x+i][y-i])
					{zx=i;}
					else {break;}
				}
			}
			else
			{
				for(int i=1;i<a-1;i++)
				{
					if(chess[x][y]==chess[x+i][y-i])
					{zx=i;}
					else {break;}
				}
			}
		}
		if(ys+zx>=4)
		{win=black?2:1;}
				
	}		
	
		
	
	//һ������
	static void play()
	{
		
		System.out.print("��ǰ"+(black?"�ڷ���":"�׷���"));
		for(;;)
		{	
			System.out.print("���������꣺");
			x=sc.nextInt();
			y=sc.nextInt();
			x--;
			y--;
			if(x<=N&x>=0&&y<=N&&y>=0&&chess[x][y]==0)
			{break;}
			System.out.println("�����������ȷ���룺");
		}
		chess[x][y]= black?1:2;
		black=!black;
	}
	
	//��ӡ����
	static void type()
	{
		char[] c= {'��','��','��'};
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(c[ chess [i][j]]);
			}
			System.out.println();
		}
	}
	

}
