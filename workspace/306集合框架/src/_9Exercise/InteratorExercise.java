package _9Exercise;

import java.util.*;

public class InteratorExercise
{
	public static void main(String[] args)
	{
		// 1.
		// * �����𡢱�־�������µϡ���ʱ�ݡ����ۡ����ڡ���̤���� ����һ������Ʒ����������
		Collection<String> Car = new ArrayList<>();
		Car.add("����");
		Car.add("��־");
		Car.add("����");
		Car.add("�µ�");
		Car.add("��ʱ��");
		Car.add("����");
		Car.add("����");
		Car.add("��̤");
		Car.add("��");
		// * �Ƴ��µ�
		Car.remove("�µ�");
		// * ��ʾ����������
		System.out.println(Car.size());
		// * ��ʾ����
		System.out.println(Car);
		// * ʹ�ü�ǿ��for������ӡ����Ԫ��
		for(String s:Car)
		{
			System.out.print(s+",");
		}
		System.out.println();
		// * ʹ�õ�����������ɾ�����к���"��"��Ʒ�ƣ���ʾɾ����Ľ��
		Iterator<String> it = Car.iterator();
		while(it.hasNext())
		{
			String n = it.next();
			System.out.print(n+",");
			if(n.contains("��"))
			{
				it.remove();
			}
		}
		System.out.println();
		System.out.println(Car);
			
			
		// 2. 
		// * ��1 2 5 7 17 20 ����һ��a����\
		Collection<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(17);
		a.add(20);
		// * ��1 4 5 13 15 17  19 ����һ��b����
		Collection<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(4);
		b.add(5);
		b.add(13);
		b.add(15);
		b.add(17);
		b.add(19);
		// * ����c�з���a��b������Ԫ��
		Collection<Integer> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
		// * ����d�з���a��b�Ľ���Ԫ��
		Collection<Integer> d = new ArrayList<>();
		d.addAll(a);
		d.retainAll(b);
		System.out.println(d);
		// * a b c d
		
		// 3. ����һ��Ա���� Ա����� ���� ����
		// ����һ��������������Ա������:
		// 10001 �ǲ�˹ ���۲�
		// 10002 �Ǵ� ���̲�
		// 10003 ���� �ͷ���
		// 10004 ���� ���ز�
		Collection<Employee> a3 = new LinkedList<>();
		Employee e1 = new Employee(10001, "�ǲ�˹","���۲�");
		Employee e2 = new Employee(10002, "�Ǵ�","���̲�");
		Employee e3 = new Employee(10003, "����","�ͷ���");
		Employee e4 = new Employee(10004, "����","���ز�");
		a3.add(e1);
		a3.add(e2);
		a3.add(e3);
		a3.add(e4);
		System.out.println(a3);
		// �Ƴ�10001��ŵ�Ա�� ,��������ͬ����Ϊ��ͬһ���ˡ�
		Iterator it3 = a3.iterator();
		while(it3.hasNext())
		{
			Employee e = (Employee) it3.next();			
			if(e.num == 10001)
			{
				it3.remove();
			}
		}
		System.out.println(a3);

	}
}
