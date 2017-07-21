package _1接口一;

public class Friend implements IFindRoomAble
{
	@Override
	public int findroom()
	{
		
		// 如果小张帮他找，每天能找到一处价格约500~4000的房子
				int a = ((int)(35*Math.random()))*100+500;
				return a;
	}
	String name ;
	
	 

	

	
	

	

	
}
