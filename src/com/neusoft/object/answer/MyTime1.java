package com.neusoft.object.answer;

public class MyTime1 {
	private int hour;
	private int minute;
	private int second;
	public MyTime1(){
	}
	public MyTime1(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void display() {
		int totalSec=hour*3600+minute*60+second;
		int h=totalSec/3600;
		int m=(totalSec%3600)/60;
		int s=(totalSec%3600)%60;
		if(s<0) {
			s=60-Math.abs(s);
			if(m<0) {
				m=59-Math.abs(m);
				if(h<0) {
					h=23-Math.abs(h);
				}
			}else {
				if(h<0) {
					h=24-Math.abs(h);
				}
			}
		}else{
		if(m<0) {
			m=60-Math.abs(m);
			if(h<0) {
				h=23-Math.abs(h);
			}
		}else {
			if(h<0) {
				h=24-Math.abs(h);
			}
		}
		}
		System.out.println("½á¹ûÎª"+h+":"+m+":"+s);
	}
	void add(int hou,int min, int sec) {
		hour+=hou;
		minute+=min;
		second+=sec;
	}
	void sub(int hou,int min,int sec) {
		hour-=hou;
		minute-=min;
		second-=sec;
	}
}
