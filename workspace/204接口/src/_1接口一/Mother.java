package _1接口一;

public class Mother implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		System.out.println("老妈喂孩子");
		b.setHungry(0);
	}

}
