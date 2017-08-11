package _99练习;

import java.io.*;

public class Person implements Serializable
{
	// 7. 编写一个联系人类，支持存档
	// 编写若干个联系人，使用对象流写入到文件，再读取显示。
	// 编写一个通讯簿类，含若干个联系人，支持当
	// 创建一个通讯簿，使用对象流写入到文件，再读取显示。
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
