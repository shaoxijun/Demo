
import java.util.Scanner;

public class lx1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		
//		3.����2��float����������������Ľ��
//		System.out.print("������a.b��");
//		float a=sc.nextFloat();
//		float b=sc.nextFloat();
//		float result=printj(a,b);
//		System.out.println(result);
		
		
//		4.��N������ֵ
		
//		System.out.println("����L��ֵ��");
//		int l=sc.nextInt();
//		int l3=printn3(l);
//		System.out.println(l3);
		
//		5.���볤���γ����������
//		System.out.print("������a.b��");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int result=changS(a,b);
//		System.out.println(result);
		
//		6.���볤���γ��������ܳ�
//		System.out.print("������a.b��");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int result=recPer(a,b);
//		System.out.println(result);	
		
//		7.���������峤��ߣ��������
//		System.out.print("������a��");
//		int a=sc.nextInt();
//		int result=cubeV(a);
//		System.out.println(result);

//		8.����Բ�뾶���������
//		System.out.print("������a��");
//		int a=sc.nextInt();
//		double result=circleS(a);
//		System.out.println(result);
		
//		9.����Բ�뾶�������ܳ�
//		System.out.print("������a��");
//		int a=sc.nextInt();
//		double result=circleP(a);
//		System.out.println(result);
		
//		10.����n�����ؾ���ֵ
//		System.out.print("������a��");
//		int a=sc.nextInt();
//		int b=absV(a);
//		System.out.println(b);
//		
//		11.����N,�����Ƿ�3λ��ˮ�ɻ�����
//		daff(152);
//		
		
//		12.����n(n>1)
//		���nż������ӡ1/2+1/4+1/6...1/n
//		���n��������ӡ1/2+1/5+1/7...1/n
		
		
		
		
		
		
//		13.����n(n>1)
//		���nż������ӡ1/2+1/4+1/6...1/n�����ؽ��
//		���n��������ӡ1/2+1/5+1/7...1/n�����ؽ��
		
		
		
		
		
		
//		14.��дһ�������ֵ����abs(),ʹ����������������͵����������ֵ
//		System.out.println(abs(-1));
//		System.out.println(abs(-1l));
//		System.out.println(abs(-1.0));
//		System.out.println(abs(-1.0f));
//		
		
		
//		******************************************************************
//		System.out.println((int) (5*Math.random()+1) );
//		System.out.println((int)(5*Math.random()+1)*100);
//		System.out.println(((int)(5*Math.random()+1))*0.1);
//		System.out.println((int)(21*Math.random()));
//		System.out.println((int)(20*Math.random())+1);
//		System.out.println((int)(-11*Math.random())+(int)(11*Math.random()));
//		System.out.println((int)(-16*Math.random())+((int)(17*Math.random())+1));
//		System.out.println(((int)(-110*Math.random()))*0.1+((int)(460*Math.random()))*0.1);
		
		
	}
	
	
	
	//����************************************
	static void print()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+",");
		}
	}
	
	
	static void printN(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+",");
		}
	}
//	����2��float����������������Ľ��
	static float printj(float a, float b)
	{
		return a-b;
	}
//	��N������ֵ
	static int printn3(int l)
	{
		return l*l*l;
	}
//	5.���볤���γ����������
	static int changS(int a, int b)
	{
		return a*b;
	}
//	6.���볤���γ��������ܳ�
	static int recPer(int a, int b)
	{
		return 2*(a+b);
	}
//	7.���������峤��ߣ��������
	static int cubeV(int a)
	{
		return a*a*a;
	}
//	8.����Բ�뾶���������
	static double circleS(int a)
	{
		double pi=3.1415926;
		return pi*a*a;
	}
//	9.����Բ�뾶�������ܳ�
	static double circleP(int a)
	{
		double pi=3.1415926;
		return pi*a*2;
	}
//	10.����n�����ؾ���ֵ
	static int absV(int a)
	{		
		return a<0?-a:a;
	}
//	11.����N,�����Ƿ�3λ��ˮ�ɻ�����
	static void daff(int a)
	{		
		int g=a%10,s=(a/10)%10,b=(a/100)%10;
		if(g*g*g+s*s*s+b*b*b==a)
		{System.out.println("��ˮ�ɻ���");}
		else {System.out.println("����ˮ�ɻ���");}
	}
	
	
//	12.����n(n>1)
//	���nż������ӡ1/2+1/4+1/6...1/n
//	���n��������ӡ1/2+1/5+1/7...1/n
	static void print12(int n)
	{
		if(n%2==0)
		{
			for(int i=2;i<=n;i+=2)
			{
				System.out.println(1/n+"+");
			}
		}
	}
	
	
	
	
//	13.����n(n>1)
//	���nż������ӡ1/2+1/4+1/6...1/n�����ؽ��
//	���n��������ӡ1/2+1/5+1/7...1/n�����ؽ��
//	14.��дһ�������ֵ����abs(),ʹ����������������͵����������ֵ
	static int abs(int x)
	{
		return x<0?-x:x;
	}
	static long abs(long x)
	{
		return x<0?-x:x;
	}
	static double abs(double x)
	{
		return x<0?-x:x;
	}
	static float abs(float x)
	{
		return x<0?-x:x;
	}
}
	