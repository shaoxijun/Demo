package _1�ӿ�һ;

public class Grandmother implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		// TODO Auto-generated method stub
		System.out.println("����ι����");
		b.setHungry(30);
	}
	
}
