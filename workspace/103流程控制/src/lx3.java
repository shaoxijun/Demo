import java.util.Scanner;
public class lx3
{

	public static void main(String[] args)
	{
		// 3. ���û�����1����,�ж��Ƿ��ǹ�����(if...else...)
		Scanner sc =new Scanner(System.in);
		int day;
		System.out.print("����������");
		day=sc.nextInt();
		System.out.println("���������Ϊ��"+day);
		if(day<=5&day>+1)
		{
			System.out.println("�ǹ�����");
			
		}
		else
		{
			System.out.println("���ǹ�����");
			
		}
	}

}
