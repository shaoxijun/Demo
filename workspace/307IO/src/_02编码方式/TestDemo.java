package _02���뷽ʽ;

import java.io.UnsupportedEncodingException;

public class TestDemo
{

	public static void main(String[] args) throws UnsupportedEncodingException
	{
		// TODO Auto-generated method stub
		String str2 = "�Ұ���";
		byte[] by2 = str2.getBytes();// ��ǰĬ����GBK
		System.out.println("��ǰĬ��:");
		for(int i=0;i<by2.length;i++)
		{
			System.out.print(by2[i]+" ");
		}
		System.out.println();
		
		// ������Ҫ2���ֽڴ洢
		// ��ӡ��ʱ���Ǹ���
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
