package _99练习;

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
		// 1. 使用代码实现以下功能
		// * 在e盘创建一个目录abc
		// * 在abc下创建一个目录bbb
		// * 在abc下用记事本创建一个文件test.txt,内容"Hello world!"
		// * 将test.txt重命名为test2.txt
		// * 得到test2.txt文件的长度信息
		// * 在bbb下创建一个文件hello.txt
		// * 移动hello.txt到abc下
		// * 删除test2.txt

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
