package _02String;

import java.util.Scanner;

public class _02test
{
	public static void main(String[] args) 
	{
		// *6. 编写一个方法，将数字转化成中文金额大写字符串
		// 传入的是125，返回的是"壹佰贰拾伍元整"
		// 传入的是比如125.25，返回的是"壹佰贰拾伍元贰角伍分"
		// 中文大写金额数字应用正楷或行书填写,如壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、 仟、万、亿、元、角、分、零、整(正)等字
		toDa();
	}
	static void toDa()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("你输入金额（精确到分）：");
		String a6 = sc.next();
		double b6 = Double.valueOf(a6);
		char[] c6 = a6.toCharArray();
//		System.out.println(a6);
		//						   	   0    1   2   3   4    5   6   7    8   9
		char[] arr6b = new char[]	 {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖','点'};
		String[] arr6c = new String[]{"元","拾","佰","仟","万","十","百","千","亿","元","角","分"};
		char[] arr6d = new char[]	 {'0','1','2','3','4','5','6','7','8','9','.'};
		boolean z = true;//整数
		boolean cx = true;//纯小数
		int lin =0;
		for(int i =0;i<c6.length;i++)
		{
			if(c6[i] == '.')
			{
				lin = i;
				z = false;
				break;
			}else
			{
				lin = c6.length;
				
			}
			if(c6[0] != '0')
			{
				cx = false;
			}
		}
		System.out.println(lin);
		int d1 = lin;
		int d2 = lin;
		a:
		for(int i =0;i<d1;i++)
		{
			for(int j =0;j<arr6d.length;j++)
			{
				if(c6[i] == arr6d[j])
				{
					if(cx)
					{break a;}
					if(c6.length>12)
					{System.out.print("超出范围");break a;}
					System.out.print(arr6b[j]);
					if(lin == 1);
					else if(lin == 2)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==3)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==4)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==5)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==6)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==7)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==8)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==9)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==10)
					{
						System.out.print(arr6c[--d2]);
					}else if(lin ==11)
					{
						System.out.print(arr6c[--d2]);
					}				
				}
			}
		}	
		if(z)
		System.out.println("整");		
		int x = 10;
		for(int i =lin+1;i<c6.length;i++)
		{
			for(int j =0;j<arr6d.length;j++)
			{
				if(c6[i] == arr6d[j])
				{
					System.out.print(arr6b[j]);
					System.out.print(arr6c[x++]);
				}
			}
		}
	}
}
