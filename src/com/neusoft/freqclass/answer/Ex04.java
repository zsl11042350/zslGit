package com.neusoft.freqclass.answer;

public class Ex04 {

	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(str.length());
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.replace('l', 'm'));
		String[] a=str.split(" ", 2); 
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[0].equals(a[1]));
	}

}
