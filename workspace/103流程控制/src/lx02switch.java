import java.util.Scanner;
public class lx02switch
{

	public static void main(String[] args)
	{
		// 2. ֽ��
				// int type;// ��ɫ (��Χ0~3) 0 ���� 1���� 2 ��Ƭ 3 �ݻ�
				// int num;// ���� (��Χ0~12) ��Ӧ A 2 3 4 ... 10 J Q K
				// ���û����뻨ɫ������
				// ��ӡ��Ӧ������
				// �����û����� type Ϊ0 num Ϊ 0 ��ʾ ����A
				// 1 2 ��ʾ ����3
				// 2 3 ��ʾ ��Ƭ4

		
		
		Scanner sc=new Scanner(System.in);
		int num;
		int type;
		System.out.print("�����뻨ɫ��");
		type=sc.nextInt();
		System.out.print("���������֣�");
		num=sc.nextInt();
		switch(type)
		{
		case 0:
			System.out.print("����\t");
			break;
		case 1:
			System.out.print("����\t");
			break;
		case 2:
			System.out.print("��Ƭ\t");
			break;
		case 3:
			System.out.print("�ݻ�\t");
			break;
			default:
			{
				System.out.print("����ȷ���뻨ɫ\t");
			}
		}
		switch(num)
		{
		case 0:
			{
				System.out.println("A");
				break;
			}
		case 1:
		{
			System.out.println("2");
			break;
		}
		case 2:
		{
			System.out.println("3");
			break;
		}
		case 3:
		{
			System.out.println("4");
			break;
		}
		case 4:
		{
			System.out.println("5");
			break;
		}
		case 5:
		{
			System.out.println("6");
			break;
		}
		case 6:
		{
			System.out.println("7");
			break;
		}
		case 7:
		{
			System.out.println("8");
			break;
		}
		case 8:
		{
			System.out.println("9");
			break;
		}
		case 9:
		{
			System.out.println("10");
			break;
		}
		case 10:
		{
			System.out.println("J");
			break;
		}
		case 11:
		{
			System.out.println("Q");
			break;
		}
		case 12:
		{
			System.out.println("K");
			break;
		}
		default:
		{
			System.out.println("����ȷ��������");
		}
		
		
		
		
		}

	}

}
