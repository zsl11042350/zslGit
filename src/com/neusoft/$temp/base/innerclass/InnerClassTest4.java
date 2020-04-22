package com.neusoft.$temp.base.innerclass;

public class InnerClassTest4 {
	//匿名内部类，通过继承，可尽情重写或使用父类方法，而不用新建类，看不见类名和泛型，只看见创建出的父类的类名泛型和花括号，故匿名类
	public static void main(String[] args) {
		//1.子类重写了继承于父类的test方法，new User() {重写的方法...}的形式就相当于是1个子类
		new User() {
		@Override
		public void test() {
			System.out.println("you are test...");
		}
		}.test();
		
		//2.同1，把子类向上转型成了User，对象名为user1，user1是子类而不是父类的实例对象
		User user1=new User() {
			@Override
			public void test() {
				System.out.println("you are test...");
			}
		};
		user1.test();
		
		
		//3.子类调用了继承于父类的test方法，new User() {}的形式就相当于是1个子类
		new User() {}.test();
		
		//4.同3，把子类向上转型成了User，对象名为user
		User user=new User() {};
		user.test();
	}

}

class User{
	public void test() {
		System.out.println("I`m test...");
	}
}