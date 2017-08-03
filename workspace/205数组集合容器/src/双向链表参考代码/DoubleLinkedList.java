package ˫������ο�����;

public class DoubleLinkedList<T>
{
	private static class Node<T>
	{
		Node<T> perv; // ǰ�ڵ�
		Node<T> next; // ��ڵ�
		T data; // ����

		public Node(T t)
		{
			this.data = t;
		}
	}

	private Node<T> head; // ͷ�ڵ�
	private Node<T> last; // β�ڵ�
	private Node<T> other; // ���ýڵ�����ʱ����
	private int length; // ������

	/**
	 * �޲ι���
	 */
	public DoubleLinkedList()
	{
		head = new Node<T>(null);
		last = head;
		length = 0;
	}

	/**
	 * ��ʼ��ʱ����һ���ڵ�
	 * 
	 * @param data
	 *            ����
	 */
	public DoubleLinkedList(T data)
	{
		head = new Node<T>(data);
		last = head;
		length = 1;
	}

	/**
	 * ���һ���ڵ�
	 * 
	 * @param data
	 *            ��ӵ�����
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
			// β�巨
			other = new Node<T>(data);
			other.perv = last;//����ǰһ���ڵ�
			last.next = other;
			last = other;
			length++;
		}
	}

	/**
	 * ��ָ�����ݺ����һ���ڵ�
	 * 
	 * @param data
	 *            ָ��������
	 * @param insertData
	 *            ���������
	 * @return ����ɹ�����true,���ɹ�����false
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
				// �ж��Ƿ������һ���ڵ����ӽڵ�
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
	 * ��ָ������ǰ����һ���ڵ�
	 * 
	 * @param data
	 *            ָ��������
	 * @param insertData
	 *            ���������
	 * @return ����ɹ�����true,���ɹ�����false
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
	 * ���������������
	 * 
	 * @param index
	 *            ����
	 * @return ����
	 */
	public T get(int index)
	{
		if (index > length || index < 0)
		{
			throw new IndexOutOfBoundsException("����Խ��:" + index);
		}
		other = head;
		for (int i = 0; i < index; i++)
		{
			other = other.next;
		}
		return other.data;
	}

	/**
	 * ��ֵ�滻��ֵ
	 * 
	 * @return �ɹ�Ϊtrue,δ�ҵ�Ϊfalse
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
	 * �Ƴ�ָ����Ԫ��
	 * 
	 * @param data
	 *            ��Ҫ�Ƴ���Ԫ��
	 * @return ������Ϊfalse,�ɹ�Ϊtrue
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
	 * �������Ƿ������Ԫ��
	 * 
	 * @return ����Ϊtrue,������Ϊfalse
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
	 * ������һ���ڵ������
	 * 
	 * @return ���һ���ڵ������
	 */
	public T getLast()
	{
		return last.data;
	}

	/**
	 * ��õ�һ���ڵ������
	 * 
	 * @return ��һ���ڵ������
	 */
	public T getFirst()
	{
		return head.data;
	}

	/**
	 * �������ĳ���
	 * 
	 * @return ����
	 */
	public int getSize()
	{
		return length;
	}

	/**
	 * �Ƿ�Ϊ������
	 * 
	 * @return ������Ϊtrue,�ǿ�����Ϊfalse
	 */
	public boolean isEmpty()
	{
		return length == 0;
	}

	/**
	 * �������
	 */
	public void clear()
	{
		head = null;
		length = 0;
	}

	/**
	 * ������������нڵ�
	 */
	public void printList()
	{
		if (isEmpty())
		{
			System.out.println("������");
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
