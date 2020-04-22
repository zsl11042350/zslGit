/**
 * 3.一个数如果恰好等于它的因子之和，这个数就称为“完数”。例如6=1+2+3. 找出1000以内的所有完数。
 *    1）求出这个数的所有的因子，然后求和
 *    2）判断这个“和”是否和当前 循环值相等   ----》相等则为完数
 * 
 */
package com.neusoft.base.answer;

public class Prac203 {

	public static void main(String[] args) {
		//循环2到1000所有的数   i 代表被判断是否是完数的数。
		for(int i = 2; i <= 1000; i++) {
			//寻找 当前值的所有因子 并求和   j 代表的是判断是否是 i的因子的数
			int sum = 0;
			for(int j = 1; j < i; j++ ) {
				if(i % j == 0) {
					sum += j;
				}
			}
			//判断i 是否等于 因子之和sum
			if(i == sum) {
				System.out.println("完数有" + i);
			}
			
		}
		
	}

}
