package _05时间相关类;

import java.util.Calendar;

public class Exercise
{
	public static void main(String[] args)
	{
				// 1. 编写一个打印当前月份的日历
				// 如今天2017-8-1运行，则显示如下:
				// 日	一 	二 	三 	四 	五	六
				//     		1	2	3	4	5 
				// 6	7	8	9 	10	11 	12
				// 13	14	15 	16	17 	18	19
				// 20	21 	22	23	24	25	26
				// 27	28	29	30	31
				print(2017,8);
				// 2. 使用Calendar想办法得到当前年份的二月有几天
				feb();
	}

	private static void feb()
	{
		// TODO Auto-generated method stub
		
	}

	private static void print(int year, int month)
	{
		// TODO Auto-generated method stub
		Calendar cd = Calendar.getInstance();
		int month1 = cd.get(Calendar.MONTH)+1;
//		System.out.println(j+" "+month1);
		int I;
		if(month1 ==1 || month1 == 3|| month1 == 5
				|| month1 == 7|| month1 == 8|| month1 == 10|| month1 == 12)
		{
			I = 31;
		}
		else if(month1 ==2)
		{
			I = 28;
		}else
		{
			I = 30;
		}
		String firstLin = "SUN\tMON\tTUE\tWED\tTHU\tFIR\tSTA";
		System.out.println(firstLin);
		int a1 = cd.get(Calendar.DAY_OF_MONTH);//此月的第几天
		int a2 = cd.get(Calendar.DAY_OF_WEEK);//此周的第几天
		System.out.println(a2);
		int a3;
		switch(a1%7)
		{
		case 1:
			a3 = 7;
			break;
		case 2:
			a3 = 6;
			break;
		case 3:
			a3 = 5;
			break;
		case 4:
			a3 = 4;
			break;
		case 5:
			a3 = 3;
			break;
		case 6:
			a3 = 2;
			break;
		case 7:
			a3 = 1;
			break;
		default:
			System.out.println("出问题了");
		}
		for(int i=a2;i<I-a1;i++)
		{
			
		}
	}

	
}
