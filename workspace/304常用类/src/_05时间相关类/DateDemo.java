package _05时间相关类;
import java.util.*;
public class DateDemo
{
	public static void main(String[] args)
	{
		Date d1 = new Date();// 当前时间
		System.out.println(d1);
		System.out.println(d1.getTime());// 从1970-1-1 00:00:00经历的描述
		System.out.println(d1.getDate());// 
//		System.out.println(d1.getYear());// 117?   1900到现在多少年
//		System.out.println(d1.getMonth());// 7  月份 (0~11）
		System.out.println(d1.getDay());// 2  周几
		
//		Date d2 = new Date(1992-1900,1-1,1);
//		System.out.println(d2);

	}
}
