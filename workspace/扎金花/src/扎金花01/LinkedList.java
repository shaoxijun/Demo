package 扎金花01;

public class LinkedList<T>
{
	Node head;
	Node other;
	int length = 0;
	public LinkedList()
	{
		this.head = null;
	}
	class Node
	{
		T data;
		Node next;
		public Node(T t)
		{
			this.data = t;
		}
	}
	void add(T t)
	{		
			other = new Node(t);
			other.next = head;
			head = other;
			length++;				
	}
	void add(T... t)
	{
		for(int i=0;i<t.length;i++)
		{
			this.add(t[i]);
		}
	}
	void changeData(int p,T t)//替换指定位置数据
	{
		if(p>length)
		{
			System.out.println("不存在这个数");
		}else
		{
			int i = length;
			Node node = new Node(t);
			Node m,n;
			m=n=head;
			while(i != p)
			{	
				m = n;
				n = n.next;
				i--;
			}
			System.out.println(n.data+"以替换为"+node.data);
			n.data = node.data;
		}
	}
	void indexAdd(int p,T t)//在指定位置增加数据
	{
		if(p>length)
		{
			System.out.println("不存在这个数");
		}else
		{
			int i = length;
			Node node = new Node(t);
			Node m,n;
			m=n=head;
			while(i != p)
			{	
				m = n;
				n = n.next;
				i--;
			}
			node.next = n.next;
			m.next.next = node;
			length++;
		}
	}
	void indexDelet(int p)//删除指定位置数据
	{		
		if(p>length)
		{
			System.out.println("不存在这个数");
		}else
		{
			if(p == 1)
			{
				head = null;
				length = 0;
			}else
			{
				Node m = head;
				Node n = head;
				int i = length;
				while(i != p)
				{
					m = n;
					n = n.next;
					i--;
				}
				m.next = n.next;
//				System.out.println(n.data+"已删除");
				length--;
			}
		}
	}
	void deletData(T t)
	{
		Node m = head;
		Node n = head;
		int i = length;
		int j = length;
		for(i=length;i>1;i--)
		{
			m = n;
			n = n.next;
			if(n.data.equals(t))
			{
				m.next = n.next;
				length--;
				break;
			}		
		}
		if(n.data.equals(t))
		{
			n.next = null;
			length--;
		}
		if(length == j)
		{System.out.println("没有这个数");}
	}
	void printData(T t)//打印某个数据的具体信息
	{
		Node m = head;
		Node n = head;
		int i = length;
		int j = length;
		for(i=length;i>1;i--)
		{
			m = n;
			n = n.next;
			if(n.data.equals(t))
			{
				System.out.println(n.data);
				length--;
				break;
			}		
		}
		if(n.data.equals(t))
		{
			System.out.println(n.data);
			length--;
		}
		if(length == j)
		{System.out.println("没有这个数");}
	}
	T findIndex(int p)//查找指定位置数据
	{		
		if(p>length)
		{
			return null;
		}else
		{
			if(p == 1)
			{
				return this.head.data;
			}else
			{
				Node m = head;
				Node n = head;
				int i = length;
				while(i != p)
				{
					m = n;
					n = n.next;
					i--;
				}
				return n.data;
			}
		}
	}
	void print()
	{
		System.out.println(this);
	}
	@Override
	public String toString()
	{
		Node node = head;
		String result = "";
		for(int i=0;i<length-1;i++)
		{
			result += node.data+"\n";
			node = node.next;
		}
		result += node.data;
//		result += "]";
		return result;
	}
}
