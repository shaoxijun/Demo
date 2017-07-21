package _1接口一;

public class Father implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		System.out.println("老爸喂孩子");
		b.setHungry(20);
	}
	
}
