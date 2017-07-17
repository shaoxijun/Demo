import java.util.Arrays;

public class lx3
{
	public static void main(String[] args)
	{
		int[] array= {10,50,30,3};
		//打印传入的数组  比如输出[10,20,30]
//		System.out.println(Arrays.toString(array));
		//复制数组的方法（传入  源数组  起始位置 目标数组， 复制到起始位置  复制的长度）
//		int[] ar = array;
//		System.arraycopy(array, 0, ar, 0, 4);
		//将传入的数组进行冒泡排序		
//		bubll(array);
		//将传入的数组进行选择排序
//		choose(array);
		//将传入的数组颠倒排序
		dao(array);
		//传入数组，将位置1位置2的数据交换
		//二分法查找数据
	}
	
//	static void foo1(int...is)
//	{
//		System.out.println();
//	}
	
	static void dao(int[] arr)
	{
		for(int j=arr.length;j>=1;j--)
		{	
			for(int i=arr.length-1;i>=1;i--)
			{
				int tmp=arr[i];
				if(arr[i]>arr[i-1])
				{
					arr[i-1]=arr[i];
					arr[i]=tmp;
				}
			}
		}	
		System.out.println(Arrays.toString(arr));
	}
	//冒泡排序
	static void bubll(int[] arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{	
			for(int i=0;i<arr.length-1-j;i++)
			{
				int tmp=arr[i];
				if(arr[i]<arr[i+1])
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
