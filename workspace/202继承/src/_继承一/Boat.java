package _继承一;

public class Boat
{
//	/ 4. 定义一个船类
	// 属性:// 名字 最大航速 载客人数
		// 方法:// 开动	// 加速// 停止
	// 子类:
	// 小木船 最大航速 10
	// 快艇 最大航速50
	// 军舰 最大航速100 还具有武器攻击的功能
	String name;
	int maxSpeed;
	int people;
	
	public Boat(String name, int maxSpeed, int people)
	{
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.people = people;
	}
	void satrt()
	{
		System.out.println("我要开始了");
	}
	void addSpeed() 
	{
		System.out.println("我要加速了");
	}
	void stop()
	{
		System.out.println("我要停了");
	}
}
