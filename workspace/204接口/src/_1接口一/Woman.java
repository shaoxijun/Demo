package _1�ӿ�һ;

public class Woman
{
	// ÿ����������� ����շ�����()
	// �������������� ����()
	// ���յ��������� �㿴��Ӱ()
	// Man��ʵ�������ѽӿ�
	String name;
	IBoyfriendAble bf;
	void dosomething()
	{
		for(int a=0;a<2;a++)
		{
			for(int i=1;i<8;i++)
			{
				System.out.println("������"+i);
				bf.cook();
				if(i == 6)
					bf.goStreet();
				if(i == 7)
					bf.watchFilm();
			}
		}
	}
}
