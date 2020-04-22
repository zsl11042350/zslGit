package com.neusoft.$temp.base.innerclass;

public class InnerClassTest3 {
	//局部内部类(方法内部类)
	public static void main(String[] args) {
		InnerClassTest3 innerClassTest3=new InnerClassTest3();//普通的创建对象和方法调用
		innerClassTest3.test();
	}
	
	public void test() {
		class Small{//局部内部类里不能加public
			public void samll() {
				System.out.println("I`m small...");
			}
		}
		Small small=new Small();//只能在方法里面用，在方法里定义完类后进行实例化和调用
		small.samll();
	}
			
}
