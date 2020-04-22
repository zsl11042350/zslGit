package com.neusoft.object.answer.ex03;

public class Bus implements Vehicle {
	@Override
	public void start() {
		System.out.println("bus is strating");
	}

	@Override
	public void stop() {
		System.out.println("bus is stopping");
	}
	
}
