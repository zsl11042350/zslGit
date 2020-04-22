package com.neusoft.$temp.fanxing.newWay;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Factory<Kele> factory1=new Factory<Kele>();//可以对创建出的产品即使通过向上转型也能凭泛型指定的类型进行检测
		Factory<Xuebi> factory2=new Factory<Xuebi>();//编译时类型检查
		factory1.<ZeroKele>jiamtc(new ZeroKele());
		//factory1.produce(new Xuebi());//检测出类型不一致
		factory1.produce(new Kele());
		factory2.produce(new Xuebi());
		factory1.produce(new Kele());
		factory1.produce(new Kele());
		factory2.produce(new Xuebi());
		factory1.produce(new Kele());
		factory2.produce(new Xuebi());
		factory2.produce(new Xuebi());
		System.out.println(Arrays.toString(factory1.qishuis));//Arrays.toString只能对数组使用
		System.out.println(Arrays.toString(factory2.qishuis));//打印出qishuis数组中的每个元素，而每个元素又是对象，故只需对具体的对象对应的类调用toString方法即可
	}

}
