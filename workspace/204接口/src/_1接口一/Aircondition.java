package _1�ӿ�һ;

public class Aircondition
{
			// ����һ���յ�����ÿ��һ��ʱ�䣬�ͻỵ,�𻵳̶����1~100
			// ������ˣ��ͱ��ޡ�
			// ���޵Ľ��������𻵳̶���<50,�����ǹ�˾�ڲ���ά������С��
			// �����޿յ���
			// �����ӡһ�¿յ�״̬��		
			// ���޵Ľ��������𻵳̶���>50,������һ��רҵά����Ա
			// �����޿յ�
			// �޸Ĵ�ӡһ�¿յ�״̬��
	private int degree;
	IRepairAble r1;
	IRepairAble r2;
	public int getDegree()
	{
		return degree;
	}

	public void setDegree(int degree)
	{
		System.out.println("�յ�Ŀǰ״̬"+degree);
		this.degree = degree;
		if(this.degree <=50&&this.degree>0)
		{
			r1.repair();
//			System.out.println("5");
		}
		else if(this.degree>50)
		{
			r2.repair();
//			System.out.println("100");
		}
		else
		{System.out.println("�յ�û�л�");}
	}
	
}
