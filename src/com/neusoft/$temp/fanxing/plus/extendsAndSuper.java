package com.neusoft.$temp.fanxing.plus;

import java.util.ArrayList;
import java.util.List;

public class extendsAndSuper {

	public static void main(String[] args) {
		List<? extends Fruit> fruits;//<? extends E>:接收E类型或者E的子类型。 <? extends E> 是 Upper Bound（上限） 的通配符，用来限制元素的类型的上限,<?>是<? extends Object>的简写
		fruits = new ArrayList<Fruit>();
		fruits = new ArrayList<Apple>();
		//fruits = new ArrayList<Object>();//集合中元素类型为Fruit的父类,编译不通过
		
		//写入,都不行，<? extends Fruit>只是告诉编译器集合中元素的类型上限，它的具体实现类型是不确定的，既然是不确定的，为了类型安全，编译器只能阻止添加元素了。
		//fruits.add(new Fruit());//编译不通过
		//fruits.add(new Apple());//编译不通过，例如当添加一个Apple时，但fruits此时可能由ArrayList<Banana>实现，显然类型就不兼容了
		//fruits.add(new Object());//编译不通过
		fruits.add(null);//null可以表示任何类型,可以添加
		
		//读取,都可以，无论fruits由什么类实现，编译器都可以确定获取的元素是Fruit类型的子类，所以读取集合中的元素是允许的
		Fruit fruit = fruits.get(0);//编译通过，可以确定获取的元素是Fruit类型
		Apple apple=(Apple) fruits.get(1);//需要强制类型转换，不确定获取的元素是什么类型
		Object object=fruits.get(0);//泛型类型的父类也是可以的
		
		
		
		List<? super Apple> apples;//<？super E>:接收E类型或者E的父类型。 <? super E> 是 Lower Bound（下限） 的通配符 ，用来限制元素的类型下限
		apples = new ArrayList<Apple>();
		apples = new ArrayList<Fruit>();
		apples = new ArrayList<Object>();
		//apples = new ArrayList<RedApple>();//集合中元素类型为Apple的子类,编译不通过
		
		//写入,<? extends Fruit>只是告诉编译器集合中元素的类型下限，apples中装的元素是Apple或Apple的某个父类，我们无法确定是哪个具体类型，但是可以确定的是Apple和Apple的子类是和这个“不确定的类”兼容的，
		//即无论被什么实现，Apple的子类总能添加进去
		apples.add(new Apple());
		apples.add(new RedApple());
		//apples.add(new Fruit());//编译不通过,例如当往apples中添加一个Fruit类型对象时，但此时apples指向ArrayList<Apple>，显然类型就不兼容了
		
		//读取,都可以，虽然无法确定的获取的元素具体是什么类型，但能确定一定是Object类型的子类，因此我们想获得存储进去的对应类型的元素就只能进行强制类型转换了
		Apple apple1 = (Apple)apples.get(0);//获取的元素为Object类型
		Fruit fruit1 = (Fruit) apples.get(0);
		Object object1=apples.get(0);
		
		//问题来了，JDK1.5引入泛型的目的是为了避免强制类型转换的繁琐操作，那么使用泛型<? super E>干嘛呢？这里就得谈到泛型PECS法则了 
		//如果要从集合中读取类型T的数据(集合提供数据)，并且不能写入，可以使用 ? extends 通配符；(Producer Extends)
		//如果要从集合中写入类型T的数据(集合消费数据)，并且不需要读取，可以使用 ? super 通配符；(Consumer Super)
		//如果既要存又要取，那么就不要使用任何通配符。
	/*总结：
    < ? extends E >
        add： 不允许加入 任何 元素！
        get： 可以获取元素，但是必须使用 E 来接受元素！
    < ? super E >
        add: 允许添加 E和E的子类 元素！
        get: 可以获取元素，但是类的信息丢失了，所以返回只能使用Object引用来接受！如果需要自己的类型需要强制类型转换！*/

	}
}
