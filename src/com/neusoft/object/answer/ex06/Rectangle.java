package com.neusoft.object.answer.ex06;

public class Rectangle implements Shape2D{
	double length;
	double width;

	public void grith() {
		double grith=(length+width)*2;
		System.out.println("长方形的周长为："+grith);
	}

	public void area() {
		double grith=length*width;
		System.out.println("长方形的周长为："+grith);
	}
}
