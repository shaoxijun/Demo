import java.util.Arrays;
import java.util.Scanner;

public class lx2_105
{

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
//选择排序
//		int[] arr= {90,34,234,12,-4,32,-78,101};
//		System.out.println(Arrays.toString(arr));
//		choose(arr);
//		System.out.println(Arrays.toString(arr));//以字符串的形式显示数组所有数
		// 1. 根据用户输入一个数字(1-7)，显示星期几。(用数组实现)
				// 比如用户输入:1
				// 打印 星期一
		
//		System.out.print("请输入1-7：");
//		int w=sc.nextInt();
//		String[] week= {"周一","周二","周三","周四","周五","周六","周日"};
//		System.out.println(week[w-1]);
		

		System.out.print("请输入数字：");
		int w=sc.nextInt();
		String W=String.valueOf(w);	//把数字转换为字符串
		char[] array =W.toCharArray();//把字符串转换为字符类型的数组
		char[] week= {'零','一','二','三','四','五','六','七','八','九'};
		char[] shuziArray ={'0','1','2','3','4','5','6','7','8','9'};
		for(int i = 0;i < array.length ; i++)
		{
			for(int a = 0;a < shuziArray.length ; a++)
			{
				if(array[i]==shuziArray[a])
				{
					System.out.print(week[a]);	
				}
			}
		}
		//交换变量的方法
		int a=1,b=3;
		//方法一
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		//方法二
		a=a+b;
		b=a-b;
		a=a-b;
		//方法三
		a=a^b;
		b=b^a;
		a=a^b;
		
	}
	
	//冒泡排序
	static void bubll(int[] arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{	
			for(int i=0;i<arr.length-1-j;i++)
			{
				int tmp=arr[i];
				if(arr[i]>arr[i+1])
				{
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}

				}
		}	
		System.out.println(Arrays.toString(arr));
	}
	
	//选择排序
	static void choose(int arr[])
	{
		for(int j=0;j<arr.length-1;j++)
		{
			int tmp=arr[0];
			if(arr[0]>arr[j+1])
			{
				arr[0]=arr[j+1];
				arr[j+1]=tmp;
			}

		}
	}
}
