package com.neusoft.$temp.fanxing.reflection.gettype2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class CommonDaoImpl implements CommonDao<Customer>{
//this和super,用反射获得接口泛型的具体类型,自动创建实例调用方法
	@Override
	public void test() {
		Type type=this.getClass().getGenericInterfaces()[0];
		System.out.println(type);
		ParameterizedType parameterizedType=(ParameterizedType)type;
		Type type1=parameterizedType.getActualTypeArguments()[0];
		try {
			Class clazz = Class.forName(type1.getTypeName());
			System.out.println(type1.getTypeName());
			clazz.getMethod("test", null).invoke(clazz.newInstance(), null);
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException e) {
			e.printStackTrace();
		}
	}
	
}
