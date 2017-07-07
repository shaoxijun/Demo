import java.util.Scanner;
public class lx9
{

	public static void main(String[] args)
	{
		
		// *9. 企业发放的奖金根据利润提成。
				// 利润低于或等于10万元时，奖金可提10%；
				// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
				// 20万到40万之间时，高于20万元的部分，可提成5%；
				// 40万到60万之间时,高于40万元的部分，可提成3%；
				// 60万到100万之间时，高于60万元的部分，可提成1.5%，
				// 高于100万元时，超过100万元的部分按1%提成，
				// 设定一个当月利润，求应发放奖金总数.
		
		
		Scanner sc=new Scanner(System.in);
		long money;
		double e;
		System.out.print("请输入利润");
		money=sc.nextInt();
		if(money<=100000)
		{
			e=money*0.1;
			System.out.println("应发奖金总数为："+e);
			
		}
		else if(money>100000&money<=200000)
		{
			
			e=100000*0.1+(money-100000)*0.075;
			System.out.println("应发奖金总数为："+e);
		}
		
		else if(money>200000&money<=400000)
		{
			
			e=100000*0.1+100000*0.075+(money-200000)*0.05;
			System.out.println("应发奖金总数为："+e);
		}
		else if(money>400000&money<=600000)
		{
			
			e=100000*0.1+100000*0.075+200000*0.05+(money-400000)*0.03;
			System.out.println("应发奖金总数为："+e);
		}
		else if(money>600000&money<=1000000)
		{
			
			e=100000*0.1+100000*0.075+200000*0.05+400000*0.03+(money-600000)*0.015;
			System.out.println("应发奖金总数为："+e);
		}
		else if(money>=1000000)
		{
			
			e=100000*0.1+100000*0.075+200000*0.05+400000*0.03+600000*0.015+(money-1000000)*0.01;
			System.out.println("应发奖金总数为："+e);
		}
		
		
		
		
		
		
	}

}
