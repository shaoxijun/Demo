package HomeWork;

import java.util.Arrays;

public class NumberList
{
	
	char[] array ;
	
	
//	 * 添加整数 void add(int n);
	void add(int n)
	{	
		String W =String.valueOf(n);
		array = W.toCharArray();
		
		
	}
	
	// ** 添加若干个数字 void add(int ...n);	
	void add(int ...n)
	{
		String W =String.valueOf(n);
		array = W.toCharArray();
	}
	// * 删除void remove(int n);	
	void remove(int n)
	{
		
	}
	// * 从后往前查找并删除 void removeLast(int n);
	void removeLast(int n)
	{
		
	}
	// * 查询 int find(int n);
	// 返回n所在的位置，如果没找到,返回-1	
	int find(int n)
	{
		return 0;
	}

	// * 打印void print();
	void print()
	{
		System.out.println(Arrays.toString(array));
	}
	
}
