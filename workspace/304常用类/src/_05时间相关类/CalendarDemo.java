package _05时间相关类;

import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar c1 = Calendar.getInstance();
		System.out.print(c1.get(Calendar.YEAR)+ ", ");
		System.out.print(c1.get(Calendar.MONTH)+ ", ");
		System.out.print(c1.get(Calendar.DAY_OF_MONTH)+ ", ");
		System.out.print(c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)+ ", ");
		c1.set(2018,1,1);
		System.out.println();
		System.out.print(c1.get(Calendar.YEAR)+ ", ");
		System.out.print(c1.get(Calendar.MONTH)+ ", ");
		System.out.print(c1.get(Calendar.DAY_OF_MONTH)+ ", ");
		System.out.print(c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)+ ", ");
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		Calendar c2 = Calendar.getInstance();
		System.out.print(c2.get(Calendar.YEAR)+ ", ");
		System.out.print(c2.get(Calendar.MONTH)+ ", ");
		System.out.print(c2.get(Calendar.DAY_OF_MONTH)+ ", ");
		System.out.print(c2.get(Calendar.DAY_OF_WEEK_IN_MONTH)+ ", ");
	}
}
