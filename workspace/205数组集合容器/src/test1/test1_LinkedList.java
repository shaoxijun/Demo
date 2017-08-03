package test1;

import java.util.Scanner;

public class test1_LinkedList<T>
{
	static Scanner sc = new Scanner(System.in);
	Node head;
	void change(T t)
	{
		if(this.head.data.equals(t))
		{
			while(true)
			{
				
			}
		}
		else
		{
			if(this.head.next != null)
			{
				this.head.next.find(t,this.head);
			}
			else
			{
				System.out.println("查无此人");
			}
		}	
	}
	void find(T t)
	{
		if(this.head.data.equals(t))
		{
			System.out.println(this.head.data);
		}
		else
		{
			if(this.head.next != null)
			{
				this.head.next.find(t,this.head);
			}
			else
			{
				System.out.println("查无此人");
			}
		}
		
	}
	void remove(T t)
	{
		if(this.head == null)
		{
			System.out.println("空链表，没有数据");
		}
		else
		{
			if(this.head.data == t)
			{
				this.head = this.head.next;
			}
			else
			{
				if(this.head.next != null)
				{
				this.head.next.remove(t,this.head);
				}
				else
				{
					System.out.println("查无此数");
				}
			}
		}
	}
	void add(T t)
	{
		if(this.head == null)
		{
			Node node = new Node();
			node.data = t;
			this.head = node;
		}
		else
		{
			this.head.add(t);
		}
	}
	void add(T... n)
	{
		for(int i=0;i<n.length;i++)
		{
			this.add(n[i]);
		}
	}
	class Node
	{	
		T data;
		Node next;
		void add(T t)
		{
			if(this.next != null)
			{
				this.next.add(t);
			}
			else
			{
				Node node = new Node();
				node.data = t;
				this.next = node;
			}
		}
		void remove(T t,Node n)
		{
			if(this.data == t)
			{
				n.next = this.next;
			}
			else
			{
				if(this.next != null)
				{
					this.next.remove(t, this);
				}
				else
				{
					System.out.println("查无此数");
				}
			}
		}
		void find(T t,Node n)
		{
			if(this.data.equals(t))
			{
				System.out.println(this.data);
			}
			else
			{
				if(this.next != null)
				{
					this.next.find(t, this);
				}
				else
				{System.out.println("查无此人");}
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
		String result = "[";
		Node n = this.head;
		while(n != null)
		{
			result += n.data+",";
			n = n.next;
		}
		result += "]";
		return result;
	}
}
