package �����;

public class Mouse
{
	private String brand = "������";
	private String color = "�ڰ�";
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public Mouse(String brand, String color)
	{
		super();
		this.brand = brand;
		this.color = color;
	}
	public Mouse()
	{}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Ʒ��Ϊ��"+brand+"  ��ɫΪ��"+color;
	}
}
