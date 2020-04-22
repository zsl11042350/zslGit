package com.neusoft.base.answer;

import java.util.Scanner;

public class ExAdd {

	public static void main(String[] args) {
		int m = 0;
		while (m < 1) {
			System.out.println("====请选择要购买的商品=====");
			System.out.println("====1.T恤	=====");
			System.out.println("====2.手机	=====");
			System.out.println("====3.电脑	=====");
			Scanner sc = new Scanner(System.in);
			int get = sc.nextInt();
			if (get == 1) {
				System.out.println("====请选择品牌	  =====");
				System.out.println("====1.阿迪	=====");
				System.out.println("====2.耐克	=====");
				System.out.println("====3.李宁	=====");
				int t_pinpai = sc.nextInt();
				if (t_pinpai == 1) {
					long adi_price = Math.round(300 * 0.95);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的阿迪牌T恤价格为：" + adi_price + "元=====");
				} else if (t_pinpai == 2) {
					long adi_price = Math.round(250 * 0.85);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的耐克牌T恤价格为：" + adi_price + "元=====");
				} else {
					long adi_price = Math.round(125 * 0.72);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的李宁牌T恤价格为：" + adi_price + "元=====");
				}
			} else if (get == 2) {
				System.out.println("====请选择品牌	  =====");
				System.out.println("====1.苹果	=====");
				System.out.println("====2.小米	=====");
				System.out.println("====3.华为	=====");
				int p_pinpai = sc.nextInt();
				if (p_pinpai == 1) {
					long price1 = Math.round(6100 * 0.87);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的苹果牌手机价格为：" + price1 + "元=====");
				} else if (p_pinpai == 2) {
					long price1 = Math.round(899 * 0.92);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的小米牌手机价格为：" + price1 + "元=====");
				} else if (p_pinpai == 3) {
					long price1 = Math.round(1999 * 0.92);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的华为牌手机价格为：" + price1 + "元=====");
				}
			} else {
				System.out.println("====请选择品牌	  =====");
				System.out.println("====1.惠普	=====");
				System.out.println("====2.联想	=====");
				System.out.println("====3.华硕	=====");
				int c_pinpai = sc.nextInt();
				if (c_pinpai == 1) {
					long price1 = Math.round(8900 * 0.95);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的惠普牌电脑价格为：" + price1 + "元=====");
				} else if (c_pinpai == 2) {
					long price1 = Math.round(4998 * 0.9);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的联想牌电脑价格为：" + price1 + "元=====");
				} else if (c_pinpai == 3) {
					long price1 = Math.round(4998 * 0.8);
					System.out.println("====请确认价格	=====");
					System.out.println("====您购买的华硕牌电脑价格为：" + price1 + "元=====");
				}
			}
			System.out.println("====1.购买	=====");
			System.out.println("====0.取消	=====");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("=====恭喜您购买成功！====");
				System.out.println("拜拜！");
				m = 1;
			} else {
				m = 0;
			}
		}
	}
}
