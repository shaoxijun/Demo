import java.util.Scanner;

public class 猜拳游戏
{

	public static void main(String[] args)
	{
//		1. 编写一个猜拳游戏
		// 电脑使用随机函数出拳
		// 玩家出拳则由玩家输入 0 1 2
		// 玩家进入后可以选择游戏模式
		// 模式1 可以玩20次 (用for) 
		// 模式2 可以一直玩到输20次为止(用while或者dowhile适合)
		// 游戏结束，统计输赢平局次数
		// 游戏结束，显示玩家的积分(赢得次数*10)  	
		// (提示: 先完成1局猜拳游戏。然后再加入更多功能)
		// 1. 玩家出拳
		// 2. 电脑出拳
		// 3. 显示输赢结果
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择游戏模式1或2：");
		int moshi=sc.nextInt();
		System.out.println("你已进入模式"+moshi);
		int moshi1=0;
		int moshi2=0;
		if(moshi==1){moshi1=1;}
		if(moshi==2){moshi2=1;}
		int shu=0,ying=0,ping=0,jifen=0;	
		for(int i=0;i<=19;i++)
		{	
			
			System.out.print("请输入数字0石头，1剪刀，2布：");
			int player=sc.nextInt();					
			int computer=(int)(3*Math.random());
			if(player==0) {System.out.print("我出的是石头，");}
			else if(player==1) {System.out.print("我出的是剪刀，");}
			else if(player==2) {System.out.print("我出的是布，");}
			else {System.out.println("输入有误，游戏结束（你输入0~2）");break;}
			if(computer==0) {System.out.print("电脑出的是石头，");}
			else if(computer==1) {System.out.print("电脑出的是剪刀，");}
			else if(computer==2) {System.out.print("电脑出的是布，");}
			if(player==computer) {ping++;System.out.println("很难受是平局");}	
			else if(player==0&computer==1||player==1&computer==2)
			{
				ying++;
				jifen=ying*10;
				System.out.println("很舒服，我赢了");				
			}
			else if(player==0&computer==2||player==1&computer==0)
			{
				shu++;
				System.out.println("很遗憾，我输了");
			}						
			if(moshi2==1&shu==2)
			{				
				break;
			}
		}
		System.out.println("赢了"+ying+"次，"+"输了"+shu+"次，"+"平了"+ping+"次，"
							+"积分为："+jifen);		
			
		
	}	
}


