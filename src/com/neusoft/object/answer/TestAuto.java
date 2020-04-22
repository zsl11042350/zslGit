package com.neusoft.object.answer;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto = new Auto();
		System.out.println(auto.color);
		System.out.println(auto.speed);
		System.out.println(auto.tyreNum);
		System.out.println(auto.weight);
		Auto auto1 = new Auto(3,"white",20,20);
		System.out.println(auto1.color);
		System.out.println(auto1.speed);
		System.out.println(auto1.tyreNum);
		System.out.println(auto1.weight);
		auto1.speedUp();
		auto1.speedDown();
		auto1.stop();
		Auto auto2 = new SmallCar();
		auto2.speedUp();
		auto2.speedDown();
	}

}
