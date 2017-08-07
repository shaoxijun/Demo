package _99Exercise;

import java.util.*;

public class ListExercise
{
	public static void main(String[] args)
	{
		//---------------------------------------------------------
		// List ��ϰ
		//---------------------------------------------------------		
		// 4. ��������List��������l1 l2
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		// *** ��� ***
		// * l1 ��� "A" "B" "C" ����Ԫ��
		l1.add("A");
		l1.add("B");
		l1.add("C");
		// * l2 ��� "D" "E" "F" "Egg" "Eee"
		l2.add("D");
		l2.add("E");
		l2.add("F");
		l2.add("Egg");
		l2.add("Eee");
		// * ��l2���е�����Ԫ�ؼ��뵽l1��
		l1.addAll(l2);
		System.out.println(l1);
		// *** �޸� ***
		// * ��l1������Ϊ2λ�õĸ�Ϊ"Z"
		l1.set(2, "Z");
		System.out.println(l1);
		// *** ��ʾ����ȡ ***
		// * ��ӡ��ʾl1 l2�Ĵ�С
		System.out.println("l1�Ĵ�С"+l1.size()+",l2�Ĵ�С"+l2.size());
		// * ��ʾl1���±�Ϊ1��Ԫ��
		System.out.println(l1.get(1));
		// *** ɾ�� ***
		// * ��l1������Ϊ1�Ķ���ɾ��
		l1.remove(1);
		l1.add("B");
		System.out.println(l1);
		// * ��l1�е�һ������Ϊ"B"�Ķ���ɾ��
		Iterator it1 = l1.iterator();
		while(it1.hasNext())
		{
			String n = (String) it1.next();
			if(n.startsWith("B"))
			it1.remove();
		}
		System.out.println(l1);
		// *** ���������� ***
		Iterator it2 = l1.iterator();
		while(it2.hasNext())
		{
			String n = (String) it2.next();
			System.out.print(n+",");
		}
		System.out.println();
		// * ʹ�õ���������������ɾ����E�Ķ���
		Iterator it3 = l1.iterator();
		while(it3.hasNext())
		{
			String n = (String) it3.next();
			if(n.contains("E"))
				it3.remove();			
		}
		System.out.println(l1);

		// 5. ����һ���˿���Poker��
		// ��52���˿��Ʒ���һ��List����
		// д��ϴ�Ʒ����������List�е�Ԫ�ش��ҷ�������һList��
		// ���ƣ���ϴ�õ������η��ƣ�����4���������(��4��List��)
		// ��ӡ��4��������е�����Ϣ
		Poker p5 = new Poker();
		p5.deal();

		// 6. ����һ��Student�࣬��ʹ��List���������������
		// ѧ�� ���� Ӣ�� ��ѧ ����
		// 10001 ���� 98 34 89
		// 10002 ���� 75 78 89
		// 10003 ���� 38 82 100
		// 10004 ���� 87 86 75
		// 10005 С�� 29 100 98
		// 10006 �ܲ� 87 65 100
		// 1. ʹ�ö��ַ�ʽ������������Ԫ�أ�����ӡ
		// 2. ��ѯ��ӡ�����ĳɼ�
		// 3. �Ƴ�����
		// 4. �ܲ���Ϊ���ױ�ץ���޸Ĳܲٵ���ѧ�ɼ�Ϊ0��
//		ս���Է���
	}
}
