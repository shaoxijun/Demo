package ��װ������;

import java.util.Scanner;

public class AddressBook
{
	private String book = "ͨѶ¼";
	private String group = "ͬѧ";
	Scanner sc = new Scanner(System.in);
	public String getBook()
	{
		return book;
	}
	public void setBook(String book)
	{
		this.book = book;
	}
	public String getGroup()
	{
		return group;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
	public AddressBook(String book, String group)
	{
		super();
		this.book = book;
		this.group = group;
	}
	public AddressBook()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	String n = sc.next();
	String nu = sc.next();
	 
	
	AddressCard ac = new AddressCard(n,nu);
	
	
	
	@Override
	public String toString()
	{
		return  book + "   ��� " + group + ac;
	}
	
}
