package _1�ӿ�һ;

public class Mother implements IFeedAble
{

	@Override
	public void feed(Baby b)
	{
		System.out.println("����ι����");
		b.setHungry(0);
	}

}
