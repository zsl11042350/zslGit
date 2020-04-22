package com.neusoft.base.answer;

public class Test {

	public static void main(String[] args) {
		// 小数参与算术运算
		System.out.println(4.0f - 2.1f);
		System.out.println(4.0f + 2.1f);
		System.out.println(4.0 - 2.1f);
		System.out.println(4.0 + 2.1f);
		System.out.println(4.0f - 2.1);
		System.out.println(4.0f + 2.1);
		System.out.println(4.0 - 2.1);
		System.out.println(4.0 + 2.1);
		System.out.println(7.5 % 0);
		System.out.println(-7 % 3.4);
		System.out.println(-7.0 % 3);

		// 九九乘法表一反一正
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.print("\n");
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.print("\n");
		}
	}
}