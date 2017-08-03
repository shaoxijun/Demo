package FinalTest;

public class DoubleLinkedList<T>
{
	class Node
	{
		T data;
		Node perv;
		Node next;
		public Node(T t)
		{
			this.data = t;
		}
	}
	Node head;
	Node last;
	int length = 0;
	void add(T t)
	{
		Node node = new Node(t);
		if(head == null)
		{
			head = node;
			last = head;
			length++;
		}else
		{
			node.perv = head.next;
			head = node;
		}
	}
}
