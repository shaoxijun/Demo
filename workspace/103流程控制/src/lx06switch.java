import java.util.Scanner;

public class lx06switch
{

	public static void main(String[] args)
	{

		// 6. ����ѧУ��ԭ��ʹ��ABCDEF����ѧ��ѧϰ�ȼ�����ǰ��Ϊ ���� ���� ���� ������
		// ��Ӧ��ϵΪ A -> ����
		//         B C -> ����
		//         D E -> ����
		//         F   -> ������
		// ���û�����һ��char���ַ�.
		// �ж������Ӧ����������
		
		Scanner sc=new Scanner(System.in);
		String dengji;
		System.out.print("������ȼ���");
		dengji=sc.next();
		switch(dengji)
		{
		case "A":
			System.out.println("����");
			break;
		case "B":
			System.out.println("����");
			break;
		case "C":
			System.out.println("����");
			break;
		case "D":
			System.out.println("����");
			break;	
		case "E":
			System.out.println("����");
			break;	
		case "F":
			System.out.println("������");
			break;	
	
		default :
		{
			
			System.out.println("��������ȷ�ĵȼ�");
		}	
		}
		
		
	}

}
