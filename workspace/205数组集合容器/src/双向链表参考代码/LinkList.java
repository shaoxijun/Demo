package ˫������ο�����;

public class LinkList
{
	public class Node
	{
		public Node data; // ������
		public Node next; // ָ����

		public Node(Node data, Node next)
		{
			this.data = data;
			this.next = next;
		}

		public Node()
		{
		}

		public void setData(Node data)
		{
			this.data = data;
		}

		public Node getData()
		{
			return data;
		}

		public void setNext(Node next)
		{
			this.next = next;
		}

		public Node getNext()
		{
			return next;
		}
	}

	Node head;
	Node tail;
	int count;

	public LinkList(Node head, Node tail, int count)
	{
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	public LinkList()
	{

	}

	// β�巨��ӽڵ�
	public void addHeadNode(Node data)
	{
		Node node = new Node(data, null, null);
		if (head == null && tail == null)
		{
			head = node;
			head.setFront(null);
			tail = node;
			tail.setNext(null);
		} else
		{
			head.setFront(node);
			node.setNext(head);
			head = node;
			head.setFront(null);
		}
		count++;
	}

	// ͷ�巨��ӽڵ�
	public void addTailNode(NodeData data)
	{
		Node node = new Node(data, null, null);
		if (head == null && tail == null)
		{
			head = node;
			head.setFront(null);
			tail = node;
			tail.setNext(null);
		} else
		{
			tail.setNext(node);
			node.setFront(tail);
			tail = node;
			tail.setNext(null);
		}
		count++;

	}

	// ���ҽڵ�
	public Node findNode(NodeData data)
	{
		Node temp = head;
		if (head != null)
		{
			while (temp != null)
			{
				if (temp.data.compare(data))
				{
					return temp;
				}
				temp = temp.getNext();
			}
		}
		return null;
	}

	// ɾ���ڵ�
	public void delNode(NodeData data)
	{
		Node temp = findNode(data);
		if (temp != null)
		{
			if (temp.getFront() == null)
			{
				head = temp.getNext();
				head.setFront(null);
			} else if (temp.getNext() == null)
			{
				tail = tail.getFront();
				tail.setNext(null);
			} else
			{
				temp.getFront().setNext(temp.getNext());
				temp.getNext().setFront(temp.getFront());
			}
			count--;
		}
	}

	// �޸ĸ���
	public void updNode(NodeData data)
	{
		Node temp = findNode(data);
		if (temp != null)
		{
			temp.setNodeData(data);
		}
	}

	// ��ӡ����
	public void printNode()
	{
		Node temp = head;
		while (temp != null)
		{
			temp.print();
			temp = temp.getNext();
		}
	}
}
