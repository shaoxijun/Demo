package ���鼯������;

public class ArrayList
{
	final int Size = 5;
	int data[] = new int[Size];
	int count = 0;
	
	//�Ӻ���ǰ���Ҳ�ɾ��
	public void removeFromLast(int n)
	{
		int a = findFromLast(n);
		for(int i=a;i<count;i++)
		{
			data[i] = data[i+1];
		}
		count--;
	}
	// �Ӻ���ǰ����
	public int findFromLast(int n)
		{
			int a =-1;
			for(int i=count-1;i>=0;i--)
			{
				if(data[i] == n)
				{
					a = i;
					return a;
				}
			}
			return a;
		}
	// ɾ������
	public void removeAll(int n)
		{
			for(int j = 0;j<count;j++)
			{
				int a = find(n);
				if(a>=0)
				{
					for(int i=a;i<count-1;i++)
					{
						data[a] = data[a+1];
					}
					count--;
				}
			}
			if(find(n)<0)
			{
				System.out.println("���޴���");
			}
		}	
	// ɾ��ָ��λ������
	public void removeByIndex(int index)
		{
			if(index>=count-1)
			{
				System.out.println("û�������");
			}
			else
			{
				for(int i=index-1;i<count-1;i++)
				{
					data[i] = data[i+1];
				}
			}
			count--;
		}
	//ɾ������
	public void remove(int n)
	{
		int a = find(n);
		if(a>=0)
		{
			for(int i=a;i<count-1;i++)
			{
				data[a] = data[a+1];
			}
			count--;
		}
		else
		{
			System.out.println("���޴���");
		}
	}
    //�����ֲ��뵽ָ��λ��
	public void insert(int index,int n)
	{
		count+=1;
		int a=count;
		for(int i=a-1;i>=index;i--)
		{
			data[i] = data[i-1];
//			System.out.print(i);
		}
		data[index-1] = n;
	}
	//���
	public void add(int n)
	{
		if(count == data.length)
		{
			System.out.println("����Ų����ˣ���Ҫ����5��");
			int[] newdata = new int[count+5];
			System.arraycopy(data, 0, newdata, 0, count);
			data = newdata;
		}
		data[count++] = n;
		
	}
	//���һ������
	public void add(int... a)
	{
		for(int i=0;i<a.length;i++)
		{
			add(a[i]);  
		}
	}
	//��������
	public int find(int n)
	{
		int a =-1;
		for(int i=0;i<count;i++)
		{
			if(data[i] == n)
			{
				a = i;
				return a;
			}
		}
		return a;
	}
	//������������
	public String findAll(int n)
	{
		int i;
		String result = "(" ;
		for( i=0;i<count;i++)
		{
			if(data[i] == n)
			{				
				result += i+"  ";
			}
		}
			result += ")";
		return result;
	}	
	public void print()
	{
		System.out.println(this);
	}
	@Override
	public String toString()
	{
		String result = "[";
		if(count>0)
		{
			for(int i=0;i<count-1;i++)
			{
				result += data[i]+",";
			}
			result +=data[count-1];
		}
		result += "]";
		return result;
	}
}
