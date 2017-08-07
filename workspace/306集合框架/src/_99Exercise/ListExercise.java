package _99Exercise;

import java.util.*;

public class ListExercise
{
	public static void main(String[] args)
	{
		//---------------------------------------------------------
		// List 练习
		//---------------------------------------------------------		
		// 4. 创建两个List容器对象l1 l2
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		// *** 添加 ***
		// * l1 添加 "A" "B" "C" 三个元素
		l1.add("A");
		l1.add("B");
		l1.add("C");
		// * l2 添加 "D" "E" "F" "Egg" "Eee"
		l2.add("D");
		l2.add("E");
		l2.add("F");
		l2.add("Egg");
		l2.add("Eee");
		// * 将l2的中的所有元素加入到l1中
		l1.addAll(l2);
		System.out.println(l1);
		// *** 修改 ***
		// * 将l1中索引为2位置的改为"Z"
		l1.set(2, "Z");
		System.out.println(l1);
		// *** 显示、获取 ***
		// * 打印显示l1 l2的大小
		System.out.println("l1的大小"+l1.size()+",l2的大小"+l2.size());
		// * 显示l1中下标为1的元素
		System.out.println(l1.get(1));
		// *** 删除 ***
		// * 将l1中索引为1的对象删除
		l1.remove(1);
		l1.add("B");
		System.out.println(l1);
		// * 将l1中第一个内容为"B"的对象删除
		Iterator it1 = l1.iterator();
		while(it1.hasNext())
		{
			String n = (String) it1.next();
			if(n.startsWith("B"))
			it1.remove();
		}
		System.out.println(l1);
		// *** 迭代器遍历 ***
		Iterator it2 = l1.iterator();
		while(it2.hasNext())
		{
			String n = (String) it2.next();
			System.out.print(n+",");
		}
		System.out.println();
		// * 使用迭代器遍历容器，删除含E的对象
		Iterator it3 = l1.iterator();
		while(it3.hasNext())
		{
			String n = (String) it3.next();
			if(n.contains("E"))
				it3.remove();			
		}
		System.out.println(l1);

		// 5. 定义一个扑克牌Poker类
		// 将52张扑克牌放入一个List对象
		// 写个洗牌方法，将这个List中的元素打乱放入另外一List中
		// 发牌，将洗好的牌依次发牌，发给4个玩家手里(即4个List中)
		// 打印这4个玩家手中的牌信息
		Poker p5 = new Poker();
		p5.deal();

		// 6. 定义一个Student类，并使用List容器存放以下数据
		// 学号 名字 英语 数学 语文
		// 10001 张三 98 34 89
		// 10002 李四 75 78 89
		// 10003 王五 38 82 100
		// 10004 赵六 87 86 75
		// 10005 小乔 29 100 98
		// 10006 曹操 87 65 100
		// 1. 使用多种方式遍历该容器内元素，并打印
		// 2. 查询打印赵六的成绩
		// 3. 移除王五
		// 4. 曹操因为作弊被抓，修改曹操的数学成绩为0分
//		战略性放弃
	}
}
