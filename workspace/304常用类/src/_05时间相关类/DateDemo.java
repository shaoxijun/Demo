package _05ʱ�������;
import java.util.*;
public class DateDemo
{
	public static void main(String[] args)
	{
		Date d1 = new Date();// ��ǰʱ��
		System.out.println(d1);
		System.out.println(d1.getTime());// ��1970-1-1 00:00:00����������
		System.out.println(d1.getDate());// 
//		System.out.println(d1.getYear());// 117?   1900�����ڶ�����
//		System.out.println(d1.getMonth());// 7  �·� (0~11��
		System.out.println(d1.getDay());// 2  �ܼ�
		
//		Date d2 = new Date(1992-1900,1-1,1);
//		System.out.println(d2);

	}
}
