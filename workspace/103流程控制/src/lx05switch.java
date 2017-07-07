import java.util.Scanner;
public class lx05switch
{

	public static void main(String[] args)
	{
		// 5. 五子棋游戏
				// 棋盘上一个点的数据可能是3种状态
				// 0 没有棋 打印输出显示'+'
				// 1 黑棋 打印输出'*'
				// 2 白棋 打印输出'0'
				// int chess = 1;// 可能的值是 0 1 2
				// 根据chess打印输出对应的字符
		
		
		Scanner sc=new Scanner(System.in);
		int chess;
		System.out.print("请输入可能的值：");
		chess=sc.nextInt();
		if(chess==0)
		{
			System.out.println("+");
			
		}
		else if(chess==1)
		{
			System.out.println("*");
			
		}
		else if(chess==2)
		{
			System.out.println("0");
			
		}
		else
		{
			System.out.println("请输入正确的值");
			
		}
	}

}
