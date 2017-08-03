package test;

public class test_LinkedList<T>
{
	class Node
	{
		T data;
		Node next;
		public Node(T data)
		{
			super();
			this.data = data;
		}
		
	}
	Node head;
	Node other;
	int length = 0;
	void add(T t)
	{
		other = new Node(t);
		other.next = head;
		head = other;
		length++;
	}
	void print()
	{
		System.out.println(this);
	}
	@Override
	public String toString()
	{
		String result = "[";
		Node node = head;
		while(node != null)
		{
			result += node.data+",";
			node = node.next;
		}
		result += "]";
		return result;
	}
}
