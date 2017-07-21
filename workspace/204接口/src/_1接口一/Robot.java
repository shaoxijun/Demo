package _1接口一;

public class Robot implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		// TODO Auto-generated method stub
		System.out.println("机器人喂孩子");
		b.setHungry(40);
		
	}

}
