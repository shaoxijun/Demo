package ��װ������;

public class General
{
	// 5. ����һ���佫�� General�࣬
			// �ṩsetter getter����
			// �ṩ��������췽�����޲����Ĺ��췽��
			// �ṩ��ӡ�ķ���
			// ����General����洢������Ϣ,��ӡ���
			// ���� ���� ���� ����
			// ���� 48 78 85
			// �ܲ� 52 88 90
			// ��Ȩ 45 75 75
			// ���� 35 100 65
	private String name;
	private int old;
	private int force;
	private int IQ;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getOld()
	{
		return old;
	}
	public void setOld(int old)
	{
		this.old = old;
	}
	public int getForce()
	{
		return force;
	}
	public void setForce(int force)
	{
		this.force = force;
	}
	public int getIQ()
	{
		return IQ;
	}
	public void setIQ(int iQ)
	{
		IQ = iQ;
	}
	public General(String name, int old, int force, int iQ)
	{
		super();
		this.name = name;
		this.old = old;
		this.force = force;
		IQ = iQ;
	}
	public General()
	{
		
	}
	
}
