package _1�ӿ�һ;

public class Father implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		System.out.println("�ϰ�ι����");
		b.setHungry(20);
	}
	
}
