package _02String;

import java.util.Arrays;
import java.util.Scanner;

public class _01String
{
	public static void main(String[] args)
	{
		String arr = "When a man loves a woman,when i wos you man Xman";	
	// 1. ���ַ�����"When a man loves a woman,when i wos you man Xman"
	// a. ͳ��man���ֵĴ���
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
		System.out.println("man���ֵĴ���Ϊ��"+length);
	// b. ������a�滻��X
		System.out.println(arr.replace("a", "X"));
	// c. ��д��ʽ���
		System.out.println(arr.toUpperCase());
				
		

		
		
		
	// 2. �������4λ��֤��,��: 2d6f (�����֡���Сд��ĸ����)
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
		System.out.println("��֤��Ϊ"+re);
	// ���û�������֤��
		System.out.print("��������֤��");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();		
	// �Ƚ��û������Ƿ���ȷ,��ʾ���.
		System.out.println(re.equals(input));

	// 3. "Android iOS Winphone" �õ� ɾ��iOS���ַ���
		String a3 = "Android iOS Winphone";
		String b3 = a3.replace("iOS", "");
		System.out.println(b3);
	// 4. "èץ����������è" ,���ַ����е�è�����󽻻�
		String a4 = "èץ����������è";
		String b4 = a4.replace("è", "1").replace("����", "è").replace("1", "����");
		System.out.println(b4);
	// 5. ��дһ��������������ת���������ַ���,���紫�����12525 ,���ص���"һ��������"
		System.out.println("����������ǣ�");
		String a5 = sc.next();
		char[] arr5a = a5.toCharArray();
		char[] arr5b = new char[]{'��','һ','��','��','��','��','��','��','��','��','��'};
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
	// *6. ��дһ��������������ת�������Ľ���д�ַ���
	// �������125�����ص���"Ҽ�۷�ʰ��Ԫ��"
	// ������Ǳ���125.25�����ص���"Ҽ�۷�ʰ��Ԫ�������"
	// ���Ĵ�д�������Ӧ��������������д,��Ҽ���������������顢½���⡢�ơ�����ʰ���ۡ� Ǫ�����ڡ�Ԫ���ǡ��֡��㡢��(��)����
		System.out.println("����������ǣ�");
		String a6 = sc.next();
		char[] arr6a = a5.toCharArray();
		char[] arr6b = new char[]{'��','Ҽ','��','��','��','��','½','��','��','��'};
		char[] arr6c = new char[]{'��','ʰ','��','Ǫ','��','��','Ԫ','��','��'};
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
