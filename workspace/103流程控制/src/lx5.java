import java.util.Scanner;
public class lx5
{

	public static void main(String[] args)
	{
		// 5. ����һ����ݣ��ж��Ƿ�������(��������Ҫ��400���������꣬���������걻4����������)
				// ������ ��2000������ 2100�겻������
		
		
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.print("���������");
		year=sc.nextInt();
		System.out.println("����������Ϊ��"+year);
		if(year%400==0)
		{	
			
				System.out.println("����������������");
		}
		else if(year%4==0&&year%100!=0)
			{
				System.out.println("����������������");
			}
			
			
		
		else
		{
			System.out.println("���������ݲ�������");
		}

	}
	

}
