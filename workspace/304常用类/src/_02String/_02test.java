package _02String;

import java.util.Scanner;

public class _02test
{
	public static void main(String[] args) 
	{
		// *6. ��дһ��������������ת�������Ľ���д�ַ���
		// �������125�����ص���"Ҽ�۷�ʰ��Ԫ��"
		// ������Ǳ���125.25�����ص���"Ҽ�۷�ʰ��Ԫ�������"
		// ���Ĵ�д�������Ӧ��������������д,��Ҽ���������������顢½���⡢�ơ�����ʰ���ۡ� Ǫ�����ڡ�Ԫ���ǡ��֡��㡢��(��)����
		toDa();
	}
	static void toDa()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ȷ���֣���");
		String a6 = sc.next();
		double b6 = Double.valueOf(a6);
		char[] c6 = a6.toCharArray();
//		System.out.println(a6);
		//						   	   0    1   2   3   4    5   6   7    8   9
		char[] arr6b = new char[]	 {'��','Ҽ','��','��','��','��','½','��','��','��','��'};
		String[] arr6c = new String[]{"Ԫ","ʰ","��","Ǫ","��","ʮ","��","ǧ","��","Ԫ","��","��"};
		char[] arr6d = new char[]	 {'0','1','2','3','4','5','6','7','8','9','.'};
		boolean z = true;//����
		boolean cx = true;//��С��
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
					{System.out.print("������Χ");break a;}
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
		System.out.println("��");		
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
