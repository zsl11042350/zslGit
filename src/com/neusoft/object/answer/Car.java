package com.neusoft.object.answer;

public class Car {
	String brand;
	Car(){
		brand="宝马";
	}
	void init() {
		System.out.println("汽车开始启动！");
	}
	void breakCar() {
		System.out.println("汽车开始刹车！");
	}
	void instrument(String a) {
		System.out.println("汽车的品牌是"+a);
	}
}
