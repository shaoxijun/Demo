package 匿名内部类;

public class test
{
	public static void main(String[] args)
	{	
			// 1. 定义一个职员的抽象类
			// 定义一个抽象方法 void work
			// 定义一个业务员匿名类，从职员继承，调用work方法测试 
			// 实现方法work()  打印输出: 出去跑业务了!
			// 定义一个程序员匿名类，并创建匿名对象
			// 实现方法work()  打印输出: 开始码代码了!
			// 定义一个策划匿名类，并创建匿名对象
			// 实现方法work()  打印输出: 开始写策划文档了!
			abstract class Clerk
			{
				abstract void work();
			}
			Clerk saleMan = new Clerk()
					{
						@Override
						void work()
						{
							System.out.println("出去跑业务啦！");
						}						
					};
				saleMan.work();	
			new Clerk()
					{
						@Override
						void work()
						{
							System.out.println("我要敲代码了！");
						}
				
					}.work();;
			Clerk plane = new Clerk()
					{

						@Override
						void work()
						{
							System.out.println("开始写策划文档了!");
						}				
					};
					plane.work();
	}
}
