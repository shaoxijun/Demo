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
<<<<<<< HEAD
	int ss = 0;
	int jh = 0;
	int sj = 0;
	int bj = 0;
	void work() throws IllException, ThingException, MarryException, DeadPeopleException 
	{
		
		int ran = (int)(Math.random()*31+1);
		if(ran == 1)
		{
			if(Game.bj>=5)
			{
				bj++;
				System.out.println("***������벡�ٳ������죬��������");
				work();				
			}else
			{
				bj++;
				throw new IllException(name+Game.date+"�ţ������벡��");
			}			
		}
		else if(ran == 2)
		{			
			
			if(sj>=5)
			{
				System.out.println("***�������ٳ������죬��������");
				work();
				sj++;
			}else
			{
				sj++;
				throw new ThingException(name+Game.date+"�ţ��������¼�");
			}
			
		}
		else if(ran == 3)
		{
			
			if(jh>=1)
			{
				jh++;
				System.out.println("***ÿ��������һ�λ飬����ȥ�ϰ�");
				work();
				
			}else
			{
				jh++;
				throw new MarryException(name+Game.date+"�ţ������ҽ��");
			}
			
		}	
		else if(ran == 4)
		{
			
			if(ss>=1)
			{
				ss++;
				System.out.println("***���������������������ȥ�ϰ�");
				work();

				
			}else
			{
				ss++;
				throw new DeadPeopleException(name+Game.date+"�ţ�������ɥ��");
			}			
=======
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
>>>>>>> 7059dc851c41379569a06af8bf4495f9dc87c5e2
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
