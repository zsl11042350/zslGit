package com.neusoft.base.answer;

public class Ex10 {

	public static void main(String[] args) {
		int i1 =10%-3;
		System.out.println("i1:"+i1);
		for(int i=0;i<=20;i++) {
			for(int j=0;j<=33;j++) {
				if(5*i+3*j+(100-i-j)/3==100) {
					//(100-i-j)/3不能只取整数部分，
					//即钱数不能为小数，所以小鸡的个数只能是3的倍数
					if((100-i-j)%3==0) {
				System.out.println("公鸡："+i+" 母鸡："+j+" 小鸡："+(100-i-j));
				}
			}
		}
	}
	}
}
