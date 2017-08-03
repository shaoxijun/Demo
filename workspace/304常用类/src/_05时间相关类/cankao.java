package _05时间相关类;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class cankao
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1=Calendar.getInstance();
		System.out.println(c1.getTime());
		c1.set(Calendar.DAY_OF_MONTH,1);
		System.out.println(c1.getTime());
		int m=c1.get(Calendar.MONTH);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=0;i<c1.get(Calendar.DAY_OF_WEEK)-1;i++)
		{
			System.out.print("\t");
		}
		while(c1.get(Calendar.MONTH)==m)
		{
			System.out.print(c1.get(Calendar.DAY_OF_MONTH)+"\t");
			if(c1.get(Calendar.DAY_OF_WEEK)==7)
			{
				System.out.println();
			}
			c1.add(Calendar.DAY_OF_MONTH,1);
		}
		
		System.out.println();
		GregorianCalendar c2=(GregorianCalendar)c1;
		System.out.println(c2.get(GregorianCalendar.YEAR));
		if(c2.isLeapYear(c2.get(GregorianCalendar.YEAR)))
		{
			System.out.println("29");
		}
		else
		{
			System.out.println("28");
		}
	}
}
