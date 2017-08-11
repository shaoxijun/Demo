package _99练习;
import java.io.*;
import java.util.Arrays;
public class Exercise8
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		// 8. 不看例子，仅参考API文档
		// 分别采用InputStream Reader RandomAccessFile三种方式读取一个文本文件a.txt
		// 显示文件内容
		
//		read();//字节流
//		read1();
		read2();
		
	}

	private static void read2() throws IOException
	{
		// TODO Auto-generated method stub
		RandomAccessFile f = new RandomAccessFile(new File("e:\\e6.txt"),"rw");
		f.seek(2);
//		System.out.println(f.readLine());
//		f.readUTF();
		f.writeUTF("nijiusgeshabi");
//		System.out.println(f.readUTF());
		System.out.println(f.readLine());
		f.close();
	}

	private static void read1() throws IOException
	{
		// TODO Auto-generated method stub
		Reader in = new FileReader("e:\\e6.txt");
		int len = 0;
		char[] c = new char[1024];
		while(len != -1)
		{
			len = in.read(c);
			if(len>-1)
			{
				String s = Arrays.toString(c);
				System.out.println(s);
			}
		}
		in.close();
	}

	private static void read() throws IOException
	{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("e:\\e6.txt");
//		OutputStream out = new FileOutputStream("e:\\e6.txt");
		int len = 0;
		byte[] c = new byte[1024];
		while(len != -1)
		{
			
			len = in.read(c);
//			System.out.println(len);
			if(len>-1)
			{		
				String s = Arrays.toString(c);
				System.out.println(s);
			}
		}
		in.close();
//		out.close();
	}
	
	
	
}
