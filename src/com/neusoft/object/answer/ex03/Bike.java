package com.neusoft.object.answer.ex03;

public class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("bike is strating");
	}

	@Override
	public void stop() {
		System.out.println("bike is stopping");
	}
	

}
