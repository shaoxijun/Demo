package _9��ϰ;

public class Salesman
{
			// ��дһ��ҵ��Ա��
			// ����:���� ���� �̶����� ���½��� ������ɱ��� ����нˮ ���¿�
			// ����:�ϰ�
			// ��������ϰ࣬һ���������۳���Ʒ,�õ�������ɱ��ʵõ�����.
			// ��һ�����ʵ� ������١��¼١���������ϲ�¡���ɥ�µȣ��׳��쳣����100Ԫ
	String name;
	int age;
	double basic;//�̶�����
	double bonus;//���½���
	double rate ;//������ɱ���
	double salary;//����нˮ
	Car c = new Car();
	void work() throws IllException, ThingException, MarryException, DeadPeopleException 
	{
		int ran = (int)(Math.random()*31+1);
		if(ran == 1)
		{
			throw new IllException(name+Game.date+"�ţ������벡��");
		}
		else if(ran == 2)
		{			
			throw new ThingException(name+Game.date+"�ţ��������¼�");
		}
		else if(ran == 3)
		{
			throw new MarryException(name+Game.date+"�ţ������ҽ��");
		}	
		else if(ran == 4)
		{
			throw new DeadPeopleException(name+Game.date+"�ţ�������ɥ��");
		}		
		else 
		{
			double jj = Math.random()*5500*rate;
			bonus += jj;			
			salary += bonus;
			System.out.println(name+Game.date+"�ţ�׬Ǯ��,��ɣ�"+(int)jj+"���۶�Ϊ��"+(int)jj/rate);
		
			if((int)(Math.random()*7) == 2)
			{
				try
				{
					c.drive();
				} catch (TrraficException e)
				{
					salary -= basic/31;
					throw new ThingException(e.getMessage());
				}
			}
		}
	}
}
