package com.neusoft.$temp.fanxing.reflection.gettype;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class CommonDaoImpl<T> implements CommonDao<T>{
//this和super,用反射获得父类泛型的具体类型,自动创建实例调用方法
	@Override
	public void test() {
		System.out.println(this.getClass().getName());//this指的是子类对象，因为调用test方法，子类中没有，则子类直接拿父类的test方法当作自己的来用，谁调用this指谁
		System.out.println(super.getClass().getName());//super与this指向的对象是同一个！即使二者的hash码也是一样。只不过能通过super去调用父类被隐藏的东西
		//获取父类的类型（包括泛型），子类的泛型已经映射到父类中
		Type type=this.getClass().getGenericSuperclass();//虽然写在了父类的方法里，但调用者是子类，故this是CustomerDaoImpl，而getGenericSuperclass则将CommonDaoImpl连同泛型都调了出来
		System.out.println(this.getClass().getGenericSuperclass());
		//ParameterizedType有强大的获取泛型的类型参数的方法
		ParameterizedType parameterizedType=(ParameterizedType)type;
		//通过getActualTypeArguments方法获取泛型里的实际类型，返回Type数组
		Type[] parentTypes=parameterizedType.getActualTypeArguments();
		//继承所得，第一个元素即是所需要的
		Type jutiType=parentTypes[0];
		System.out.println(jutiType);
		try {
			//getTypeName方法得到从包到类的名字
			Class clazz = Class.forName(jutiType.getTypeName());
			System.out.println(jutiType.getTypeName());
			clazz.getMethod("test", null).invoke(clazz.newInstance(), null);//.newInstance()必须有无参构造才能使用
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException e) {
			e.printStackTrace();
		}
	}
	
}
