package 扎金花02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Poker
{
	// 5. 定义一个扑克牌Poker类
	// 将52张扑克牌放入一个List对象
	// 写个洗牌方法，将这个List中的元素打乱放入另外一List中
	// 发牌，将洗好的牌依次发牌，发给4个玩家手里(即4个List中)
	// 打印这4个玩家手中的牌信息
	String type;
	String size;
	
	@Override
	public String toString()
	{
		return  type + ", " + size ;
	}

	List<Poker> push()
	{
		Poker[] poker1 = new Poker[13];
		Poker[] poker2 = new Poker[13];
		Poker[] poker3 = new Poker[13];
		Poker[] poker4 = new Poker[13];
		for(int i=0;i<13;i++)
		{
			poker1[i] = new Poker();
			poker2[i] = new Poker();
			poker3[i] = new Poker();
			poker4[i] = new Poker();
			poker1[i].type = "方块";
			poker2[i].type = "红桃";
			poker3[i].type = "黑桃";
			poker4[i].type = "草花";
			if(i==1)
			{
				poker1[1].size = "A";
				poker2[1].size = "A";
				poker3[1].size = "A";
				poker4[1].size = "A";
			}
			else if(i==11)
			{
				poker1[11].size = "J";
				poker2[11].size = "J";
				poker3[11].size = "J";
				poker4[11].size = "J";
			}
			else if(i==12)
			{
				poker1[12].size = "Q";
				poker2[12].size = "Q";
				poker3[12].size = "Q";
				poker4[12].size = "Q";
			}
			else if(i==0)
			{
				poker1[0].size = "K";
				poker2[0].size = "K";
				poker3[0].size = "K";
				poker4[0].size = "K";
			}
			else
			{
				poker1[i].size = ""+i;
				poker2[i].size = ""+i;
				poker3[i].size = ""+i;
				poker4[i].size = ""+i;
			}
		}
		List<Poker> p = new ArrayList<>();
		for(int i =0;i<poker1.length;i++)
		{
			p.add(poker1[i]);
			p.add(poker2[i]);
			p.add(poker3[i]);
			p.add(poker4[i]);
		}
		return p;
	}
	
	//洗牌
	List<Poker> shuffle() 
	{
		List<Poker> ll = push();
		Iterator<Poker> it = ll.iterator();
		while(it.hasNext())
		{
			Poker p = it.next();
			int index = (int)(Math.random()*52);
			ll.set(index, p);
		}
		return ll;
	}
	//发牌
	void deal()
	{
		List<Poker> ll = shuffle();
		List<Poker> l1 = new ArrayList<>();
		List<Poker> l2 = new ArrayList<>();
		List<Poker> l3 = new ArrayList<>();
		List<Poker> l4 = new ArrayList<>();
		Iterator<Poker> it = ll.iterator();
		int i=1;
		int a = 0;
		while(it.hasNext())
		{			
			
			if(a == 12)break;
			Poker p = it.next();
			if(i==1)
				l1.add(p);
			if(i==2)
				l2.add(p);
			if(i==3)
				l3.add(p);
			if(i==4)
			{	
				l4.add(p);
				i=0;
			}
			i++;
			a++;
		}
		System.out.print("第一个人的牌：");
		for(Poker p:l1)
		{
			System.out.print(p+",  ");
		}
		System.out.print('\n'+"第二个人的牌：");
		for(Poker p:l2)
		{
			System.out.print(p+",  ");
		}
		System.out.print('\n'+"第三个人的牌：");
		for(Poker p:l3)
		{
			System.out.print(p+",  ");
		}
		System.out.print('\n'+"第四个人的牌：");
		for(Poker p:l4)
		{
			System.out.print(p+",  ");
		}
	}
	
}
