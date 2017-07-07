
import java.util.Scanner;
public class test2
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a;
		System.out.print("请输入一个数字：");
		a=sc.nextInt();
		System.out.println( (a%2)==0? "偶数":"奇数");
		
		
		
	}
}
