import java.util.Scanner;

public class RPG
{
	// 7. 一个N*N地图的RPG游戏 
			// 定义一个二维地图RPG游戏中英雄类
			// 属性:
			// 名字
			// 在地图上的坐标 x y (范围是0~N-1,地图大小N*N)
			// HP,MaxHP
			// MP,MaxHP
			// 方法:
			// 打印英雄的信息 
			// 往某个方向移动
			//  传入方向，然后根据移动方向，修改英雄坐标
			// 	(上 y--,下y++ ,左x--,右x++)，不能走出地图
	Scanner sc = new Scanner(System.in);
	int SIZE = 10;
	String property;
	int[][] map = new int[SIZE][SIZE];
	String name;
	int x,y;
	int HP,MP,MaxHP,MaxMP;
	void information()
	{
		System.out.println("属性："+property+"  名字"+name+"  HP:"+HP+"  MP："+MP+"  MaxHP："+MaxHP+"  MaxMP："+MaxMP);
		
	}
	void direction()
	{
		System.out.println("8 2 4 6分别表示上 下 左 右 ，请选择需要的操作");
		int i = sc.nextInt();
		if(x>=0&&x<=SIZE&&y>=0&&y<=SIZE)
		{	
		switch (i)
		{
			case 8:
				x++;
				break;
			case 2:
				x--;
				break;
			case 4:
				y--;
				break;
			case 6:
				y++;
				break;
			default:
				System.out.println("输入错误");
				
		}
		}
	}
	
}
