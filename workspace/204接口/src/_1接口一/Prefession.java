package _1�ӿ�һ;

public class Prefession implements IRepairAble
{
	String name;
	Aircondition air;
	@Override
	public void repair()
	{
		// TODO Auto-generated method stub
		air.setDegree(89);
		System.out.println("����"+name+"���Ѿ��޺ÿյ���");
	}
	

}
