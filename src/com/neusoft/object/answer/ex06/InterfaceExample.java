package com.neusoft.object.answer.ex06;

public class InterfaceExample {

	public static void main(String[] args) {
		Circle ci = new Circle();
		Rectangle re = new Rectangle();
		ci.r=1;
		re.length=5;
		re.width=4;
		ci.area();
		ci.grith();
		re.area();
		re.grith();
	}

}
