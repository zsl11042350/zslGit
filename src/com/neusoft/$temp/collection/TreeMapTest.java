package com.neusoft.$temp.collection;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<String, Person> map = new TreeMap<String, Person>(new TreeMapUserCompartor());
		map.put("111000", new Person("xiaozhang", (short) 12,(byte)2));
		map.put("222000", new Person("huawei1", (short) 10,(byte)6));
		map.put("222000", new Person("xiaoli", (short) 18,(byte)1));
		map.put("222000", new Person("huawei", (short) 11,(byte)4));
		map.put("444000", new Person("apple", (short) 16,(byte)3));
		map.put("333000", new Person("xiaozhu", (short) 22,(byte)5));
		// for(String key:map.keySet()) {
		// System.out.println(map.get(key));
		// }
		for (Entry<String, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}

class TreeMapUserCompartor implements Comparator<String> {//Map只能比较键

	@Override
	public int compare(String u1, String u2) {
		return u1.compareTo(u2);//字符串的compareTo方法，u1<u2，返回负数，故为升序排列，若想逆序，前面加负号，参考class myComparator02
	}

}
