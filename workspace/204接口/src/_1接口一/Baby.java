package _1�ӿ�һ;

public class Baby
{

	private int hungry;
	private boolean alive = true;
	IFeedAble feedMan;
	IFeedAble ff;
	public int getHungry()
	{
		return hungry;
	}
	public void setHungry(int hungry)
	{
		System.out.println("Ŀǰ������"+hungry);
		this.hungry = hungry;
		if(this.hungry == 60)
		{
			System.out.println("baby�Ѿ�����");
			feedMan.feed(this);
		}
		if(this.hungry == 100)
		{
			 alive=false;
		}
	}
	public boolean alive()
	{
		return alive;
	}
	public void setAlive(boolean isAlive)
	{
		this.alive = isAlive;
	}
	
	
}
