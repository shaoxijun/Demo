import java.util.Scanner;
public class lx7
{

	public static void main(String[] args)
	{
		// 7. ���û�����һ��3λ��,�ж��Ƿ���ˮ�ɻ���
				// ��:153��һ��ˮ�ɻ��� 153 = 1*1*1 + 5*5*5 +3*3*3
		
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.print("������һ����λ��");
			num=sc.nextInt();
			if(num<=999&num>=100)
			{
			int a=num%10;
			int b=num/10%10;
			int c=num/100%10;
			if(num==a*a*a+b*b*b+c*c*c)
			{
				System.out.println("������ˮ�ɻ���");
				
			}
			else
			{
				
				System.out.println("��������ˮ�ɻ���");
			}
			}
			else
			{
				System.out.println("������һ����λ��");
			}
	}

}
