package com.neusoft.object.answer;

public class Auto {
	int tyreNum;
	String color;
	int weight;
	int speed;
	public Auto() {//添加无参构造有利于子类继承时不用非得用有参构造方法
		tyreNum = 4;
		color = "red";
		weight = 10;
		speed = 10;
	}
	public Auto(int tyreNum, String color, int weight, int speed) {
		this.tyreNum = tyreNum;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	void speedUp() {
		System.out.println("汽车加速了！");
	}
	void speedDown() {
		System.out.println("汽车减速了！");
	}
	void stop() {
		System.out.println("汽车停了！");
	}
}
