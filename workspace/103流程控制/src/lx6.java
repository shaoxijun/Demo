import java.util.Scanner;
public class lx6
{

	public static void main(String[] args)
	{
		// 6. ���û�����1~7,������ĵ����ڼ�
		
		Scanner sc=new Scanner(System.in);
		int week;
		System.out.print("������1-7������");
		week=sc.nextInt();
		if(week==1)
		{
			System.out.println("��������һ");
		}
		else if(week==2)
		{
			System.out.println("�������ܶ�");
		}
		else if(week==3)
		{
			System.out.println("����������");
		}
		else if(week==4)
		{
			System.out.println("����������");
		}
		else if(week==5)
		{
			System.out.println("����������");
		}
		else if(week==6)
		{
			System.out.println("����������");
		}
		else 
		{
			System.out.println("����������");
		}
	}

}
