package ��װ������;

public class House
{
	// 2. ����һ��������Ϣ��,�ṩsetter,getter��������setter������������ֵ�ں���Χ��
			// ����:
			// ��ַ
			// �۸�(w/ƽ����)
			// ���
			// ¥����¥����(1~300)
			// ����¥��(-3~��¥����)
			// �ܼ�
	private String property;
	private String address;
	private int price;
	private int area;
	private int totalFloors;
	private int atFloor;
	private int totalPrice;
	
	
	public String getProperty()
	{
		return property;
	}
	public void setProperty(String property)
	{
		this.property = property;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		if(price<=10&&price>=1)
		{
			this.price = price;
		}
		else {System.out.println("�������");}
	}
	public int getArea()
	{
		return area;
	}
	public void setArea(int area)
	{
		if(area>=1&&area<=100)
		{
			this.area = area;
		}
		else {System.out.println("�������");}
	}
	public int getTotalFloors()
	{
		return totalFloors;
	}
	public void setTotalFloors(int totalFloors)
	{
		if(totalFloors>=1&&totalFloors<=300)
		{
			this.totalFloors = totalFloors;
		}
		else {System.out.println("�������");}
	}
	public int getAtFloor()
	{
		return atFloor;
	}
	public void setAtFloor(int atFloor)
	{
		if(atFloor<=297&&atFloor>=-3)
		{
			this.atFloor = atFloor;
		}
		else {System.out.println("�������");}
	}
	public int getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice)
	{
		if(totalPrice<0&&totalPrice>=300)
		{
			this.totalPrice = totalPrice;
		}
		else {System.out.println("�������");}
	}
	
}
