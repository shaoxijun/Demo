package _99��ϰ;
import java.io.*;
import java.util.Arrays;
public class Exercise5
{
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		// ʹ�ü��±��½�һ���ı����� e:\igeek\sanguozhi.txt ������������:
		// 10001,�ܲ�,97,95,98
		// 10002,����,93,90,91
		// 10003,��Ȩ,90,87,92
		// 10004,����,80,100,95
		// 10005,����,85,98,98
		// ����һ��ѧ���� ����������:ѧ��,����,����,����,ͳ˧
		// ʹ���ַ�����sanguozhi.txt����Ϣ���������뵽һ��ѧ������������
		// ��ʾ: �������ַ�����ʹ��\r\n���зָ� �õ�ÿһ�е����ݣ�����,�ŷָ�õ�ÿ����������
		File f = new File("e:\\igeek");
		f.mkdirs();
		File f1 = new File(f,"sanguozhi.txt");
		f1.createNewFile();
		write();
		read();
	}
	private static void read() throws IOException
	{
		// TODO Auto-generated method stub
		Reader r = new FileReader("e:\\igeek\\sanguozhi.txt");
		char[] c = new char[1024];
		int a = 0;
		String s=null;
		while(a>-1)
		{
			a = r.read(c);
			if(a>0)
			{
				s = new String(c);
			}
		}
		r.close();
		String[] str = s.split(",");
		Student[] stu = new Student[5];
		for(int i = 0;i<stu.length;i++)
		{
			stu[i] = new Student();
			stu[i].id = str[i*5];
			stu[i].name = str[i*5+1];
			stu[i].chinese = Integer.valueOf(str[i*5+2]);
			stu[i].math = Integer.valueOf(str[i*5+3]);
			stu[i].english = Integer.valueOf(str[i*5+4]);
		}
		for(Student x:stu)
		{
			System.out.println(x);
		}
	}

	private static void write() throws IOException
	{
		// TODO Auto-generated method stub
		Writer w = new FileWriter("e:\\igeek\\sanguozhi.txt");
		w.write("10001,�ܲ�,97,95,98,");
		w.write("10002,����,93,90,91,");
		w.write("10003,��Ȩ,90,87,92,");
		w.write("10004,����,80,100,95,");
		w.write("10005,����,85,98,98,");
		w.close();
		
	}
	
	
}
