package com.neusoft.object.answer;

public class Addition {
	public int addition(int a,int b) {
		return a+b;
	}
	public long addition(long a,long b) {
		return a+b;
	}
	public float addition(float a,float b) {
		return a+b;
	}
	public double addition(double a,double b) {
		return a+b;
	}
	public String addition(String a,String b) {
		return a+b;
	}
	public static void main(String[] args) {
		Addition add = new Addition();
		int a = add.addition(1, 5);
		System.out.println(a);
		long b = add.addition(2L, 5L);
		System.out.println(b);
		float c=add.addition(0.3F, 0.2F);
		System.out.println(c);
		double d=add.addition(0.4D, 0.2D);
		System.out.println(d);
		String e=add.addition("0.4", "0.2");
		System.out.println(e);
	}
}
