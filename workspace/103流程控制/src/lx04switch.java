import java.util.Scanner;
public class lx04switch
{

	public static void main(String[] args)
	{
		// *4. ��취ʹ��switchʵ���ж�С���ɼ��ļ��� 0~100
				// 90~100 ����
				// 80~89 ����
				// 70~79 �е�
				// 60~69 ����
				// 0~59 ������
		
		Scanner sc=new Scanner(System.in);
		int mark;
		int a=0;
		int b;
		System.out.print("������С���ķ�����");
		mark=sc.nextInt();
		if(mark>=90&mark<=100)
		{
			a=1;	
		}
		else if(mark>=80&mark<=89)
		{
			a=2;	
		}
		else if(mark>=70&mark<=79)
		{
			a=3;	
		}
		else if(mark>=60&mark<=69)
		{
			a=4;	
		}
		else if(mark>=0&mark<=59)
		{
			a=5;	
		}
		switch(a)
		{
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("�е�");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("������");
			break;
		case 0:
			System.out.println("��������ȷ�ķ���");
			break;
		
		}
	}

}
