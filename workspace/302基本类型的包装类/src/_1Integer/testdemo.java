package _1Integer;


public class testdemo
{
	public static void main(String[] args)
	{
				// 3. 如果用Integer对象保存32栈灯的开关情况.
				// Integer 对应的是int 占用内存是4个字节，共32个二进制位
				// 每个2进制位可以有2种状态，即可以表示32栈灯的开关状态。
				// 计算有多少栈灯亮着(查找api,有一个的方法可直接使用)		
				Integer d = new Integer(1);
				System.out.println(d);
				Integer.bitCount(d);
				System.out.println(Integer.bitCount(d));
				// 4. 综合练习:
				// 编写一个LightManager类管理32站栈灯的开关.
				// 类中使用一个Integer保存这32栈灯的状态
				// 用以下代码测试:
//				LightManager lm = new LightManager();
//				lm.print();// 输出 00000000000000000000000000000000
//				// 打开所有灯
//				lm.openAll();
//				lm.print();// 输出 11111111111111111111111111111111
//				// 关闭第8栈灯
//				lm.close(8);
//				lm.print();// 输出 11111110111111111111111111111111
//				// 关闭第10 12 14 16栈灯 (使用可变参数方法)
//				lm.close(10,12,14,16);
//				lm.print();// 输出 11111110101010101111111111111111
//				// 将开的灯关掉，关的灯打开
//				lm.reverse();
//				lm.print();// 输出 00000001010101010000000000000000
//				// 打开第31 32盏灯
//				lm.open(31,32);
//				lm.print();// 输出 00000001010101010000000000000011
//				// 打印开着灯的数量
//				System.out.println(lm.getOpenCount());// 输出 7 
//				// 打印第10盏灯的开关状态
//				System.out.println(lm.isOpen(10));// 输出 true
				
	}
}
