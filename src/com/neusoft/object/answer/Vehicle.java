package com.neusoft.object.answer;

public class Vehicle {
	int speed;
	int size;
	void move() {
		System.out.println("汽车正在移动");
	}
	int setSpeed(int speed) {
		this.speed=speed;
		return this.speed;
	}
	int setSize(int size) {
		this.size=size;
		return this.size;
	}
	void speedUp(){
		speed+=1;
		System.out.println("汽车提速到了"+speed);
	}
	void speedDown(){
		speed-=1;
		System.out.println("汽车减速到了"+speed);
	}
	public static void main(String[] args) {
		Vehicle ve = new Vehicle();
		int size=ve.setSize(8);
		System.out.println("汽车的体积为"+size);
		ve.move();
		int speed=ve.setSpeed(5);
		System.out.println("汽车当前速度为"+speed);
		ve.speedUp();
		ve.speedDown();
		ve.speedDown();
		ve.speedUp();
	}

}
