package com.neusoft.base.answer;

public class Ex06 {

	public static void main(String[] args) {
		//int pre;
		int last=1;
	for(int i=2;i<=10;i++) {
		last=(last+1)*2;
		//last=pre;
		System.out.println("猴子第"+(11-i)+"天有"+last+"个桃子");
	}
		/*
		累加求和倒推int num=1;
		for(int i=9;i>=1;i--) {
			num=(num+1)*2;
			System.out.println("猴子第"+i+"天有"+num+"个桃子");
		}*/
	}

}
