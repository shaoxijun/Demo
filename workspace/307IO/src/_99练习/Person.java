package _99��ϰ;

import java.io.*;

public class Person implements Serializable
{
	// 7. ��дһ����ϵ���֧࣬�ִ浵
	// ��д���ɸ���ϵ�ˣ�ʹ�ö�����д�뵽�ļ����ٶ�ȡ��ʾ��
	// ��дһ��ͨѶ���࣬�����ɸ���ϵ�ˣ�֧�ֵ�
	// ����һ��ͨѶ����ʹ�ö�����д�뵽�ļ����ٶ�ȡ��ʾ��
	String name;
	String num;
	boolean sex;
	String address;
	public Person(String name, String num, boolean sex, String address)
	{
		super();
		this.name = name;
		this.num = num;
		this.sex = sex;
		this.address = address;
	}
	@Override
	public String toString()
	{
		return name + ", " + num + ", " + sex + ", " + address ;
	}
	
}
