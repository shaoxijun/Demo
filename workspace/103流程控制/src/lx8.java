import java.util.Scanner;
public class lx8
{

	public static void main(String[] args)
	{
		// 8. 让用户输入3个数x,y,z输出最小数.(条件嵌套)
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("请分别输入三个数");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("你输入的三个数为："+a+","+b+","+c);
		
		if(a<b)
		{
			if (a<c)
			{
				System.out.println("三个数中最小的为："+a);
				
			}
			else
			{
				System.out.println("三个数中最小的为："+c);
			}
			
		}
		
		else if(a>b)
		{
			if(b>c)
			{
				System.out.println("三个数中最小的为："+c);
				
			}
			else
			{
				System.out.println("三个数中最小的为："+b);
			}
			
		}
	}

}
