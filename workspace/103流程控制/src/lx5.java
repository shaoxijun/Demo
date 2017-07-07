import java.util.Scanner;
public class lx5
{

	public static void main(String[] args)
	{
		// 5. 输入一个年份，判断是否是闰年(整百年需要被400整除是闰年，不是整百年被4整除是闰年)
				// 整百年 如2000是闰年 2100年不是闰年
		
		
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.print("请输入年份");
		year=sc.nextInt();
		System.out.println("你输入的年份为："+year);
		if(year%400==0)
		{	
			
				System.out.println("你输入的年份是闰年");
		}
		else if(year%4==0&&year%100!=0)
			{
				System.out.println("你输入的年份是闰年");
			}
			
			
		
		else
		{
			System.out.println("你输入的年份不是闰年");
		}

	}
	

}
