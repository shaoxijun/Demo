package _�̳�һ;

public class Boat
{
//	/ 4. ����һ������
	// ����:// ���� ����� �ؿ�����
		// ����:// ����	// ����// ֹͣ
	// ����:
	// Сľ�� ����� 10
	// ��ͧ �����50
	// ���� �����100 ���������������Ĺ���
	String name;
	int maxSpeed;
	int people;
	
	public Boat(String name, int maxSpeed, int people)
	{
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.people = people;
	}
	void satrt()
	{
		System.out.println("��Ҫ��ʼ��");
	}
	void addSpeed() 
	{
		System.out.println("��Ҫ������");
	}
	void stop()
	{
		System.out.println("��Ҫͣ��");
	}
}
