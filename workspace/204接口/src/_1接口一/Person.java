package _1�ӿ�һ;

public class Person implements IRepairAble
{
	String name;
	IFindRoomAble frf;
	IFindRoomAble fra;
	Aircondition air;
//	�ҷ���
	void find()
	{
		a:
		for(int i=1;i<=48;i++)
		{
			for(int j =1;j<8;j++)
			{
				int a = frf.findroom();
				int b = fra.findroom();
				if(a==1000)
				{
					System.out.print("��"+i+"��   "+"����"+j+"С���ҵ��ļ۸�"+a);
					System.out.println("����С���ҵ����ʵķ�����");
					break a;
				}
				else if(b==1000)
				{
					System.out.print("��"+i+"��   "+"����"+j+"�н��ҵ��ļ۸�"+b);
					System.out.println("�н��ҵ����ʵķ�����");
					break a;
				}
				System.out.println("��"+i+"��   "+"����"+j+"�н��ҵ��ļ۸�"+b);
				System.out.println("��"+i+"��   "+"����"+j+"С���ҵ��ļ۸�"+a);
			}
		}
	}
//	�޿յ�
@Override
public void repair()
{
	// TODO Auto-generated method stub
	
	System.out.println("����"+name+"���Ѿ��޺ÿյ���");
	air.setDegree(0);
}
	
	
}
