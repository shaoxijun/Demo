package _99Exercise;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SetExercise
{
	public static void main(String[] args)
	{
		// ---------------------------------------------------------
		// Set (HashSet TreeSet)练习
		// ---------------------------------------------------------
		// 1) 让用户输入数字，放入一个Set容器。总共需要有10个不同的数字。

//				save10Number();
		
		// 9 定义一个扑克牌类
		// 1) 随机得到10张不同的牌，放入HashSet容器
		NewPoker p = new NewPoker();
		Set<NewPoker> h91 = new HashSet<>();
		for(int i=0;i<10;i++)
		{
			h91.add((NewPoker) p.poker().get(i));
		}
		System.out.println(h91);
		
		// 2) 随机得到10张不同的牌，放入TreeSet容器
	//   (排序依据:先按照花色，红桃黑桃方片草花，在按照数字大小从小到大)
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
		// 让用户输入10个学生的学号 姓名 语文成绩 数学成绩 放入相应的集合容器
		Student stu1 = new Student(10001,"赵一", 98, 60, 89);
		Student stu2 = new Student(10002,"钱二", 99, 88, 100);
		Student stu3 = new Student(10003,"孙三", 78, 23, 20);
		Student stu4 = new Student(10004,"周四", 94, 79, 79);
		Student stu5 = new Student(10005,"吴六", 85, 99, 79);
		Student stu6 = new Student(10006,"郑七", 75, 68, 78);
		Student stu7 = new Student(10007,"王八", 75, 24, 95);
		Student stu8 = new Student(10008,"冯九", 92, 36, 97);
		Student stu9 = new Student(10009,"陈十", 45, 36, 90);
		Student stu10 = new Student(100010,"张三", 55, 64, 91);
		
		// 1) 按照以下规则排序的集合容器
//	 	* 按照语文成绩从第到高排序
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
		
		// 2) 按照以下规则排序的集合容器
		// 	* 先按照总分从高到底排序
		// 	* 如果总分一致，按照语文成绩从高到底排序
		//  * 如果语文一致，按照数学程序从高到底排序
		//  * 如果语文也一致，按照学号从低到高排序
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
			System.out.print("请输入一个数字：");
			int a = sc.nextInt();
			s1.add(a);
			System.out.println(s1);
		}while(s1.size() <= 10);
	}
}
