import java.util.Scanner;
public class lx05switch
{

	public static void main(String[] args)
	{
		// 5. ��������Ϸ
				// ������һ��������ݿ�����3��״̬
				// 0 û���� ��ӡ�����ʾ'+'
				// 1 ���� ��ӡ���'*'
				// 2 ���� ��ӡ���'0'
				// int chess = 1;// ���ܵ�ֵ�� 0 1 2
				// ����chess��ӡ�����Ӧ���ַ�
		
		
		Scanner sc=new Scanner(System.in);
		int chess;
		System.out.print("��������ܵ�ֵ��");
		chess=sc.nextInt();
		if(chess==0)
		{
			System.out.println("+");
			
		}
		else if(chess==1)
		{
			System.out.println("*");
			
		}
		else if(chess==2)
		{
			System.out.println("0");
			
		}
		else
		{
			System.out.println("��������ȷ��ֵ");
			
		}
	}

}
