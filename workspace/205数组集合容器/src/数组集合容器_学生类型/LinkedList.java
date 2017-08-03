package 数组集合容器_学生类型;

public class LinkedList
{
	Node head;
	void add(Student s)
	{
		if(head == null)
		{
			Node node = new Node();
			node.data = s;
			head = node;
		}
		else
		{
			head.add(s);
		}
	}
	void remove(Student s)
	{
		if(head == null)
		{
			System.out.println("空链表，么有数据可以删除");
		}
		else
		{
			if(this.head.data.ID != s.ID)
			{
				this.head.next.remove(s,this.head);
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
		Student data;
		Node next;
		void add(Student s)
		{
			if(this.next == null)
			{
				Node nextNode = new Node();
				nextNode.data = s;
				this.next = nextNode;
			}
			else
			{
				this.next.add(s);
			}
		}
		void remove(Student s,Node p)
		{
			if(this.data.ID == s.ID)
			{
				p.next = this.next;
			}
			else
			{
				if(this.next != null)
				{
					this.next.remove(s, this);
				}
			}
		}
	}
}
