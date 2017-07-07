import java.util.Scanner;

public class lx06switch
{

	public static void main(String[] args)
	{

		// 6. 假设学校里原先使用ABCDEF评定学生学习等级，当前改为 优秀 良号 及格 不及格
		// 对应关系为 A -> 优秀
		//         B C -> 良好
		//         D E -> 及格
		//         F   -> 不及格
		// 让用户输入一个char型字符.
		// 判断输出对应的中文评价
		
		Scanner sc=new Scanner(System.in);
		String dengji;
		System.out.print("请输入等级：");
		dengji=sc.next();
		switch(dengji)
		{
		case "A":
			System.out.println("优秀");
			break;
		case "B":
			System.out.println("良好");
			break;
		case "C":
			System.out.println("良好");
			break;
		case "D":
			System.out.println("及格");
			break;	
		case "E":
			System.out.println("及格");
			break;	
		case "F":
			System.out.println("不及格");
			break;	
	
		default :
		{
			
			System.out.println("请输入正确的等级");
		}	
		}
		
		
	}

}
