package com.neusoft.$temp.base.innerclass;

public class InnerClassTest2 {
	//静态内部类
	public static void main(String[] args) {
		//Small small=new Small();//小类被声明为静态类可以直接用类名进行调用
		Small small=new Small();//或对（大类.小类）进行实例化
		/*InnerClassTest2 innerClassTest2=new InnerClassTest2();//但成员内部类的创建方法不适用
		InnerClassTest2.Small small=innerClassTest2.new Small();*/
		small.samll();
	}
	
	public static class Small{
		public void samll() {
			System.out.println("I`m smaller");
		}
	}
}
