import java.util.Scanner;
public class lx4
{

	public static void main(String[] args)
	{
		// 4. ���û�����С���ĳɼ�,�ж���������
				// �������0~100��Χ����ʾ�û�����ĳɼ���Ϣ��
				// �� 90~100
				// �� 80~89
				// �� 70~79
				// ���� 60~69
				// ������ 0~59
		
		
		Scanner sc=new Scanner(System.in);
		int mark;
		System.out.print("������С���ĳɼ���");
		mark=sc.nextInt();
		
		if(mark>=90&mark<=100)
		{	
			System.out.println("С���ĳɼ�Ϊ��"+mark);
			System.out.println("��");
			
		}
		else if(mark>=80&mark<=89)
		{
			System.out.println("С���ĳɼ�Ϊ��"+mark);
			System.out.println("��");
			
		}
		
		else if(mark>=70&mark<=79)
		{
			System.out.println("С���ĳɼ�Ϊ��"+mark);
			System.out.println("��");
			
		}
		else if(mark>=60&mark<=69)
		{
			System.out.println("С���ĳɼ�Ϊ��"+mark);
			System.out.println("����");
			
		}
		else if(mark>=00&mark<=59)
		{
			System.out.println("С���ĳɼ�Ϊ��"+mark);
			System.out.println("������");
			
		}
		else
		{
			System.out.println("�ɼ�����������������롣");
			
		}
		
		
		
		
	}

}
