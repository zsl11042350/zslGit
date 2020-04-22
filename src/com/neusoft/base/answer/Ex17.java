package com.neusoft.base.answer;

public class Ex17 {
/*高度：9
当前行：n
空格数：h<=5		当前行h-n
	    h>5		当前行h-（10-n）		n=6时相当于n=4
星号数：h<=5		2n-1
		h>5		2(10-n)-1*/
		public static void main(String[] args) {
		for(int n=1;n<=9;n++) {
			if(n<=5) {
			for(int m=1;m<=9-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			System.out.println();
			}
			if(n>5) {
				for(int m=1;m<=9-10+n;m++) {
					System.out.print(" ");
				}
				for(int m=1;m<=20-2*n-1;m++) {
					System.out.print("*");
				}
				System.out.println();
				}
			}
		}
		}
	/*public static void main(String[] args) {
		for(int n=1;n<=5;n++) {
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int n=4;n>=1;n--) {
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			for(int m=1;m<=2*n-1;m++) {
				System.out.print("*");
			}
			for(int m=1;m<=5-n;m++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}*/
//}
