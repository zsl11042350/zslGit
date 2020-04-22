package com.neusoft.object.answer;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入圆的半径和圆柱体的高：");
		double r=sc.nextDouble();
		double h=sc.nextDouble();
		Circle ci = new Circle(r);
		double C=ci.getPerimeter(r);
		double S=ci.getArea(r);
		ci.show(r, C, S);
		Cylinder cy = new Cylinder(r,h);
		double V=cy.getVolume(h, S);
		cy.showVolume(V);
	}

}
