package com.neusoft.$temp.collection;

import java.util.*;

public class ListQuchong {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(26); 
		list.add(39); 
		list.add(5); 
		list.add(40); 
		list.add(39); 
		list.add(25); 
		list.add(40); 
		System.out.println(list); 
		//方法一:使用java8新特性stream进行List去重
//		List newList = (List) list.stream().distinct().collect(Collectors.toList()); 
//		System.out.println("java8新特性stream去重:"+newList); 
		
		//方法二:双重for循环去重 
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if (i != j && list.get(i) == list.get(j)) {
//					list.remove(list.get(j));
//				}
//			}
//		}
//		System.out.println("双重for循环去重:"+list); 
		
		//方法三:set集合判断去重,不打乱顺序
//		Set set1 = new HashSet();
//		List newList1 = new ArrayList();
//		for(Integer integer:list){
//			if (set1.add(integer)) {
//				newList1.add(integer);
//			}
//		}
//		System.out.println("set集合判断去重:"+newList1); 
		
		
		//方法四:遍历后判断赋给另一个list集合 
//		List newList2 = new ArrayList();
//		for (Integer integer : list) {
//			if (!newList2.contains(integer)) {
//				newList2.add(integer);
//			}
//		}
//		System.out.println("赋值新list去重:"+newList2); 
		
		
		//方法五:set和list转换去重 
		Set set2 = new HashSet(); 
		List newList3 = new ArrayList(); 
		set2.addAll(list); 
		newList3.addAll(set2); 
		System.out.println("set和list转换去重:"+newList3);
	}
}
