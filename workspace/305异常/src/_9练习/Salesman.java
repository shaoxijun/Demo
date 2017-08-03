package _9练习;

public class Salesman
{
			// 编写一个业务员类
			// 属性:名字 年龄 固定工资 当月奖金 销售提成比例 当月薪水 当月扣
			// 方法:上班
			// 如果正常上班，一定概率销售出产品,得到根据提成比率得到奖金.
			// 有一定概率的 生病请假、事假、车祸、办喜事、办丧事等，抛出异常，扣100元
	String name;
	int age;
	double basic;//固定工资
	double bonus;//当月奖金
	double rate ;//销售提成比例
	double salary;//当月薪水
	Car c = new Car();
	void work() throws IllException, ThingException, MarryException, DeadPeopleException 
	{
		int ran = (int)(Math.random()*31+1);
		if(ran == 1)
		{
			throw new IllException(name+Game.date+"号，今天请病假");
		}
		else if(ran == 2)
		{			
			throw new ThingException(name+Game.date+"号，今天请事假");
		}
		else if(ran == 3)
		{
			throw new MarryException(name+Game.date+"号，今天我结婚");
		}	
		else if(ran == 4)
		{
			throw new DeadPeopleException(name+Game.date+"号，今天请丧假");
		}		
		else 
		{
			double jj = Math.random()*5500*rate;
			bonus += jj;			
			salary += bonus;
			System.out.println(name+Game.date+"号，赚钱了,提成："+(int)jj+"销售额为："+(int)jj/rate);
		
			if((int)(Math.random()*7) == 2)
			{
				try
				{
					c.drive();
				} catch (TrraficException e)
				{
					salary -= basic/31;
					throw new ThingException(e.getMessage());
				}
			}
		}
	}
}
