package 单向链表;

public class LinkedList
{
	//创建一个节点对象
	Node head;//作为前一个节点
	//添加数据
	void add(int n)
	{
		//判断有没有第一个节点，如果没有，就直接创建头节点
		if(this.head== null)
		{
			Node node = new Node();//没有头节点时，先创建一个节点，保存数据，然后赋给头节点			
			node.data = n;
			this.head = node;
		}
		else
		{
			this.head.add(n);//如果有头节点，就转到节点类的添加数据的方法中。
		}
	}
	//删除数据
	void remove(int n)
	{
		if(this.head == null)
		{
			System.out.println("空链表，么有数据可以删除");
		}
		else
		{
			if(this.head.next != null)
			{
				this.head.next.remove(n,this.head);
			}
		}
	}
	//打印
	void print()
	{
		System.out.println(this);
	}
	@Override
	public String toString()
	{
		String result = "[";
		Node p = this.head;
		while(p != null)
		{
			result += p.data+"," ;
			p = p.next;
		}
		result += "]";
		return result;
	}
	//创建节点
	//第一步.创建节点
//1.创建一个节点类，这个节点类里包含   a.data用来保存数据    b.  Next用来指向下一个节点
	class Node
	{
		int data;
		Node next;
		void add(int n)
		{
			if(this.next == null)
			{
				Node nextNode = new Node();
				nextNode.data = n;
				this.next = nextNode;
			}
			else
			{
				this.next.add(n);
			}
		}
		void remove(int n,Node p)
		{
			if(this.data == n)
			{
				p.next = this.next;
			}
			else
			{
				if(this.next != null)
				{
					this.next.remove(n, this);
				}
			}
		}
	}
}
