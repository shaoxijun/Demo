import java.util.Scanner;
public class lx4
{

	public static void main(String[] args)
	{
		// 4. 让用户输入小明的成绩,判断优良中下
				// 如果不在0~100范围内提示用户错误的成绩信息。
				// 优 90~100
				// 良 80~89
				// 中 70~79
				// 及格 60~69
				// 不及格 0~59
		
		
		Scanner sc=new Scanner(System.in);
		int mark;
		System.out.print("请输入小明的成绩：");
		mark=sc.nextInt();
		
		if(mark>=90&mark<=100)
		{	
			System.out.println("小明的成绩为："+mark);
			System.out.println("优");
			
		}
		else if(mark>=80&mark<=89)
		{
			System.out.println("小明的成绩为："+mark);
			System.out.println("良");
			
		}
		
		else if(mark>=70&mark<=79)
		{
			System.out.println("小明的成绩为："+mark);
			System.out.println("中");
			
		}
		else if(mark>=60&mark<=69)
		{
			System.out.println("小明的成绩为："+mark);
			System.out.println("及格");
			
		}
		else if(mark>=00&mark<=59)
		{
			System.out.println("小明的成绩为："+mark);
			System.out.println("不及格");
			
		}
		else
		{
			System.out.println("成绩输入错误，请重新输入。");
			
		}
		
		
		
		
	}

}
