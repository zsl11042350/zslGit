package com.neusoft.$temp.fanxing.oldWay;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Factory factory=new Factory();//若想让工厂只生产某一产品，则用向上转型无法检测
		factory.produce(new Kele());
		factory.produce(new Xuebi());
		factory.produce(new Kele());
		factory.produce(new Kele());
		factory.produce(new Xuebi());
		factory.produce(new Kele());
		factory.produce(new Xuebi());
		factory.produce(new Xuebi());
		System.out.println(Arrays.toString(factory.qishuis));
	}

}
