import java.util.Scanner;
public class test3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char sex;
		System.out.print("�������Ա�");
		sex=sc.next().charAt(0);
		System.out.println(sex=='M'?"��":(sex=='F'?"Ů":"������"));
		
//		switch(sex)
//		{
//		case "M":
//				System.out.println("��");
//				break;
//		case "F":
//				System.out.println("Ů");
//				break;
//		}
		
		
	}
}
