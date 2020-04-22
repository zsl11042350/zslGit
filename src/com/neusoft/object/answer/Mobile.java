package com.neusoft.object.answer;

public class Mobile {
	String brand;
	int price;
	int year;
	public Mobile(String brand, int price, int year) {
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	@Override
	public String toString() {
		return "com.neusoft.java._200414object.Mobile [brand=" + brand + ", price=" + price + ", year=" + year + "]";
	}
	void gradeFail(String brand,int price,int year) {
		System.out.println("升级失败了的情况：");
		brand="小米8";
		price=3000;
		year=2018;
	}
	
	void grade(Mobile m) {
		System.out.println("升级成功了的情况：");
		m.brand="小米8";
		m.price=3000;
		m.year=2018;
	}
}
