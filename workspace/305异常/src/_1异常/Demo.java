package _1“Ï≥£;

import java.util.Arrays;

public class Demo 
{
	public static void main(String[] args) 
	{
		String s = "-123423";
		int i = toInt(s);
		System.out.println(i);
		
	}
	static int toInt(String s)
	{
		int result =0 ;
		int i = 0;
		char[] arr = s.toCharArray();
		if(arr[0] == '-')i=1;
		for(;i<arr.length;i++)
		{
			int r = arr[i] - '0';
			result = result * 10 + r;
		}
		if(arr[0] == '-')result = -result;
		return result;
	}
}
