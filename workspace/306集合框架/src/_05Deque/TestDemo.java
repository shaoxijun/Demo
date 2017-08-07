package _05Deque;

import java.util.*;

public class TestDemo
{
	public static void main(String[] args)
	{
		Queue<String> q = new LinkedList<>();//只能new LinkedList();
		//入队列，offer(d"要添加的元素")  add()
		//出队列，poll();   remove()
		//得到队列第一个数peek();   get();
		Deque<String> dq = new LinkedList<>();//只能new LinkedList();继承自Queue
		//入队列，offerFirst(d"要添加的元素")  addFirst()
		//出队列，pollFirst();   removeFirst()
		//得到队列第一个数peekFirst();   getFirst();
		//还有Last么有写，
		
		
		
	}
}
