package _99Exercise;

import java.util.*;

public class QueueExercise
{
	static Deque<Integer> d = new LinkedList<>();
	static int num = 1;
	static int take()
	{
		
		d.offerLast(num);
		num++;
		
		return d.peekLast();
	}

	public static void main(String[] args) throws InterruptedException
	{
		// 7 ��дһ��ҽԺ�����нк�ϵͳ
		// ȡ��()
		// �к�()
		int a =20;
		System.out.println("ÿ��涨ֻ�ܽ�"+a+"���˿ͣ������߿�");	
		while(true)
		{
				int ran = (int)(Math.random()*2);
				Thread.sleep(300);
				switch(ran)
				{
				case 0:
					String t = "�˿�ȡ��,��ǰ�Ŷӱ��"+take()+"����ǰ�滹��"+(d.peekLast()-d.peekFirst())+"λ�˿��ڵȴ�";
					System.out.println(t);
					a--;
					break;
				case 1:
					if(d.peekFirst() == null)
					{
						System.out.println("�ҽ��ˣ���û�����Ŷ�");
						continue;
					}else
					{
						System.out.println("���ڽк�,����Ϊ"+d.pollFirst()+"�Ĺ˿͵�����");
						
						break;
					}
				}
				
				if(a==0)
					break;
		}
		while(true)
		{
			if(d.peekLast() != null)
			{
				System.out.println("���ڽк�,����Ϊ"+d.pollFirst()+"�Ĺ˿͵�����");
			}else 
			{
				System.out.println("������������");
				break;
				
			}
				
		}
		// ��Ҫ��һ�����б����Ŷ���Ϣ
		// ��Ҫ�и��������浱ǰ�������Ƕ���

		// ��д���Դ�����в���:
		// ��дһ����ѭ����ѭ���������ȡ�Ż��߽кŷ������ȴ�500ms
		// ��ʾ����������Ϣ
		// �˿�ȡ��,��ǰ�Ŷӱ��1����ǰ�滹��0λ�˿��ڵȴ�
		// �˿�ȡ��,��ǰ�Ŷӱ��2����ǰ�滹��1λ�˿��ڵȴ�
		// �˿�ȡ��,��ǰ�Ŷӱ��3����ǰ�滹��2λ�˿��ڵȴ�
		// ���ڽк�,����Ϊ1�Ĺ˿͵�����.
		// ���ڽк�,����Ϊ2�Ĺ˿͵�����.
		// �˿�ȡ��,��ǰ�Ŷӱ��4����ǰ�滹��1λ�˿��ڵȴ�
		// �˿�ȡ��,��ǰ�Ŷӱ��5����ǰ�滹��2λ�˿��ڵȴ�
		// ���ڽк�,����Ϊ3�Ĺ˿͵�����.
		// ���ڽк�,����Ϊ4�Ĺ˿͵�����.
		// ���ڽк�,����Ϊ5�Ĺ˿͵�����.
		// ���ڽк�.��ǰû�й˿��ڵȴ�
		// ���ڽк�.��ǰû�й˿��ڵȴ�
		// �˿�ȡ��,��ǰ�Ŷӱ��6����ǰ�滹��0λ�˿��ڵȴ�		

	}

}
