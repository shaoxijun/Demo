package _99Exercise;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SetExercise
{
	public static void main(String[] args)
	{
		// ---------------------------------------------------------
		// Set (HashSet TreeSet)��ϰ
		// ---------------------------------------------------------
		// 1) ���û��������֣�����һ��Set�������ܹ���Ҫ��10����ͬ�����֡�

//				save10Number();
		
		// 9 ����һ���˿�����
		// 1) ����õ�10�Ų�ͬ���ƣ�����HashSet����
		NewPoker p = new NewPoker();
		Set<NewPoker> h91 = new HashSet<>();
		for(int i=0;i<10;i++)
		{
			h91.add((NewPoker) p.poker().get(i));
		}
		System.out.println(h91);
		
		// 2) ����õ�10�Ų�ͬ���ƣ�����TreeSet����
	//   (��������:�Ȱ��ջ�ɫ�����Һ��ҷ�Ƭ�ݻ����ڰ������ִ�С��С����)
		Set<NewPoker> h92 = new TreeSet<>(new Comparator<NewPoker>()
		{
			@Override
			public int compare(NewPoker a, NewPoker a1)
			{
				if(a.id > a1.id)
				{
					return 1;
				}
				else if(a.id < a1.id)
				{
					return -1;
				}else
					return 0;
			}
		});
		for(int i=0;i<10;i++)
		{
			h92.add((NewPoker) p.poker().get(i));
		}
		System.out.println(h92);
		
		
		
		// 10
		// ���û�����10��ѧ����ѧ�� ���� ���ĳɼ� ��ѧ�ɼ� ������Ӧ�ļ�������
		Student stu1 = new Student(10001,"��һ", 98, 60, 89);
		Student stu2 = new Student(10002,"Ǯ��", 99, 88, 100);
		Student stu3 = new Student(10003,"����", 78, 23, 20);
		Student stu4 = new Student(10004,"����", 94, 79, 79);
		Student stu5 = new Student(10005,"����", 85, 99, 79);
		Student stu6 = new Student(10006,"֣��", 75, 68, 78);
		Student stu7 = new Student(10007,"����", 75, 24, 95);
		Student stu8 = new Student(10008,"���", 92, 36, 97);
		Student stu9 = new Student(10009,"��ʮ", 45, 36, 90);
		Student stu10 = new Student(100010,"����", 55, 64, 91);
		
		// 1) �������¹�������ļ�������
//	 	* �������ĳɼ��ӵڵ�������
		Set<Student> t11 = new TreeSet<>(new Comparator<Student>()
		{

			@Override
			public int compare(Student a, Student a1)
			{
				if(a.chinese > a1.chinese)
				{
					return -1;
				}
				else if(a.chinese < a1.chinese)
				{
					return 1;
				}else
					return 0;
			}
		});
		t11.add(stu1);
		t11.add(stu2);
		t11.add(stu3);
		t11.add(stu4);
		t11.add(stu5);
		t11.add(stu6);
		t11.add(stu7);
		t11.add(stu8);
		t11.add(stu9);
		t11.add(stu10);
		System.out.println(t11);
		
		// 2) �������¹�������ļ�������
		// 	* �Ȱ����ִܷӸߵ�������
		// 	* ����ܷ�һ�£��������ĳɼ��Ӹߵ�������
		//  * �������һ�£�������ѧ����Ӹߵ�������
		//  * �������Ҳһ�£�����ѧ�Ŵӵ͵�������
		Set<Student> t12 = new TreeSet<>();
		t12.add(stu1);
		t12.add(stu2);
		t12.add(stu3);
		t12.add(stu4);
		t12.add(stu5);
		t12.add(stu6);
		t12.add(stu7);
		t12.add(stu8);
		t12.add(stu9);
		t12.add(stu10);
		System.out.println(t12);
		
	}
	static void save10Number()
	{
		Scanner sc = new Scanner(System.in);
		Set<Integer> s1 = new HashSet<>();
		do 
		{
			System.out.print("������һ�����֣�");
			int a = sc.nextInt();
			s1.add(a);
			System.out.println(s1);
		}while(s1.size() <= 10);
	}
}
