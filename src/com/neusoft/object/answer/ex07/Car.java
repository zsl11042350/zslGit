package com.neusoft.object.answer.ex07;

public abstract class Car {
	String id;
	String brand;
	String color;
	double barePrice;
	String grade;
	double disp;
	double drivePrice;
	
	public Car(String id, String brand, String color, double barePrice, String grade, double disp, double drivePrice) {
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.barePrice = barePrice;
		this.grade = grade;
		this.disp = disp;
		this.drivePrice = drivePrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", color=" + color + ", barePrice=" + barePrice + ", grade="
				+ grade + ", disp=" + disp + ", dirvePrice=" + drivePrice + "]";
	}
	
	public abstract double calDrivePrice(double barePrice);
	
}
