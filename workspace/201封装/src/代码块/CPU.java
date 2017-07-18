package 代码块;

public class CPU
{
	private String brand = "Intel";
	private float speed = 4f;
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public float getSpeed()
	{
		return speed;
	}
	public void setSpeed(float speed)
	{
		this.speed = speed;
	}
	public CPU(String brand, float speed)
	{
		super();
		this.brand = brand;
		this.speed = speed;
	}
	public CPU()
	{}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "品牌为："+brand+"  速度："+speed+"GHZ";
	}
}
