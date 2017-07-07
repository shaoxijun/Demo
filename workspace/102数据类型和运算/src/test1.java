import java.util.Scanner;
public class test1
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a,b;
		System.out.print("请分别输入长和宽：");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a="+a+",b="+b);
		double area =a*b;
		double L=2*(a+b);
		System.out.println("面积:"+area);
		System.out.println("周长:"+L);
		
		
	}
}
