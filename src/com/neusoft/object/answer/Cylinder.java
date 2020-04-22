package com.neusoft.object.answer;

public class Cylinder extends Circle{
	private double height;
	Cylinder (double r, double h){
		double radius = r;
		height = h;
	}
	double getVolume(double h,double S) {
		double V=h*S/3;
		return V;
	}
	void  showVolume(double V) {
		System.out.println("圆柱体的体积为："+V);
	}

}
