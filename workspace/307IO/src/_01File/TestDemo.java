package _01File;

import java.io.File;
import java.io.IOException;

public class TestDemo
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		create();
	}

	private static void create() throws IOException
	{
		// TODO Auto-generated method stub
		
		File f1 = new File("e:\\ha\\a");
		System.out.println(f1.mkdirs());
		File f2 = new File(f1,"1.txt");
		System.out.println(f2.createNewFile());
		System.out.println(f2.getPath());
		if(f2.exists())
		{
			f2.delete();
			f1.delete();
		}
		
		System.out.println(f1.exists());
		System.out.println(f2.exists());
	}

}
