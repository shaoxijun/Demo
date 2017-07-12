
public class lx2_104
{

	public static void main(String[] args)
	{
		
		System.out.println(foo2(10));
	}
	///
	static int foo(int a)
	{
		if(a>1)
		{
			System.out.println(a);
			return a*foo(a-1);//		
		}
		else
		{
			return 1;
		}
	}	
	//1
	static int foo1(int a)
	{
		if(a>1)
		{
			return a+foo2(a-1);//		
		}
		else
		{
			return 1;
		}
	}
	//2.求菲波那切数列  1  1  2  3  5  8  13  21......
	static int foo2(int a)
	{
		if(a>1)
		{
			return foo2(a-1)+foo2(a-2);
		}
		else
		{
			return 1;
		}
	}

	// 3. 阿克曼函数
	// ack(m,n) = n +1 					(m==0时)
	// 			= ack(m-1,1) 			(m!=0,n==0时)
	// 			= ack(m-1,ack(m,n-1)) 	(m!=0,n!=0时)
	// 测试时，使用m<4

	// * 4. 编写一个方法求两个数的最大公约数
	// 6 9 -> 3

	// * 5 某人写了n封信,n个信封,如果所有信都装错了，求有多少种可能?
	// 需要分析，并找出规律
}
