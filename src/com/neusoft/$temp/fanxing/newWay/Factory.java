package com.neusoft.$temp.fanxing.newWay;

//public class Factory<T extends MyService<T>&MyService2<T>> {
public class Factory<T extends Qishui> {//类泛型,使创建出的类的实例能够凭类型进行筛选，不确定类型但又想筛选
	//类泛型可以去继承不能实现类
	//T t;//可以直接声明泛型
	//T t1=new T();//错误，不能直接new泛型，可用下面方式实现
	//T t1=(T) new Object();
	//T t2=(T)Integer.valueOf((int)t/2);
	//T t2=new T[100];//错误，不能创建泛型的数组，可用下面方式实现
	//T[] t2=(T[])new Object[100];//同上例
	/*static {//静态代码块中不能用泛型
		T t;
	}*/
	private T attr;
	//异常类及其子类中也不能用泛型
	Qishui[] qishuis=new Qishui[100];
	int i=0;
	
	public void produce(T qishui) {
		qishuis[i++]=qishui;//增加数组元素，设置标志的简单方式
	}
	//注意格式
	public <M extends ZeroKele> void jiamtc (M kele){//方法泛型，可通过泛型指定某一类型的数据，确定存放的类型
		//加上extends限制只能是某一类的子类
		System.out.println("加木糖醇");
	}
	
	/*@Override
	public String toString() {//只需对具体的对象对应的类调用toString方法即可
		return "Factory [qishuis=" + Arrays.toString(qishuis) + ", i=" + i + "]";
	}*/
	
}
