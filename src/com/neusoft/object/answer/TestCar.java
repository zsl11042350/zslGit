package com.neusoft.object.answer;

public class TestCar {
		public static void main(String[] args) {
			Car car = new Car();
			car.init();
			car.breakCar();
			car.instrument(car.brand);
		}
}
