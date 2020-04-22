package com.neusoft.$temp.collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriotiryQueueTest {

	public static void main(String[] args) {
		PriorityQueue priorityQueue=new PriorityQueue(5,new myComparator2());//5为初始容量,能随用随扩
		priorityQueue.add(new Person("zhangsan",(short)18,(byte)2));
		priorityQueue.add(new Person("xiaodong",(short)19,(byte)3));
		priorityQueue.add(new Person("apple",(short)16,(byte)5));
		priorityQueue.add(new Person("zhaosi",(short)17,(byte)4));
		priorityQueue.add(new Person("zhaosi1",(short)11,(byte)6));
		priorityQueue.add(new Person("zhaosi2",(short)21,(byte)7));
		priorityQueue.add(new Person("zhaosi3",(short)30,(byte)8));
		System.out.println(priorityQueue.poll());//先进先出，poll的时候一定是有序的，先弹出优先级最高的
		System.out.println(priorityQueue);//遍历的时候不一定有序
		//方法 iterator() 中提供的迭代器不保证以任何特定的顺序遍历优先级队列中的元素。如果需要按顺序遍历，请考虑使用 Arrays.sort(pq.toArray())。
		
		/*Person[] p=new Person[priorityQueue.size()];
		priorityQueue.toArray(p);
		priorityQueue.clear();
		System.out.println(priorityQueue.size());
		Arrays.sort(p,new myComparator());
		System.out.println(Arrays.toString(p));*/
		
		/*Person[] a=(Person[]) priorityQueue.toArray();
		Arrays.sort(a,new myComparator());
		System.out.println(Arrays.toString(a));*/
		
		Object[] a=priorityQueue.toArray();
		Arrays.sort(a);//sort(Object[] a):根据元素的自然顺序(comparable,按优先级倒序)对指定对象数组按升序进行排序
		System.out.println(Arrays.toString(a));
	}

}
