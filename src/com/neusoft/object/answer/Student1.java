package com.neusoft.object.answer;

public class Student1 {
	int sNO;
	String sName;
	String sSex;
	int sAge;
	int sJava;
	public Student1(int sNO, String sName, String sSex, int sAge, int sJava) {
		super();
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	int getNo() {
		return sNO;
	}
	String getName(){
		return sName;
	}
	String getSex(){
		return sSex;
	}
	int getAge(){
		return sAge;
	}
	int getJava(){
		return sJava;
	}
	@Override
	public String toString() {
		return "com.neusoft.java._200414object.Student1 [sNO=" + sNO + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
				+ "]";
	}
	
}
