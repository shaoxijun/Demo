import java.util.Scanner;
public class lx2
{

	public static void main(String[] args)
	{
		// 2. ���û�����1����,�ж����ʱż����������(if...else...)
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("������һ������");
		num =sc.nextInt();
		System.out.println("�������Ϊ��"+num);
		if(num%2==0)
		{
			System.out.println("ż��");
			
		}
		else
		{
			System.out.println("����");
			
		}
	}

}
