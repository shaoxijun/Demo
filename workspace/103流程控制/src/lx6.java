import java.util.Scanner;
public class lx6
{

	public static void main(String[] args)
	{
		// 6. 让用户输入1~7,输出中文的星期几
		
		Scanner sc=new Scanner(System.in);
		int week;
		System.out.print("请输入1-7的数字");
		week=sc.nextInt();
		if(week==1)
		{
			System.out.println("今天是周一");
		}
		else if(week==2)
		{
			System.out.println("今天是周二");
		}
		else if(week==3)
		{
			System.out.println("今天是周三");
		}
		else if(week==4)
		{
			System.out.println("今天是周四");
		}
		else if(week==5)
		{
			System.out.println("今天是周五");
		}
		else if(week==6)
		{
			System.out.println("今天是周六");
		}
		else 
		{
			System.out.println("今天是周日");
		}
	}

}
