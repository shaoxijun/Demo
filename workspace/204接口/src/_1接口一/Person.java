package _1接口一;

public class Person implements IRepairAble
{
	String name;
	IFindRoomAble frf;
	IFindRoomAble fra;
	Aircondition air;
//	找房子
	void find()
	{
		a:
		for(int i=1;i<=48;i++)
		{
			for(int j =1;j<8;j++)
			{
				int a = frf.findroom();
				int b = fra.findroom();
				if(a==1000)
				{
					System.out.print("第"+i+"周   "+"星期"+j+"小张找到的价格"+a);
					System.out.println("朋友小张找到合适的房子了");
					break a;
				}
				else if(b==1000)
				{
					System.out.print("第"+i+"周   "+"星期"+j+"中介找到的价格"+b);
					System.out.println("中介找到合适的房子了");
					break a;
				}
				System.out.println("第"+i+"周   "+"星期"+j+"中介找到的价格"+b);
				System.out.println("第"+i+"周   "+"星期"+j+"小张找到的价格"+a);
			}
		}
	}
//	修空调
@Override
public void repair()
{
	// TODO Auto-generated method stub
	
	System.out.println("我是"+name+"我已经修好空调了");
	air.setDegree(0);
}
	
	
}
