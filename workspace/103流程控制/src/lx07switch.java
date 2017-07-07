import java.util.Scanner;

public class lx07switch
{

	public static void main(String[] args)
	{
		// * 6. 计算某个日期是这一年的第几天,要考虑闰年
		// 如2016-2-1是这一年的第32天
		// 如2016-12-31是这一年的第366天

		Scanner sc = new Scanner(System.in);
		int year, ln = 0;
		int num = 0, sum = 0;
		System.out.print("请输入年份");
		year = sc.nextInt();

		if (year % 400 == 0)
		{
			ln = 1;
			// System.out.println("你输入的年份是闰年");
		} else if (year % 4 == 0 && year % 100 != 0)
		{
			ln = 1;
			// System.out.println("你输入的年份是闰年");
		} else
		{
			ln = 0;
			// System.out.println("你输入的年份不是闰年");
		}
		int month;
		System.out.print("请输入月份");
		month = sc.nextInt();
		int day;
		System.out.print("请输入日期");
		day = sc.nextInt();

		if (day > 0 && day < 32)
		{
			switch (month)
			{
			case 1:
				num = day;
				break;
			case 2:
				num = day + 31;
				break;
			case 3:
				num = day + 59;
				break;
			case 4:
				num = day + 90;
				break;
			case 5:
				num = day + 120;
				break;
			case 6:
				num = day + 151;
				break;
			case 7:
				num = day + 181;
				break;
			case 8:
				num = day + 212;
				break;
			case 9:
				num = day + 243;
				break;
			case 10:
				num = day + 273;
				break;
			case 11:
				num = day + 304;
				break;
			case 12:
				num = day + 334;
				break;
			default:
			{
				System.out.println("请输入正确的月份");
			}
			}
		} else
		{
			if(month>13)
			{
				System.out.println("请输入正确的月份");	
			}
			System.out.println("请输入正确的日期");
		}
		if (month < 3 && day > 0 && day < 32)
		{
			System.out.println("这一天是这年的第" + num + "天");
		}
		if (month >= 3 & month <= 12 && day > 0 && day < 32)
		{
			if (ln == 1)
			{
				sum = num + 1;
				System.out.println("这一天是这年的第" + sum + "天");
			} else
			{
				System.out.println("这一天是这年的第" + num + "天");

			}
		}

	}

}
