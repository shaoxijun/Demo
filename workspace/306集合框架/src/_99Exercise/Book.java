package _99Exercise;

public class Book
{
	String bookname;
	float price;
	public Book(String bookname, float price)
	{
		super();
		this.bookname = bookname;
		this.price = price;
	}
	public Book()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "������" + bookname+ ", ��۸�" + price ;
	}
	
}
