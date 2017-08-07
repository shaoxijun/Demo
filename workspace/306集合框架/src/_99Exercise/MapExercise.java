package _99Exercise;

import java.util.*;

public class MapExercise
{
	public static void main(String[] args)
	{
		// Map ��ϰ
		// ---------------------------------------------------------
		// 13. (Map��ϰ)
		map13();
		
		// 14. (Map��ϰ)
		map14();
	}


	static void map14()
	{
		// String str = "adfasdfer23cvt323446dfs23423sdfadhdsfg";
		// һ������Ӣ����ĸ�����ֵĳ��ַ��������������д��ĸ
		// ͳ���ַ�������ĸ�����ֳ��ֵĴ�����ʹ��map����
		// ��ӡ����ʾ���(���ʱ������ĸ˳�����)
		// ����:
		// a 3��
		// b 9��
		String str = "adfasdfer23cvt323446dfs23423sdfadhdsfg";
		Map<String,Integer> m14 = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			String s = String.valueOf((str.charAt(i)));
				if(m14.containsKey(s))
				{
					int num = m14.get(s);
					m14.put(s, ++num);
				}else
				{
					m14.put(s, 1);
				}
			
		}
		System.out.println(m14);
		Set<Map.Entry<String,Integer>> sm14 = m14.entrySet();
		for(Map.Entry<String, Integer> s:sm14)
		{
			System.out.print(s.getKey()+"��"+s.getValue()+"��       ");
		}
		
	}
	
	static void map13()
	{
		
		// ��������Ϣ����Map����
		// ��ı�� 	���� 					���
		// ISBN-001 iOS���������ŵ���Ϣ 		21.5
		// ISBN-002 Python�����ŵ����� 		19.5
		// ISBN-003 Eclipse�Ӱ�װ�ĵ�ж�� 	15.6
	
		Map<String,Book> book = new HashMap<>();
		book.put("ISBN-001", new Book("iOS���������ŵ���Ϣ",21.5f));
		book.put("ISBN-002", new Book("Python�����ŵ�����",19.5f));
		book.put("ISBN-003", new Book("Eclipse�Ӱ�װ�ĵ�ж��",15.6f));
		System.out.println(book);
		
	}
	
}
