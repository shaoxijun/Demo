package Ôú½ð»¨03;

import java.util.*;

public class Player
{
	String name;
	List<Poker> l = new ArrayList<>();
	public Player(String name)
	{
		super();
		this.name = name;
		
	}
	public Player()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return name + ", l=" + l;
	}
	
}
