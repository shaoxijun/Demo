import java.util.Arrays;
import java.util.Scanner;

public class lx2_105
{

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
//ѡ������
//		int[] arr= {90,34,234,12,-4,32,-78,101};
//		System.out.println(Arrays.toString(arr));
//		choose(arr);
//		System.out.println(Arrays.toString(arr));//���ַ�������ʽ��ʾ����������
		// 1. �����û�����һ������(1-7)����ʾ���ڼ���(������ʵ��)
				// �����û�����:1
				// ��ӡ ����һ
		
//		System.out.print("������1-7��");
//		int w=sc.nextInt();
//		String[] week= {"��һ","�ܶ�","����","����","����","����","����"};
//		System.out.println(week[w-1]);
		

		System.out.print("���������֣�");
		int w=sc.nextInt();
		String W=String.valueOf(w);	//������ת��Ϊ�ַ���
		char[] array =W.toCharArray();//���ַ���ת��Ϊ�ַ����͵�����
		char[] week= {'��','һ','��','��','��','��','��','��','��','��'};
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
		//���������ķ���
		int a=1,b=3;
		//����һ
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		//������
		a=a+b;
		b=a-b;
		a=a-b;
		//������
		a=a^b;
		b=b^a;
		a=a^b;
		
	}
	
	//ð������
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
