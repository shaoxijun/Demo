import java.util.Scanner;

public class test5
{
	public static void main(String[] args)
	{
		double x,y,z;
		Scanner sc=new Scanner(System. in);
		System.out.print("��������������");
		x= sc.nextDouble();
		y= sc.nextDouble();
		z= sc.nextDouble();
		System.out.println("�����������Ϊ:x="+x+",y="+y+",z="+z);
		System.out.println((x<y?x:y)<z?(x<y?x:y):z);
		
	}
}
