package com.neusoft.array.answer;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Fibonacci数列的前20项为：");
		int[] num=new int[20];
		/*num[0]=num[1]=1;
		for(int i=0;i<num.length;i++) {
			if(i<num.length-2) {
			num[i+2]=num[i]+num[i+1];
			}
			System.out.print(num[i]+" ");
		}*/
		for(int i=0;i<num.length;i++) {
			if(i==0||i==1) {
				num[i]=1;
			}else{
			num[i]=num[i-1]+num[i-2];
			}
			System.out.print(num[i]+" ");
		}
		
		
		int[] a=new int[]{1,2,3,4,5};
	}

}
