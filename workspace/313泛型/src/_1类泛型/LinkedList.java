package _1类泛型;

public class LinkedList<T>
{
	Node head;
	void add(T obj)
	{
		if(head == null)
		{
			Node node = new Node();
			node.data = obj;
			head = node;
		}
		else
		{
			head.add(obj);
		}
	}
	void remove(T obj)
	{
		if(head == null)
		{
			System.out.println("空链表，么有数据可以删除");
		}
		else
		{
			if(this.head.data.equals(obj))
			{
				this.head = this.head.next;
			}
			else
			{
				if(this.head.next != null)
				{
					this.head.next.remove(obj, this.head);
				}
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
		Node p = head;
		while(p != null)
		{
			result += p.data + ",";
			p = p.next;
		}
		result += "]";
		return result;
	}
	
	class Node
	{
		T data;
		Node next;
		void add(T obj)
		{
			if(this.next == null)
			{
				Node nextNode = new Node();
				nextNode.data = obj;
				this.next = nextNode;
			}
			else
			{
				this.next.add(obj);
			}
		}
		void remove(T obj,Node p)
		{
			if(this.data.equals(obj))
			{
				p.next = this.next;
			}
			else
			{
				if(this.next != null)
				{
					this.next.remove(obj, this);
				}
			}
		}
	}
}
