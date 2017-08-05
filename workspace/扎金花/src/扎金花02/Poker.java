package ����02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Poker
{
	// 5. ����һ���˿���Poker��
	// ��52���˿��Ʒ���һ��List����
	// д��ϴ�Ʒ����������List�е�Ԫ�ش��ҷ�������һList��
	// ���ƣ���ϴ�õ������η��ƣ�����4���������(��4��List��)
	// ��ӡ��4��������е�����Ϣ
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
			poker1[i].type = "����";
			poker2[i].type = "����";
			poker3[i].type = "����";
			poker4[i].type = "�ݻ�";
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
	
	//ϴ��
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
	//����
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
		System.out.print("��һ���˵��ƣ�");
		for(Poker p:l1)
		{
			System.out.print(p+",  ");
		}
		System.out.print('\n'+"�ڶ����˵��ƣ�");
		for(Poker p:l2)
		{
			System.out.print(p+",  ");
		}
		System.out.print('\n'+"�������˵��ƣ�");
		for(Poker p:l3)
		{
			System.out.print(p+",  ");
		}
		System.out.print('\n'+"���ĸ��˵��ƣ�");
		for(Poker p:l4)
		{
			System.out.print(p+",  ");
		}
	}
	
}
