package _9Exercise;

import java.util.*;

public class InteratorExercise
{
	public static void main(String[] args)
	{
		// 1.
		// * 将奇瑞、标志、宝马、奥迪、保时捷、奔驰、奔腾、奔踏、大奔 放入一个汽车品牌容器对象
		Collection<String> Car = new ArrayList<>();
		Car.add("奇瑞");
		Car.add("标志");
		Car.add("宝马");
		Car.add("奥迪");
		Car.add("保时捷");
		Car.add("奔驰");
		Car.add("奔腾");
		Car.add("奔踏");
		Car.add("大奔");
		// * 移除奥迪
		Car.remove("奥迪");
		// * 显示容器的数量
		System.out.println(Car.size());
		// * 显示容器
		System.out.println(Car);
		// * 使用加强型for遍历打印所有元素
		for(String s:Car)
		{
			System.out.print(s+",");
		}
		System.out.println();
		// * 使用迭代器遍历并删除所有含有"奔"的品牌，显示删除后的结果
		Iterator<String> it = Car.iterator();
		while(it.hasNext())
		{
			String n = it.next();
			System.out.print(n+",");
			if(n.contains("奔"))
			{
				it.remove();
			}
		}
		System.out.println();
		System.out.println(Car);
			
			
		// 2. 
		// * 将1 2 5 7 17 20 放入一个a容器\
		Collection<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(17);
		a.add(20);
		// * 将1 4 5 13 15 17  19 放入一个b容器
		Collection<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(4);
		b.add(5);
		b.add(13);
		b.add(15);
		b.add(17);
		b.add(19);
		// * 容器c中放入a和b的所有元素
		Collection<Integer> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
		// * 容器d中放入a和b的交集元素
		Collection<Integer> d = new ArrayList<>();
		d.addAll(a);
		d.retainAll(b);
		System.out.println(d);
		// * a b c d
		
		// 3. 定义一个员工类 员工编号 姓名 部门
		// 创建一个容器，将以下员工放入:
		// 10001 乔布斯 销售部
		// 10002 盖茨 工程部
		// 10003 赵云 客服部
		// 10004 貂蝉 公关部
		Collection<Employee> a3 = new LinkedList<>();
		Employee e1 = new Employee(10001, "乔布斯","销售部");
		Employee e2 = new Employee(10002, "盖茨","工程部");
		Employee e3 = new Employee(10003, "赵云","客服部");
		Employee e4 = new Employee(10004, "貂蝉","公关部");
		a3.add(e1);
		a3.add(e2);
		a3.add(e3);
		a3.add(e4);
		System.out.println(a3);
		// 移除10001编号的员工 ,如果编号相同。认为是同一个人。
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
