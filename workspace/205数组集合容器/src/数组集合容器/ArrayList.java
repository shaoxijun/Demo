package 数组集合容器;

public class ArrayList
{
	final int Size = 5;
	int data[] = new int[Size];
	int count = 0;
	
	//从后往前查找并删除
	public void removeFromLast(int n)
	{
		int a = findFromLast(n);
		for(int i=a;i<count;i++)
		{
			data[i] = data[i+1];
		}
		count--;
	}
	// 从后往前查找
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
	// 删除所有
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
				System.out.println("查无此数");
			}
		}	
	// 删除指定位置数据
	public void removeByIndex(int index)
		{
			if(index>=count-1)
			{
				System.out.println("没有这个数");
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
	//删除数字
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
			System.out.println("查无此数");
		}
	}
    //将数字插入到指定位置
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
	//添加
	public void add(int n)
	{
		if(count == data.length)
		{
			System.out.println("数组放不下了，我要扩大5个");
			int[] newdata = new int[count+5];
			System.arraycopy(data, 0, newdata, 0, count);
			data = newdata;
		}
		data[count++] = n;
		
	}
	//添加一堆数字
	public void add(int... a)
	{
		for(int i=0;i<a.length;i++)
		{
			add(a[i]);  
		}
	}
	//查找数字
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
	//查找所有数字
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
