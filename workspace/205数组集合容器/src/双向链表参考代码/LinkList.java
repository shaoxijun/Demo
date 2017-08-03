package 双向链表参考代码;

public class LinkList
{
	public class Node
	{
		public Node data; // 数据区
		public Node next; // 指针区

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

	// 尾插法添加节点
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

	// 头插法添加节点
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

	// 查找节点
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

	// 删除节点
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

	// 修改更新
	public void updNode(NodeData data)
	{
		Node temp = findNode(data);
		if (temp != null)
		{
			temp.setNodeData(data);
		}
	}

	// 打印链表
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
