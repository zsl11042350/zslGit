/**
 * 使用循环打印以下圣诞树：
               *
              ***
             *****
            *******
           *********
          ***********   
 */
package com.neusoft.base.answer;

public class Prac09 {

	public static void main(String[] args) {
		/*解题思路：
		1、双层循环
		2、高度：9
		3、当前行：i
		3、空格数：   h<=5          当前行 h-i          i = 4 
		         h> 5         当前行     h-（10-i）         i = 6 时候  相当于  i = 4
		4、星星数：  h <=5  2i-1        
		        h  >5   2(10-i) -1  --》 20-2*i -1      
		
		*
		*/
		
		/*Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();*/
		//外层循环 从1开始输出 一直输出h行 i是记录当前的行数
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print(" ");
					
				}
				for (int k = 0; k < 2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i > 5) {
				//输出倒三角空格
				for (int j = 0; j < 9 - 10 + i; j++) {
					System.out.print(" ");
					
				}
				//输出倒三角星花
				for (int k = 0; k < 20-2*i -1 ; k++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
		}
		
		
		
		
		
		

	}

}
