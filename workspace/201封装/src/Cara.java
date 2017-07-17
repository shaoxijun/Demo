
public class Cara
{
	// 2. 定义一个车Car类
	// 特性:品牌 型号 颜色 车牌 价格
	// 方法:显示车信息、驾驶
	// 并创建一个具体对象进行测试
	String brand;
	String model;
	String color;
	String num;
	int price;
	void info()
	{
		System.out.println("品牌为："+brand+" 型号为："+model+" 颜色为："+color+" 车牌为："+num+" 价格为："+price);
	}
	void drive()
	{
		System.out.println("我特么开车贼厉害");
	}
	public Cara()
	{
		
		
	}
}
