package com.neusoft.freqclass.answer;

public class Ex05 {

	public static void main(String[] args) {
		StringBuffer bf=new StringBuffer();
		bf.append("hello");
		bf.insert(1, "¡­¡­h");
		bf.replace(1, 2, "..");
		System.out.println(bf);
	}

}
