package com.neusoft.$temp.collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCollectionsTest {
	public static void main(String[] args) {
		LinkedList<Person> linkedList = new LinkedList<Person>();
		// linkedList.add("zhangsan");
		// linkedList.add("lisi");
		// linkedList.add("lisi");
		// linkedList.add("ali");
		// linkedList.add(1, "xiaosong");
		// linkedList.remove("xiaosong");
		linkedList.add(new Person("xiaozhang", (short) 20,(byte)1));
		linkedList.add(new Person("huangfeihong", (short) 18,(byte)5));
		linkedList.add(new Person("huangfeihong2", (short) 18,(byte)4));
		linkedList.add(new Person("gangtiexia", (short) 30,(byte)3));
		linkedList.add(new Person("zhizhuxia", (short) 16,(byte)2));
		linkedList.add(new Person("zhizhuxia", (short) 16,(byte)6));
		System.out.println(linkedList);
		Collections.sort(linkedList,new myComparator());//sort(List<T> list, Comparator<? super T> c)
		System.out.println(linkedList);
		System.out.println(Collections.binarySearch(linkedList, new Person("huangfeihong", (short) 18,(byte)5)));

	}
}
