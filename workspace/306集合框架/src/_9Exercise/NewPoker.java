package _9Exercise;

import java.util.*;

public class NewPoker
{
	String[] type = new String[] {"ºìÌÒ","ºÚÌÒ","·½¿é","²İ»¨"};
	String[] size = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	int id;
	public NewPoker(int i)
	{
		this.id = i;
	}
	
	public NewPoker()
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
	List poker()
	{
		List<NewPoker> l = new ArrayList<>();
		for(int i=0;i<52;i++)
		{
			l.add(new NewPoker(i));
		}
		Collections.shuffle(l);
		return l;
	}
	
}
