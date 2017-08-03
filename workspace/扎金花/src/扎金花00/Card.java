package Ôú½ð»¨00;

public class Card
{
	
	public String color,size;

	@Override
	public String toString()
	{
		return color+size;
	}

	public Card(String color, String size)
	{
		super();
		this.color = color;
		this.size = size;
	}

	public Card()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
