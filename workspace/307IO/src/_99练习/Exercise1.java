package _99��ϰ;

import java.io.*;

public class Exercise1
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		exercise1();

		
	}


	private static void exercise1() throws IOException
	{
		// 1. ʹ�ô���ʵ�����¹���
		// * ��e�̴���һ��Ŀ¼abc
		// * ��abc�´���һ��Ŀ¼bbb
		// * ��abc���ü��±�����һ���ļ�test.txt,����"Hello world!"
		// * ��test.txt������Ϊtest2.txt
		// * �õ�test2.txt�ļ��ĳ�����Ϣ
		// * ��bbb�´���һ���ļ�hello.txt
		// * �ƶ�hello.txt��abc��
		// * ɾ��test2.txt

		// TODO Auto-generated method stub
		File f1 = new File("e:\\abc\\bbb");
		f1.mkdirs();
		File f2 = new File("e:\\abc\\test.txt");
		f2.createNewFile();
		OutputStream o = new FileOutputStream("e:\\abc\\test.txt");
		// byte[] word = new byte[] {'H','e','l','l','o','
		// ','W','o','r','l','d','!'};
		// o.write(word);
		String s = "Hello World!";
		byte[] b = s.getBytes();
		o.write(b);
		o.close();
		File f3 = new File("e:\\abc\\test2.txt");
		f2.renameTo(f3);
		System.out.println(f3.length());
		File f4 = new File(f1, "hello.txt");
		f4.createNewFile();
		File f5 = new File("e:\\abc", "hello.txt");
		f4.renameTo(f5);
		f3.delete();
	}

}
