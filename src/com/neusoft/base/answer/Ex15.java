package com.neusoft.base.answer;

public class Ex15 {

	public static void main(String[] args) {
		/*double hight=100;
		double dstc=100;
		int i;
		for(i=1;i<=9;i++) {
			hight=hight/2;
			dstc=hight*2+dstc;
		}
		System.out.println("第"+i+"次落地反弹"+hight/2+"米");
		System.out.println("第"+i+"次落地时共经过"+dstc+"米");*/
		
		//先计算距离（推荐）
		double hight=100;
		double dstc=0;
		for(int i=1;i<=10;i++) {
			if(i==1) {
				dstc=100;
			}else {
				dstc=hight*2+dstc;
			}
			hight=hight/2;
			System.out.println("第"+i+"次落地反弹"+hight+"米");
			System.out.println("第"+i+"次落地时共经过"+dstc+"米");
		}
		//先计算高度
/*		double hight=100;
		double dstc=0;
		for(int i=1;i<=10;i++) {
			hight=hight/2;
			if(i==1) {
				dstc=100;
			}else {
				dstc=hight*4+dstc;
			}		
			System.out.println("第"+i+"次落地反弹"+hight+"米");
			System.out.println("第"+i+"次落地时共经过"+dstc+"米");
		}*/
	}

}
