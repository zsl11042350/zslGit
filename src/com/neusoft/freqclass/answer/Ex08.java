package com.neusoft.freqclass.answer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	static int[] numSplit1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------购买彩票---------");
		while(true) {
		System.out.println("请输入身份证号：");
		String id=sc.nextLine();
		String idTest= "^[0-9]{17}[0-9|X]$";
		if(!id.matches(idTest)) {
				System.out.println("输入有误！");
		}else {
			break;
			}
		}
		while(true) {
			System.out.println("购买号码（输入1-35的7个数字以逗号间隔）：");
			String num=sc.nextLine();
			String numTest="^([1-9],|[1-9][0-9],){6}([1-9]|[1-9][0-9])$";
			if(!num.matches(numTest)) {				
					System.out.println("输入有误！");
			}else {
				String[] numSplit=num.split(",", 7);
				numSplit1=new int[7];
				boolean flag=true;
				for(int i=0;i<numSplit.length;i++) {
					numSplit1[i]=Integer.parseInt(numSplit[i]);
					if(numSplit1[i]>35||numSplit1[i]<1) {
						flag=false;
						System.out.println("输入数字必须属于1-35");
						break;
					}
				}
				if(flag) {
				break;
				}
			}
		}
		System.out.println("--------彩票开奖---------");
		int[] endNum=new int[7];
		System.out.println(Arrays.toString(endNum));
		Random rd=new Random();
		int time=0;
		for(int i=0;i<endNum.length;i++) {	
				endNum[i]=rd.nextInt(35)+1;
				for(int j=0;j<i;j++) {
					if(endNum[j]!=endNum[i]) {					
						continue;
					}else {
						endNum[i]=rd.nextInt(35)+1;
					}
				}
		}
		System.out.println(Arrays.toString(endNum));
		System.out.println("--------兑奖信息---------");
		//判断两个数组相等元素的个数
			for(int i=0;i<numSplit1.length;i++) {
				for(int j=0;j<endNum.length;j++) {
					if(numSplit1[i]==endNum[j]) {
						time++;
					}
				}
			}
		System.out.println("中奖数字个数："+time);
		System.out.println("中奖金额："+2.5*time);
	}
}
