package _9��ϰ;

public class Game
{
	static int date = 1 ;
	static int ss = 0;
	static int jh = 0;
	static int sj = 0;
	static int bj = 0;
	void date(Salesman s)
	{
		while(date <=32)
		{
		
			try
			{	
				s.work();
			} catch (IllException e)
			{
				s.salary -= s.basic/62;
				System.out.println(e.getMessage()+"������"+(int)s.basic/62);
			} catch (ThingException e)
			{
				s.salary -= s.basic/31;
				System.out.println(e.getMessage()+"����Ǯ��"+(int)s.basic/31);
			} catch (MarryException e)
			{
				s.salary = 1000;
				System.out.println(e.getMessage()+"�ϰ巢�����"+1000);
			} catch (DeadPeopleException e)
			{
				s.salary -= 100;
				System.out.println(e.getMessage()+"����Ǯ��"+100);
			}		
			date++;
			if(date == 32)
			{
				System.out.print("һ���½����ˣ��������ת�ˣ�");
				System.out.println((int)s.salary+s.basic);
				break;				
			}
			
		}
	}
}