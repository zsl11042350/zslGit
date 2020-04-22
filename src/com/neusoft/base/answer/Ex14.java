package com.neusoft.base.answer;

public class Ex14 {

	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int m = 1; m <= (i+1)/2; m++) {
				if (i % m == 0) {
					sum += m;
				}
			}
			if (i == sum) {
				System.out.println(i+"ÎªÍêÊý");
			}
		}
	}
}
