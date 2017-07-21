package _1接口一;

public class Prefession implements IRepairAble
{
	String name;
	Aircondition air;
	@Override
	public void repair()
	{
		// TODO Auto-generated method stub
		air.setDegree(89);
		System.out.println("我是"+name+"我已经修好空调了");
	}
	

}
