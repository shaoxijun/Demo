package ��������;

public class LinkedList
{
	//����һ���ڵ����
	Node head;//��Ϊǰһ���ڵ�
	//�������
	void add(int n)
	{
		//�ж���û�е�һ���ڵ㣬���û�У���ֱ�Ӵ���ͷ�ڵ�
		if(this.head== null)
		{
			Node node = new Node();//û��ͷ�ڵ�ʱ���ȴ���һ���ڵ㣬�������ݣ�Ȼ�󸳸�ͷ�ڵ�			
			node.data = n;
			this.head = node;
		}
		else
		{
			this.head.add(n);//�����ͷ�ڵ㣬��ת���ڵ����������ݵķ����С�
		}
	}
	//ɾ������
	void remove(int n)
	{
		if(this.head == null)
		{
			System.out.println("������ô�����ݿ���ɾ��");
		}
		else
		{
			if(this.head.next != null)
			{
				this.head.next.remove(n,this.head);
			}
		}
	}
	//��ӡ
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
	//�����ڵ�
	//��һ��.�����ڵ�
//1.����һ���ڵ��࣬����ڵ��������   a.data������������    b.  Next����ָ����һ���ڵ�
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
