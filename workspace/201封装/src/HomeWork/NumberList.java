package HomeWork;

import java.util.Arrays;

public class NumberList
{
	
	char[] array ;
	
	
//	 * ������� void add(int n);
	void add(int n)
	{	
		String W =String.valueOf(n);
		array = W.toCharArray();
		
		
	}
	
	// ** ������ɸ����� void add(int ...n);	
	void add(int ...n)
	{
		String W =String.valueOf(n);
		array = W.toCharArray();
	}
	// * ɾ��void remove(int n);	
	void remove(int n)
	{
		
	}
	// * �Ӻ���ǰ���Ҳ�ɾ�� void removeLast(int n);
	void removeLast(int n)
	{
		
	}
	// * ��ѯ int find(int n);
	// ����n���ڵ�λ�ã����û�ҵ�,����-1	
	int find(int n)
	{
		return 0;
	}

	// * ��ӡvoid print();
	void print()
	{
		System.out.println(Arrays.toString(array));
	}
	
}
