package com.neusoft.object.answer;

import java.util.Scanner;

public class TestNetUser {
	static String a;
	static String b;
	static String c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("input userID:");
		a=sc.nextLine();
		if(a.equals("")) {
			System.out.println("userID is a must!");
		}else {
			break;
		}
		}
		while(true) {
			System.out.print("input password:");
			b=sc.nextLine();
			if(b.equals("")) {
				System.out.println("password is a must!");
			}else {
				break;
			}
			}
		System.out.print("input e_mail:");
		c=sc.nextLine();
		if(c.equals("")) {
			c=a+"@gameschool.com";
		}
		NetUser nu = new NetUser(a, b, c);
		System.out.println(nu.toString());
	}

}
