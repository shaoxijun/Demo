package _99��ϰ;

import java.io.*;

public class Exercise2
{

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		exercise2("e:\\abc","|-");
	}
	private static void exercise2(String s1,String s2) throws FileNotFoundException
	{
		// ʵ������DOS����tree�Ĺ���
		// ����ĳ��Ŀ¼�����е��ļ����ļ������Ϣ
		// (�ɲ��õݹ�ʵ��)
		// ����Ч��:
		// e:\niit
		// 	|- 1.txt
		//	|- 2.txt
		// 	|- 3.txt
		// 	|- aaa
		// 		|- ccc
		// 	|- eee
		// 		|- a1.txt
		// 		|- a2.txt
		// 		|- a3.txt
		// 		|- bbb
		// TODO Auto-generated method stub
//		File f = new File("e:\\abc");
//		System.out.println(f.getAbsolutePath());
		File f = new File(s1);
		File[] cf = f.listFiles();
		for(int i=0;i<cf.length;i++)
		{
			System.out.println(s2+ cf[i].getName());
			if(cf[i].isDirectory())
			{
				exercise2(cf[i].getPath(),"   "+s2);
			}
		}
	}
}
