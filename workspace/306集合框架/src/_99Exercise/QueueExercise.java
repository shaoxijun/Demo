package _99Exercise;

import java.util.*;

public class QueueExercise
{
	static Deque<Integer> d = new LinkedList<>();
	static int num = 1;
	static int take()
	{
		
		d.offerLast(num);
		num++;
		
		return d.peekLast();
	}

	public static void main(String[] args) throws InterruptedException
	{
		// 7 编写一个医院、银行叫号系统
		// 取号()
		// 叫号()
		int a =20;
		System.out.println("每天规定只能叫"+a+"个顾客，多了走开");	
		while(true)
		{
				int ran = (int)(Math.random()*2);
				Thread.sleep(300);
				switch(ran)
				{
				case 0:
					String t = "顾客取号,当前排队编号"+take()+"，您前面还有"+(d.peekLast()-d.peekFirst())+"位顾客在等待";
					System.out.println(t);
					a--;
					break;
				case 1:
					if(d.peekFirst() == null)
					{
						System.out.println("我叫了，但没人在排队");
						continue;
					}else
					{
						System.out.println("窗口叫号,请编号为"+d.pollFirst()+"的顾客到窗口");
						
						break;
					}
				}
				
				if(a==0)
					break;
		}
		while(true)
		{
			if(d.peekLast() != null)
			{
				System.out.println("窗口叫号,请编号为"+d.pollFirst()+"的顾客到窗口");
			}else 
			{
				System.out.println("今天的任务完成");
				break;
				
			}
				
		}
		// 需要有一个队列保存排队信息
		// 需要有个变量保存当前最大号码是多少

		// 编写测试代码进行测试:
		// 编写一个死循环，循环随机调用取号或者叫号方法，等待500ms
		// 显示类似如下信息
		// 顾客取号,当前排队编号1，您前面还有0位顾客在等待
		// 顾客取号,当前排队编号2，您前面还有1位顾客在等待
		// 顾客取号,当前排队编号3，您前面还有2位顾客在等待
		// 窗口叫号,请编号为1的顾客到窗口.
		// 窗口叫号,请编号为2的顾客到窗口.
		// 顾客取号,当前排队编号4，您前面还有1位顾客在等待
		// 顾客取号,当前排队编号5，您前面还有2位顾客在等待
		// 窗口叫号,请编号为3的顾客到窗口.
		// 窗口叫号,请编号为4的顾客到窗口.
		// 窗口叫号,请编号为5的顾客到窗口.
		// 窗口叫号.当前没有顾客在等待
		// 窗口叫号.当前没有顾客在等待
		// 顾客取号,当前排队编号6，您前面还有0位顾客在等待		

	}

}
