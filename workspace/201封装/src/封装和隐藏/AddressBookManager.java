package ��װ������;

import java.util.Scanner;

public class AddressBookManager
{
	
	static Scanner sc = new Scanner(System.in);
	static int q;
	
	

	public static void main(String[] args)
	{
		while (true)
		{
			System.out.println("0���ѧ����Ϣ   1��ӡѧ����Ϣ  2�޸�ѧ���ɼ�  3ɾ��ѧ���ɼ�  4��ѯѧ���ɼ�  5��ѯ����ѧ��");
			int k = sc.nextInt();
			switch (k)
			{
			case 0:
				addinfor();
				break;
			case 1:
				type();
				break;
			case 2:
				change();
				break;
			case 3:
				del();
				break;
			case 4:
				search();
				break;							
			default:
				System.out.println("��������ȷָ��");
			}
		}
	}

	// ���ѧ����Ϣ
	static void addinfor()
	{
		System.out.print("�����������ֻ��ţ��м��Կո�ָ�");
		String name = sc.next();
		String num = sc.next();
		AddressCard ad = new AddressCard("name","num");
		AddressBook ab = new AddressBook("name","num");
	}

	// ��ӡѧ����Ϣ
	static void type()
	{
		System.out.println("ѧ��   Ӣ��      ��ѧ     ����");
		
	}

	// �޸�ѧ����Ϣ
	static void change()
	{

		System.out.println("ѡ����Ҫ�޸ĵ�ѧ����ѧ��");
	
		
	}

	// ɾ��ѧ����Ϣ
	static void del()
	{
		
		System.out.println("ɾ�����");
	}

	// ��ѯĳ��ѧ�ŵĳɼ�
	static void search()
	{
		

		System.out.println();
	}



}
