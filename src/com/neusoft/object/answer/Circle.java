package com.neusoft.object.answer;

public class Circle {
	private double radius;
	Circle(){
		radius=0;
	}
	Circle(double r) {
		radius=r;
	}
	double getArea(double r) {
		double S=3.14*r*r;
		return S;
		}
	double getPerimeter(double r) {
		double C=2*3.14*r;
		return C;
	}
	void  show(double a,double b,double c) {
		System.out.println("圆的半径为："+a);
		System.out.println("圆的周长为："+b);
		System.out.println("圆的面积为："+c);
	}
}
