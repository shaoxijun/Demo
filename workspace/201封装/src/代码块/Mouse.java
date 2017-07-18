package 代码块;

public class Mouse
{
	private String brand = "牧马人";
	private String color = "黑白";
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
		return "品牌为："+brand+"  颜色为："+color;
	}
}
