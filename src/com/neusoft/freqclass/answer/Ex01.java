package com.neusoft.freqclass.answer;

public class Ex01 {

	public static void main(String[] args) {
		Double dou=new Double("2.3");
		Integer in=new Integer("2");
		String str=new String("2.3");
		StringBuffer bf=new StringBuffer("2.3");
		//可以直接运算：System.out.println(dou+in);
		String dou1=dou.toString();
		String in1=in.toString();
		String bf1=bf.toString();
		System.out.println(dou1);
		System.out.println(in1);
		System.out.println(str);
		System.out.println(bf1);
	}

}
