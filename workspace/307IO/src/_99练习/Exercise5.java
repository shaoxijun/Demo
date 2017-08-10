package _99练习;
import java.io.*;
import java.util.Arrays;
public class Exercise5
{
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		// 使用记事本新建一个文本内容 e:\igeek\sanguozhi.txt 输入以下数据:
		// 10001,曹操,97,95,98
		// 10002,刘备,93,90,91
		// 10003,孙权,90,87,92
		// 10004,吕布,80,100,95
		// 10005,关羽,85,98,98
		// 创建一个学生类 有以下属性:学号,姓名,智力,武力,统帅
		// 使用字符流从sanguozhi.txt将信息读出，放入到一个学生对象数组中
		// 提示: 读出的字符串先使用\r\n进行分割 得到每一行的数据，再用,号分割，得到每个属性数据
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
		w.write("10001,曹操,97,95,98,");
		w.write("10002,刘备,93,90,91,");
		w.write("10003,孙权,90,87,92,");
		w.write("10004,吕布,80,100,95,");
		w.write("10005,关羽,85,98,98,");
		w.close();
		
	}
	
	
}
