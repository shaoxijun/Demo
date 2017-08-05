package Ôú½ğ»¨03;

import java.util.*;



public class Poker
{
	String[] type = new String[] {"ºìÌÒ","ºÚÌÒ","·½¿é","²İ»¨"};
	String[] size = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	int id;
	
	public int getType()
	{
		return id/13;
	}
	public int getSize()
	{
		return id%13;
	}
	public Poker(int a)
	{
		super();
		this.id = a;
//		this.type = type[a/13];
//		this.size = size[a%13];
	}
	public Poker()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString()
	{
		int t = id/13;
		int s = id%13;
		return type[t]+size[s];
	}
	
	List<Poker> shuffle()
	{
		List<Poker> p = new ArrayList<>();
		for(int i =0;i<52;i++)
		{
			p.add(new Poker(i));
		}
		Collections.shuffle(p);
		return p;
	}
	
	void deal(Player pl)
	{		
		int i=1;
		int a = 0;
		Iterator<Poker> it = shuffle().iterator();
		while(it.hasNext())
		{			
			
			if(a > 2)break;
			Poker p = it.next();
			pl.l.add(p);
			it.remove();
			a++;
		}
	}
	
	
	
}
