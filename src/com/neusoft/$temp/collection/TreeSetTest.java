package com.neusoft.$temp.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {//可以根据去重的性质，对数据进行处理

	public static void main(String[] args) {
		TreeSet<Person> tp=new TreeSet<Person>(new myComparator01());//如果不加自己的比较器，而参数的类型又不允许默认的 Comparator对它们进行比较，抛出ClassCastException：Person cannot be cast to java.lang.Comparable
		tp.add(new Person("xiaoli",(short)20,(byte)2));
		tp.add(new Person("zhangsan",(short)25,(byte)4));
		tp.add(new Person("lisi",(short)30,(byte)3));
		tp.add(new Person("lisi1",(short)20,(byte)6));
		tp.add(new Person("wangwu",(short)20,(byte)5));
		tp.add(new Person("zhaoliu",(short)18,(byte)1));
		//System.out.println(tp);//可以直接打印集合对象
		Iterator<Person> it=tp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

//根据年龄（数字）进行排序
class myComparator implements Comparator<Person>{//比较用来排序的两个参数。第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()<o2.getAge()) {
			return -1;
		}else if(o1.getAge()>o2.getAge()) {
			return 1;
		}
		return 0;//0可以去重，如果比较的数据有重复，则保留最先放入内存的那个（可能直接抛弃后来的数据）
	}
}

class myComparator01 implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()<o2.getAge()) {
			return -1;
		}else {
			return 1;//这样可以保留重复数据
		}
	}
}

class myComparator02 implements Comparator<Person>{//可以返回任意整数，结果为正数进行交换，负数的判断条件可作为升序降序的标志，第一个数小于第二个数则是升序，反之降序
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()<o2.getAge()) {
			return -2;
		}else if(o1.getAge()>o2.getAge()) {
			return 3;
		}
		return -3;//只要不是返回0，都可以保留重复数据
	}
}

class myComparator1 implements Comparator<Person>{//根据姓名（首字母）进行排序
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getName().charAt(0)<o2.getName().charAt(0)) {
			return -1;
		}else if(o1.getName().charAt(0)>o2.getName().charAt(0)) {
			return 1;
		}
		return 0;
	}
}

class myComparator2 implements Comparator<Person>{
@Override
public int compare(Person o1, Person o2) {
	if (o2.getLevel() > o1.getLevel()) {
		return 1;
	} 
	else if (o2.getLevel() < o1.getLevel()) {
		return -1;
	}
	return 0;
}
}

