package _99Exercise;

import java.util.*;

public class MapExercise
{
	public static void main(String[] args)
	{
		// Map 练习
		// ---------------------------------------------------------
		// 13. (Map练习)
		map13();
		
		// 14. (Map练习)
		map14();
	}


	static void map14()
	{
		// String str = "adfasdfer23cvt323446dfs23423sdfadhdsfg";
		// 一个包含英文字母及数字的长字符串，可以随便敲写字母
		// 统计字符串中字母及数字出现的次数，使用map保存
		// 打印并显示结果(输出时按照字母顺序输出)
		// 如下:
		// a 3个
		// b 9个
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
			System.out.print(s.getKey()+"有"+s.getValue()+"个       ");
		}
		
	}
	
	static void map13()
	{
		
		// 将以下信息放入Map容器
		// 书的编号 	书名 					书价
		// ISBN-001 iOS开发从入门到窒息 		21.5
		// ISBN-002 Python从入门到出家 		19.5
		// ISBN-003 Eclipse从安装的到卸载 	15.6
	
		Map<String,Book> book = new HashMap<>();
		book.put("ISBN-001", new Book("iOS开发从入门到窒息",21.5f));
		book.put("ISBN-002", new Book("Python从入门到出家",19.5f));
		book.put("ISBN-003", new Book("Eclipse从安装的到卸载",15.6f));
		System.out.println(book);
		
	}
	
}
