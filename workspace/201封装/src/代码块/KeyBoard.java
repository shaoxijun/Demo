package �����;

public class KeyBoard
{
	private String brand = "cheery";
	private String color = "��ɫ";
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
	public KeyBoard(String brand, String color)
	{
		super();
		this.brand = brand;
		this.color = color;
	}
	public KeyBoard()
	{}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Ʒ��Ϊ��"+brand+"  ��ɫΪ��"+color;
	}
}
