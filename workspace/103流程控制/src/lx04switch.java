import java.util.Scanner;
public class lx04switch
{

	public static void main(String[] args)
	{
		// *4. 想办法使用switch实现判断小明成绩的级别 0~100
				// 90~100 优秀
				// 80~89 良好
				// 70~79 中等
				// 60~69 及格
				// 0~59 不及格
		
		Scanner sc=new Scanner(System.in);
		int mark;
		int a=0;
		int b;
		System.out.print("请输入小明的分数：");
		mark=sc.nextInt();
		if(mark>=90&mark<=100)
		{
			a=1;	
		}
		else if(mark>=80&mark<=89)
		{
			a=2;	
		}
		else if(mark>=70&mark<=79)
		{
			a=3;	
		}
		else if(mark>=60&mark<=69)
		{
			a=4;	
		}
		else if(mark>=0&mark<=59)
		{
			a=5;	
		}
		switch(a)
		{
		case 1:
			System.out.println("优秀");
			break;
		case 2:
			System.out.println("良好");
			break;
		case 3:
			System.out.println("中等");
			break;
		case 4:
			System.out.println("及格");
			break;
		case 5:
			System.out.println("不及格");
			break;
		case 0:
			System.out.println("请输入正确的分数");
			break;
		
		}
	}

}
