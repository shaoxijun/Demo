import java.util.Scanner;
public class lx03switch
{
	public static void main(String[] args)
	{
		// 3.
				// ���û�����������,һ�������ַ�,Ȼ������ַ������������Ľ��
				// int x;
				// int y;
				// char op;// op ���û�����:'+''-' '*' '/' '%' ��һ��
				// int result;
				// ����op�ķ��ţ���x��y���м���,����ŵ�result�У�����ӡ���

		
		
		Scanner sc=new Scanner(System.in);
		int x,y,result;
		String op;
		System.out.print("�������������֣�");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.print("������һ�����ţ�");
		op=sc.next();
		switch(op)
		{
		case "+":
				result=x+y;
				System.out.println(result);
				break;
		case "-":
			result=x-y;
			System.out.println(result);
			break;
		case "*":
			result=x*y;
			System.out.println(result);
			break;		
				
		case "/":
			result=x/y;
			System.out.println(result);
			break;		
		case "%":
			result=x%y;
			System.out.println(result);
			break;		
		default:
		{
			System.out.println("��������ȷ�ķ���");
		}
				
				
				
				
				
				
		}
		
	}
}
