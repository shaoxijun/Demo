package _99��ϰ;
import java.io.*;
public class Exercise4
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//1.��һ����������һ�������
		InputStream in = new FileInputStream("f:\\1.ASF");
		OutputStream out = new FileOutputStream("f:\\2.ASF");
		InputStream in1 = new FileInputStream("f:\\1.jpg");
		OutputStream out1 = new FileOutputStream("f:\\2.jpg");
		//2.���������ж�ȡ���ݣ�������д�뵽�����
		long t1 = System.currentTimeMillis();
		int b = 0;
		byte[] bt = new byte[1024];
		while(b != -1)
		{
			b = in.read(bt);
			out.write(b);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		in.close();
		out.close();
		
		
		b = 0;
		bt = new byte[1024];
		while(b != -1)
		{
			b = in1.read(bt);
			out1.write(b);
		}
		in1.close();
		out1.close();
	}

}
