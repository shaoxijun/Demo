package _1接口一;

public class Grandmother implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		// TODO Auto-generated method stub
		System.out.println("奶奶喂孩子");
		b.setHungry(30);
	}
	
}
