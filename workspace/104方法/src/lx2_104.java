
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
	//2.��Ʋ���������  1  1  2  3  5  8  13  21......
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

	// 3. ����������
	// ack(m,n) = n +1 					(m==0ʱ)
	// 			= ack(m-1,1) 			(m!=0,n==0ʱ)
	// 			= ack(m-1,ack(m,n-1)) 	(m!=0,n!=0ʱ)
	// ����ʱ��ʹ��m<4

	// * 4. ��дһ�������������������Լ��
	// 6 9 -> 3

	// * 5 ĳ��д��n����,n���ŷ�,��������Ŷ�װ���ˣ����ж����ֿ���?
	// ��Ҫ���������ҳ�����
}
