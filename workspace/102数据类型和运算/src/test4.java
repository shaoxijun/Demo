import java.util.Scanner;
public class test4
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.print("请输入连个数；");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("输入的数为：x="+x+",y="+y);
		System.out.println(x<y?x:y);

	}

}
