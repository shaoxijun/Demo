package �����;

public class Memory
{
	private String brand = "��ʿ��";
	private int size = 8;
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public int getSize()
	{
		return size;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	public Memory(String brand, int size)
	{
		super();
		this.brand = brand;
		this.size = size;
	}
	public Memory()
	{}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Ʒ��Ϊ��"+brand+"  �ڴ��СΪ��"+size;
	}
	
}
