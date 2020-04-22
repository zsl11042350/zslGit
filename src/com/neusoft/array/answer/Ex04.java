package com.neusoft.array.answer;

import java.util.Scanner;

public class Ex04 {
	//冒泡排序：从第一个元素开始，依次比较相邻的两个元素，如果第一个比第二个大，
	//就交换它们两个，把最大数排到最后；第二趟再从第一个元素依次比较，找出次大数
	//最后剩下的一个元素不用再比较，故总趟数为数组长度arr.length-1；
	//比较的次数 第一趟时为数组长度-1-0, 第二趟因排好了最后一个元素比较次数又比第一次少1
	//次数规律j<arr.length-1-i（趟数），即每走完一趟就排好一个数就少比较一次
	//此程序修改为由大到小排序
	public static void main(String[] args) {
		System.out.println("您想输入的数组元素个数为：");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("请依次输入数组元素：");
		for(int i=0;i<=num-1;i++) {
			arr[i]=sc.nextInt();
		}
		//最后一个数不用比，不用加=
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				//想用正序由小到大输出就改为arr[j]>arr[j+1]
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}
