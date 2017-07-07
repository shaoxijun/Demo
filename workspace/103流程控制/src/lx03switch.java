import java.util.Scanner;
public class lx03switch
{
	public static void main(String[] args)
	{
		// 3.
				// 让用户输入两个数,一个操作字符,然后根据字符计算两个数的结果
				// int x;
				// int y;
				// char op;// op 让用户输入:'+''-' '*' '/' '%' 中一个
				// int result;
				// 根据op的符号，对x和y进行计算,结果放到result中，并打印输出

		
		
		Scanner sc=new Scanner(System.in);
		int x,y,result;
		String op;
		System.out.print("请输入两个数字：");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.print("请输入一个符号：");
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
			System.out.println("请输入正确的符号");
		}
				
				
				
				
				
				
		}
		
	}
}
