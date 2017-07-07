import java.util.Scanner;
public class lx3
{

	public static void main(String[] args)
	{
		// 3. 让用户输入1个数,判断是否是工作日(if...else...)
		Scanner sc =new Scanner(System.in);
		int day;
		System.out.print("请输入日期");
		day=sc.nextInt();
		System.out.println("输入的日期为："+day);
		if(day<=5&day>+1)
		{
			System.out.println("是工作日");
			
		}
		else
		{
			System.out.println("不是工作日");
			
		}
	}

}
