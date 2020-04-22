package com.neusoft.freqclass.teach;

import java.util.regex.Pattern;

public class BigDecimalTest {
	private static final int DEF_DIV_SCALE = 3;
	public int addition(int a,int b) {
		return a+b;
	}
	public long addition(long a,long b) {
		return a+b;
	}
	public float addition(float a,float b) {
		return a+b;
	}
	public double addition(double a,double b) {
		return a+b;
	}
	public String addition(String a,String b) {
		String regex = "^[0-9]+$";
		/*if(!Pattern.matches(regex, a)){
			return "非法输入！";
		}
		if(!Pattern.matches(regex, b)){
			return "非法输入！";
		}*/
		if(a.matches(regex)){
			return "非法输入！";
		}
		if(b.matches(regex)){
			return "非法输入！";
		}
		Integer i1 = Integer.parseInt(a);
		Integer i2 = Integer.parseInt(b);
		Integer i3 = i1 + i2;
		return i3.toString();
	}
	public static void main(String[] args) {
		BigDecimalTest add = new BigDecimalTest();
		int a = add.addition(1, 5);
		System.out.println(a);
		long b = add.addition(2L, 5L);
		System.out.println(b);
		float c=add.addition(0.3F, 0.2F);
		System.out.println(c);
		double d1=0.4;
		double d2=0.2;
		double f1=add.addition(d1, d2);
		System.out.println("+:"+f1);
		/*使用BigDecimal要用String来够造，要做一个加法运算，
		 * 需要先将两个浮点数转为String，然后够造成BigDecimal，
		 * 在其中一个上调用add方法，传入另一个作为参数，
		 * 然后把运算的结果（BigDecimalTest）再转换为浮点数。*/
		java.math.BigDecimal b_d1 = new java.math.BigDecimal(Double.toString(d1));
		java.math.BigDecimal b_d2 = new java.math.BigDecimal(Double.toString(d2));
		double dd1=b_d1.add(b_d2).doubleValue();
		System.out.println("+:"+dd1);
		//BigDecimal加强训练
		double f2=0.002-0.11345;
		System.out.println("-:"+f2);
		double dd2=sub(0.002,0.11345);
		System.out.println("-:"+dd2);
		
		double f3=0.002*0.11345;
		System.out.println("*:"+f3);
		double dd3=mul(0.002,0.11345);
		System.out.println("*:"+dd3);
		
		
		double f4=10.0/3.0;
		System.out.println("/:"+f4);
		
		java.math.BigDecimal a11 = new java.math.BigDecimal(Double.toString(10));
	    java.math.BigDecimal b11 = new java.math.BigDecimal(Double.toString(3));
	  //除法
		/*提供（相对）精确的除法运算，当发生除不尽的情况时，精确到  
		小数点以后scale位(第二个参数，必须大于等于0），以后的数字四舍五入。*/  
	    /*第三个参数舍入模式选择
		 * ROUND_HALF_UP:四舍五入，遇到0.5时往上近似，否则与ROUND_HALF_DOWN等同
		 * ROUND_UP：进位处理
		 * ROUND_DOWN直接删除多余的小数位
		 * ROUND_CEILING如果为正则进位，如果为负则退位，即只增加计算的值
		 * ROUND_FLOOR如果为正则退位，如果为负则进位，即只减少计算的值
		 * ROUND_HALF_DOWN四舍五入，遇到0.5时往下近似
		 * */
	  //如果把第一个参数（除数）赋值为1，则可等价于对一个数四舍五入计算  
	    double dd4=a11.divide(b11,DEF_DIV_SCALE, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("/:"+dd4);
		
		String e=add.addition("4", "2a");
		System.out.println(e);
	}
	//减法
	public static double sub(double v1,double v2){   
		java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
		java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();   
		}   
	
	//乘法
	public static double mul(double v1,double v2){   
		java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
		java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();   
		}   
}
