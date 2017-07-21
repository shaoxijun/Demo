package _1接口一;

public class Woman
{
	// 每天调用男朋友 买菜烧饭方法()
	// 周六调用男朋友 陪逛街()
	// 周日调用男朋友 陪看电影()
	// Man类实现男朋友接口
	String name;
	IBoyfriendAble bf;
	void dosomething()
	{
		for(int a=0;a<2;a++)
		{
			for(int i=1;i<8;i++)
			{
				System.out.println("今天周"+i);
				bf.cook();
				if(i == 6)
					bf.goStreet();
				if(i == 7)
					bf.watchFilm();
			}
		}
	}
}
