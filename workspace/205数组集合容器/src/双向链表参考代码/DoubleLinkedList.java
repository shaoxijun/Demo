package 双向链表参考代码;

public class DoubleLinkedList<T>
{
	private static class Node<T>
	{
		Node<T> perv; // 前节点
		Node<T> next; // 后节点
		T data; // 数据

		public Node(T t)
		{
			this.data = t;
		}
	}

	private Node<T> head; // 头节点
	private Node<T> last; // 尾节点
	private Node<T> other; // 备用节点存放临时操作
	private int length; // 链表长度

	/**
	 * 无参构造
	 */
	public DoubleLinkedList()
	{
		head = new Node<T>(null);
		last = head;
		length = 0;
	}

	/**
	 * 初始化时创建一个节点
	 * 
	 * @param data
	 *            数据
	 */
	public DoubleLinkedList(T data)
	{
		head = new Node<T>(data);
		last = head;
		length = 1;
	}

	/**
	 * 添加一个节点
	 * 
	 * @param data
	 *            添加的数据
	 */
	public void add(T data)
	{
		if (isEmpty())
		{
			head = new Node<T>(data);
			last = head;
			length++;
		} else
		{
			// 尾插法
			other = new Node<T>(data);
			other.perv = last;//接手前一个节点
			last.next = other;
			last = other;
			length++;
		}
	}

	/**
	 * 在指定数据后插入一个节点
	 * 
	 * @param data
	 *            指定的数据
	 * @param insertData
	 *            插入的数据
	 * @return 插入成功返回true,不成功返回false
	 */
	public boolean addAfert(T data, T insertData)
	{
		other = head;
		while (other != null)
		{
			if (other.data.equals(data))
			{
				Node<T> t = new Node<T>(insertData);
				t.perv = other;
				t.next = other.next;
				other.next = t;
				// 判断是否在最后一个节点后添加节点
				if (t.next == null)
				{
					last = t;
				}
				length++;
				return true;
			}
			other = other.next;
		}
		return false;
	}

	/**
	 * 在指定数据前插入一个节点
	 * 
	 * @param data
	 *            指定的数据
	 * @param insertData
	 *            插入的数据
	 * @return 插入成功返回true,不成功返回false
	 */
	public boolean addBefore(T data, T insertData)
	{
		other = head;
		while (other != null)
		{
			if (other.data.equals(data))
			{
				Node<T> t = new Node<T>(insertData);
				t.perv = other.perv;
				t.next = other;
				other.perv.next = t;
				length++;
				return true;
			}
			other = other.next;
		}
		return false;
	}

	/**
	 * 获得索引处的数据
	 * 
	 * @param index
	 *            索引
	 * @return 数据
	 */
	public T get(int index)
	{
		if (index > length || index < 0)
		{
			throw new IndexOutOfBoundsException("索引越界:" + index);
		}
		other = head;
		for (int i = 0; i < index; i++)
		{
			other = other.next;
		}
		return other.data;
	}

	/**
	 * 新值替换旧值
	 * 
	 * @return 成功为true,未找到为false
	 */
	public boolean set(T oldValue, T newValue)
	{
		other = head;
		while (other != null)
		{
			if (other.data.equals(oldValue))
			{
				other.data = newValue;
				return true;
			}
			other = other.next;
		}
		return false;
	}

	/**
	 * 移除指定的元素
	 * 
	 * @param data
	 *            需要移除的元素
	 * @return 不存在为false,成功为true
	 */
	public boolean remove(T data)
	{
		other = head;
		while (other != null)
		{
			if (other.data.equals(data))
			{
				other.perv.next = other.next;
				length--;
				return true;
			}
			other = other.next;
		}
		return false;
	}

	/**
	 * 链表中是否包含此元素
	 * 
	 * @return 包含为true,不包含为false
	 */
	public boolean contains(T data)
	{
		other = head;
		while (other != null)
		{
			if (other.data.equals(data))
			{
				return true;
			}
			other = other.next;
		}
		return false;
	}

	/**
	 * 获得最后一个节点的数据
	 * 
	 * @return 最后一个节点的数据
	 */
	public T getLast()
	{
		return last.data;
	}

	/**
	 * 获得第一个节点的数据
	 * 
	 * @return 第一个节点的数据
	 */
	public T getFirst()
	{
		return head.data;
	}

	/**
	 * 获得链表的长度
	 * 
	 * @return 长度
	 */
	public int getSize()
	{
		return length;
	}

	/**
	 * 是否为空链表
	 * 
	 * @return 空链表为true,非空链表为false
	 */
	public boolean isEmpty()
	{
		return length == 0;
	}

	/**
	 * 清空链表
	 */
	public void clear()
	{
		head = null;
		length = 0;
	}

	/**
	 * 输出链表内所有节点
	 */
	public void printList()
	{
		if (isEmpty())
		{
			System.out.println("空链表");
		} else
		{
			other = head;
			for (int i = 0; i < length; i++)
			{
				System.out.print(other.data + " ");
				other = other.next;
			}
			System.out.println();
		}
	}
}
