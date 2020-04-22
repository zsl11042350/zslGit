package com.neusoft.$temp.base.innerclass;

public class InnerClassTest {
	public static void main(String[] args){
		//成员内部类
		/*InnerClassTest innerClassTest=new InnerClassTest();//先创建大类对象
		InnerClassTest.Small small=innerClassTest.new Small();//再通过大类对象去创建小类，小类的类名要依附在大类之后*/		
		Small small=new InnerClassTest().new Small();//或new完大类new小类，类名为(大类.小类)
		small.samll();//小类对象调用小类方法
	}
	public class Small{
		public void samll() {
			System.out.println("I`m small");
		}
	}
}
