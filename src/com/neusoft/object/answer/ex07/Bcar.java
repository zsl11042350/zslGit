package com.neusoft.object.answer.ex07;

public class Bcar extends Car{
	public Bcar(String id, String brand, String color, double barePrice, String grade, double disp, double drivePrice) {
		super(id, brand, color, barePrice, grade, disp, drivePrice);
	}

	public double calDrivePrice(double barePrice) {
		drivePrice=barePrice+barePrice/1.17*0.075+500+480+1000;
		return drivePrice;
	}

}
