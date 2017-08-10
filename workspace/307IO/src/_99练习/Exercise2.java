package _99练习;

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
		// 实现类似DOS命令tree的功能
		// 像是某个目录下所有的文件及文件层次信息
		// (可采用递归实现)
		// 如下效果:
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
