package _02编码方式;

import java.io.UnsupportedEncodingException;

public class TestDemo
{

	public static void main(String[] args) throws UnsupportedEncodingException
	{
		// TODO Auto-generated method stub
		String str2 = "我爱你";
		byte[] by2 = str2.getBytes();// 当前默认是GBK
		System.out.println("当前默认:");
		for(int i=0;i<by2.length;i++)
		{
			System.out.print(by2[i]+" ");
		}
		System.out.println();
		
		// 汉字需要2个字节存储
		// 打印的时候是负的
		byte[] by3 = str2.getBytes("GBK");
		System.out.println("GBK:");
		for(int i=0;i<by3.length;i++)
		{
			System.out.print(by3[i]+" ");
		}
		System.out.println();
		byte[] by4 = str2.getBytes("UTF-8");
		System.out.println("UTF-8:");
		for(int i=0;i<by4.length;i++)
		{
			System.out.print(by4[i]+" ");
		}
		System.out.println();
		
	}

}
