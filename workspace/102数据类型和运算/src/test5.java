import java.util.Scanner;

public class test5
{
	public static void main(String[] args)
	{
		double x,y,z;
		Scanner sc=new Scanner(System. in);
		System.out.print("请输入三个数：");
		x= sc.nextDouble();
		y= sc.nextDouble();
		z= sc.nextDouble();
		System.out.println("输入的三个数为:x="+x+",y="+y+",z="+z);
		System.out.println((x<y?x:y)<z?(x<y?x:y):z);
		
	}
}
