package com.neusoft.freqclass.answer.ex02;

public class Ex02 {

	public static void main(String[] args) {
		String str = new String("hello");
		String str1 = "hello";
		System.out.println(str==str1);//内存地址不同，故FALSE
		System.out.println(str.equals(str1));//值相同，故TRUE
		
	}

}
