/**
 * 4.一个球从100米高度落下，每次落地后反跳回原高度的一半，再落下，求它在第10次落地时共经过多少米？第10次反弹多高？
 * 
 * 100   
 *      50   
 *          25
 *               12
 *                    6
 *100                      
 *      h = 前一次h/2              
 *      100  + h*2
 * 
 */
package com.neusoft.base.answer;

public class Prac204 {

	public static void main(String[] args) {
		double hight = 100; //记录当前高度
		double totalHight = 0; //记录总的路程
		//每次循环 高度减半。
		/*for (int i = 1; i <= 10; i++) {
			hight = hight/2;
			System.out.println("第" + i + "反弹的高度是" + hight);
			if(i == 1) {
				totalHight = 100;
			}else {
				totalHight +=  hight * 4 ;
			}
			
			System.out.println("第" + i + "落地所经过的距离是" + totalHight);
			//定义变量  ：驼峰  定义类    //首字母大写  之后驼峰 
			
		}*/
		for (int i = 1; i <= 10; i++) {
			//hight = hight/2;
			if(i == 1) {
				totalHight = 100;
			}else {
				totalHight +=  hight * 2 ;
			}
			hight = hight/2;
			
			System.out.println("第" + i + "反弹的高度是" + hight);
			
			System.out.println("第" + i + "落地所经过的距离是" + totalHight);
			//定义变量  ：驼峰  定义类    //首字母大写  之后驼峰 
			
		}
		
	}

	
	
	
	
	
	
	
	
	
}
