package com.neusoft.array.answer;

public class Ex02 {

	public static void main(String[] args) {
		//计算非0数的个数作为新数组长度
		int num=0;
		int[] old={3,7,16,0,5,0,0,6,7,0,5};
		for(int i=0;i<old.length;i++) {
			if(old[i]!=0) {
				num+=1;
			}
		}
		//变量有具体值的话，也可以作为数组长度
		int[] young=new int[num];
		//需要一个由0开始不断加1的值表示新数组的下标
		int j=0;
		//将非零数赋给新数组
		for(int i=0;i<old.length;i++) {
				if(old[i]!=0) {
						young[j]=old[i];
						j++;
				}
			}
		System.out.print("去掉0后的新数组是：");
		for(int m=0;m<young.length;m++) {		
		System.out.print(young[m]+" ");
		}
	}

}
