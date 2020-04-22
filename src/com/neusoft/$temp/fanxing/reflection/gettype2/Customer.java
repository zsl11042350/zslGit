package com.neusoft.$temp.fanxing.reflection.gettype2;

public class Customer implements Cloneable{
	private String id;
	private String name;
	private String tel;
	
	public Customer() {
		
	}
	public Customer(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tel=" + tel + "]";
	}
	
	public void test() {
		System.out.println("hahahaha");
	}
	
}
