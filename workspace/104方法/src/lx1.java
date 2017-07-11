
import java.util.Scanner;

public class lx1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		
//		3.传入2个float数，返回它们相减的结果
//		System.out.print("请输入a.b：");
//		float a=sc.nextFloat();
//		float b=sc.nextFloat();
//		float result=printj(a,b);
//		System.out.println(result);
		
		
//		4.求N的立方值
		
//		System.out.println("输入L的值：");
//		int l=sc.nextInt();
//		int l3=printn3(l);
//		System.out.println(l3);
		
//		5.传入长方形长宽，返回面积
//		System.out.print("请输入a.b：");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int result=changS(a,b);
//		System.out.println(result);
		
//		6.传入长方形长宽，返回周长
//		System.out.print("请输入a.b：");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int result=recPer(a,b);
//		System.out.println(result);	
		
//		7.传入立方体长宽高，返回体积
//		System.out.print("请输入a：");
//		int a=sc.nextInt();
//		int result=cubeV(a);
//		System.out.println(result);

//		8.传入圆半径，返回面积
//		System.out.print("请输入a：");
//		int a=sc.nextInt();
//		double result=circleS(a);
//		System.out.println(result);
		
//		9.传入圆半径，返回周长
//		System.out.print("请输入a：");
//		int a=sc.nextInt();
//		double result=circleP(a);
//		System.out.println(result);
		
//		10.传入n，返回绝对值
//		System.out.print("请输入a：");
//		int a=sc.nextInt();
//		int b=absV(a);
//		System.out.println(b);
//		
//		11.传入N,返回是否3位数水仙花数。
//		daff(152);
//		
		
//		12.传入n(n>1)
//		如果n偶数，打印1/2+1/4+1/6...1/n
//		如果n奇数，打印1/2+1/5+1/7...1/n
		
//		print12(15);
		
		
		
		
		
//		13.传入n(n>1)
//		如果n偶数，打印1/2+1/4+1/6...1/n，返回结果
//		如果n奇数，打印1/2+1/5+1/7...1/n，返回结果
		
//		System.out.println(print13(12));;
		
		
//		14.传入N,jisuan 1+2+...+n的结果
		
//		System.out.println(print14(5));
		
//		15传入N，计算1*2*...*n的计算结果
		
//		System.out.println(print15(5));
		
		
//		16.编写一个求绝对值方法abs(),使用重载满足各种类型的数据求绝对值
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
		
//		54张牌，每张牌都随机，概率为五十四分之一
		int a=(int)(54*Math.random()+1);
		if(a>1&a<=10)//红心
		{
			
			System.out.println("红心"+a);
		}
		else if(a<=13)
		{
			if(a==1) {System.out.println("红心A");}
			else if(a==11) {System.out.println("红心j");}
			else if(a==12) {System.out.println("红心Q");}
			else if(a==11) {System.out.println("红心K");}
		}
		if(a<=23)//方片
		{
			if(a==14) {System.out.println("方片A");}
			for(int i=15;i<=23;i++)
			{
				int j=2;
				j++;
				if(a==i) {System.out.println("方片"+j);}
			}
		}
		if(a<=26)
		{
			if(a==24) {System.out.println("方片j");}
			else if(a==25) {System.out.println("方片Q");}
			else if(a==26) {System.out.println("方片K");}
		}
		
		if(a<=36)//草花
		{
			if(a==27) {System.out.println("草花A");}
			for(int i=28;i<=36;i++)
			{
				int j=2;
				j++;
				if(a==i) {System.out.println("草花"+j);}
			}
		}
		if(a<=39)
		{
			if(a==37) {System.out.println("草花j");}
			else if(a==38) {System.out.println("草花Q");}
			else if(a==39) {System.out.println("草花K");}
		}
		
		if(a<=49)//黑桃
		{
			if(a==40) {System.out.println("黑桃A");}
			for(int i=41;i<=49;i++)
			{
				int j=2;
				j++;
				if(a==i) {System.out.println("黑桃"+j);}
			}
		}
		if(a<=52)
		{
			if(a==50) {System.out.println("黑桃j");}
			else if(a==51) {System.out.println("黑桃Q");}
			else if(a==52) {System.out.println("黑桃K");}
		}
		if(a==53) {System.out.println("大王");}
		if(a==54)		{System.out.println("小王");}
	}
	
	
	
	//方法************************************
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
//	传入2个float数，返回它们相减的结果
	static float printj(float a, float b)
	{
		return a-b;
	}
//	求N的立方值
	static int printn3(int l)
	{
		return l*l*l;
	}
//	5.传入长方形长宽，返回面积
	static int changS(int a, int b)
	{
		return a*b;
	}
//	6.传入长方形长宽，返回周长
	static int recPer(int a, int b)
	{
		return 2*(a+b);
	}
//	7.传入立方体长宽高，返回体积
	static int cubeV(int a)
	{
		return a*a*a;
	}
//	8.传入圆半径，返回面积
	static double circleS(int a)
	{
		double pi=3.1415926;
		return pi*a*a;
	}
//	9.传入圆半径，返回周长
	static double circleP(int a)
	{
		double pi=3.1415926;
		return pi*a*2;
	}
//	10.传入n，返回绝对值
	static int absV(int a)
	{		
		return a<0?-a:a;
	}
//	11.传入N,返回是否3位数水仙花数。
	static void daff(int a)
	{		
		int g=a%10,s=(a/10)%10,b=(a/100)%10;
		if(g*g*g+s*s*s+b*b*b==a)
		{System.out.println("是水仙花数");}
		else {System.out.println("不是水仙花数");}
	}
	
	
//	12.传入n(n>1)
//	如果n偶数，打印1/2+1/4+1/6...1/n
//	如果n奇数，打印1/2+1/5+1/7...1/n
	static void print12(int n)
	{
		if(n%2==0)
		{
			for(int i=2;i<=n;i+=2)
			{
				System.out.print("1/"+i);
				if(i<n)
				{
					System.out.print("+");
				}
			}
			
		}
		else
		{
			for(int i=3;i<=n;i+=2)
			{
				System.out.print("1/"+i);
				if(i<n)
				{
					System.out.print("+");
				}
			}
		
		}
	}
	
	
	
	
//	13.传入n(n>1)
//	如果n偶数，打印1/2+1/4+1/6...1/n，返回结果
//	如果n奇数，打印1/2+1/5+1/7...1/n，返回结果
	static double print13 (int n)
	{
		double result=0;
		if(n%2==0)
		{
			for(int i=2;i<=n;i+=2)
			{
				result+=(double)1/(double)i;
				System.out.print("1/"+i);
				if(i<n)
				{
					System.out.print("+");
				}
			}
			System.out.print("=");
			
		}
		else
		{
			for(int i=3;i<=n;i+=2)
			{
				result+=(double)1/(double)i;
				System.out.print("1/"+i);
				if(i<n)
				{
					System.out.print("+");
				}
			}
			System.out.print("=");		
		}
		return result;
	}
//	14.传入N,计算 1+2+...+n的结果
	static int print14(int a)
	{
		int result=0;
		for(int i=1;i<=a;i++)
		{
			result+=i;
		}
		return result;
	}
	
	
	
//	15传入N，计算1*2*...*n的计算结果
	static int print15(int a)
	{
		int result=1;
		for(int i=1;i<=a;i++)
		{
			result*=i;
		}
		return result;
	}
	
	
//	16.编写一个求绝对值方法abs(),使用重载满足各种类型的数据求绝对值
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
	