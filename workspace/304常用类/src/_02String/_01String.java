package _02String;

import java.util.Arrays;
import java.util.Scanner;

public class _01String
{
	public static void main(String[] args)
	{
		String arr = "When a man loves a woman,when i wos you man Xman";	
	// 1. 在字符串重"When a man loves a woman,when i wos you man Xman"
	// a. 统计man出现的次数
		int length = 0;
		int a1 = arr.length();
		for(int i =0;i<a1-3;i++)
		{
			if(arr.indexOf("man", i)>0)
			{
				length++;
				i = arr.indexOf("man",i);
			}
		}
		System.out.println("man出现的次数为："+length);
	// b. 将所有a替换成X
		System.out.println(arr.replace("a", "X"));
	// c. 大写方式输出
		System.out.println(arr.toUpperCase());
				
		

		
		
		
	// 2. 产生随机4位验证码,如: 2d6f (由数字、大小写字母构成)
		String[] passwad = new String[4];
		for(int i =0;i<4;i++)
		{
			if((int)(Math.random()*2) == 0)
			{
				passwad[i] = ""+(char)(int)(Math.random()*26+97);
			}else
			{
				passwad[i] = ""+(int)(Math.random()*10);
			}
		}
		String re = new String();
		for(int i =0;i<4;i++)
		{
			re += passwad[i];
		}
		System.out.println("验证码为"+re);
	// 让用户输入验证码
		System.out.print("请输入验证码");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();		
	// 比较用户输入是否正确,显示结果.
		System.out.println(re.equals(input));

	// 3. "Android iOS Winphone" 得到 删除iOS的字符串
		String a3 = "Android iOS Winphone";
		String b3 = a3.replace("iOS", "");
		System.out.println(b3);
	// 4. "猫抓老鼠，老鼠怕猫" ,将字符串中的猫和老鼠交换
		String a4 = "猫抓老鼠，老鼠怕猫";
		String b4 = a4.replace("猫", "1").replace("老鼠", "猫").replace("1", "老鼠");
		System.out.println(b4);
	// 5. 编写一个方法，将数字转化成中文字符串,比如传入的是12525 ,返回的是"一二五点二五"
		System.out.println("你输入的数是：");
		String a5 = sc.next();
		char[] arr5a = a5.toCharArray();
		char[] arr5b = new char[]{'零','一','二','三','四','五','六','七','八','九','点'};
		char[] arr5c = new char[]{'0','1','2','3','4','5','6','7','8','9','.'};
		for(int i =0;i<a5.length();i++)
		{
			for(int j =0;j<arr5c.length;j++)
			{
				if(arr5a[i] == arr5c[j])
				{
					System.out.print(arr5b[j]);
				}
			}
		}
		System.out.println();
	// *6. 编写一个方法，将数字转化成中文金额大写字符串
	// 传入的是125，返回的是"壹佰贰拾伍元整"
	// 传入的是比如125.25，返回的是"壹佰贰拾伍元贰角伍分"
	// 中文大写金额数字应用正楷或行书填写,如壹、贰、叁、肆、伍、陆、柒、捌、玖、拾、佰、 仟、万、亿、元、角、分、零、整(正)等字
		System.out.println("你输入的数是：");
		String a6 = sc.next();
		char[] arr6a = a5.toCharArray();
		char[] arr6b = new char[]{'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
		char[] arr6c = new char[]{'整','拾','佰','仟','万','亿','元','角','分'};
		char[] arr6d = new char[]{'0','1','2','3','4','5','6','7','8','9','.'};
		int d = 0;
		for(int i =0;i<arr6a.length;i++)
		{
			if(arr6a[i] == '.')
			{
				d = i;
				break;
			}else
			{
				d = arr6a.length;
			}
		}
		if(d == arr6a.length)
		{
			for(int i =0;i<d;i++)
			{
				for(int j =0;j<arr6d.length;j++)
				{
					
				}
			}
		}else
		{
			
		}
	}

}
