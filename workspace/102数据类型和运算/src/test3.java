import java.util.Scanner;
public class test3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char sex;
		System.out.print("请输入性别：");
		sex=sc.next().charAt(0);
		System.out.println(sex=='M'?"男":(sex=='F'?"女":"阴阳人"));
		
//		switch(sex)
//		{
//		case "M":
//				System.out.println("男");
//				break;
//		case "F":
//				System.out.println("女");
//				break;
//		}
		
		
	}
}
