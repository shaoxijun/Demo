import java.util.Arrays;

public class lx3
{
	public static void main(String[] args)
	{
		int[] array= {10,50,30,3};
		//��ӡ���������  �������[10,20,30]
//		System.out.println(Arrays.toString(array));
		//��������ķ���������  Դ����  ��ʼλ�� Ŀ�����飬 ���Ƶ���ʼλ��  ���Ƶĳ��ȣ�
//		int[] ar = array;
//		System.arraycopy(array, 0, ar, 0, 4);
		//��������������ð������		
//		bubll(array);
		//��������������ѡ������
//		choose(array);
		//�����������ߵ�����
		dao(array);
		//�������飬��λ��1λ��2�����ݽ���
		//���ַ���������
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
	//ð������
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
	
	//ѡ������
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
