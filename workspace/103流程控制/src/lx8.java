import java.util.Scanner;
public class lx8
{

	public static void main(String[] args)
	{
		// 8. ���û�����3����x,y,z�����С��.(����Ƕ��)
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("��ֱ�����������");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("�������������Ϊ��"+a+","+b+","+c);
		
		if(a<b)
		{
			if (a<c)
			{
				System.out.println("����������С��Ϊ��"+a);
				
			}
			else
			{
				System.out.println("����������С��Ϊ��"+c);
			}
			
		}
		
		else if(a>b)
		{
			if(b>c)
			{
				System.out.println("����������С��Ϊ��"+c);
				
			}
			else
			{
				System.out.println("����������С��Ϊ��"+b);
			}
			
		}
	}

}
