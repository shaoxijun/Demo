import java.util.Scanner;
public class lx01switch
{

	public static void main(String[] args)
	{
		// ���û�����1~3��(�ֱ����ʯͷ���Ӳ�)
				// �����Ӧ���û����������һ������

		
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("������һ��1-3��");
		num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("ʯͷ");
			break;
		case 3:
			System.out.println("��");
			break;
			default:
			{
				System.out.print("������һ��1-3��");
			}
		}

	}

}
