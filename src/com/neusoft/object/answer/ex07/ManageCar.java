package com.neusoft.object.answer.ex07;

public class ManageCar {
	Car[] car = new Car[100];
	
	void add(Car c) {
		if(c==null) {
			System.out.println("级别输入有误！");
		}else {
		for(int i=0;i<car.length;i++) {
			if(car[i]==null) {
			car[i]=c;
			System.out.println("增加数据成功！");
			System.out.println(car[i].toString());
			break;
			}
		}
		}
	}
	void delete(String id) {
		boolean flag = false;
		for(int i=0;i<car.length;i++) {
			if(car[i]!=null&&car[i].id.equals(id)) {
				flag = true;
			System.out.println(car[i].toString());
			car[i]=null;
			break;
			}
		}
		if (flag == false) {
			System.out.println("无信息！");
		}
	}
	void update(String id) {
		boolean flag1 = false;// 修改时是否查找到编号的标志
		for (int i = 0; i < car.length; i++) {// 字符串比较相等要用equals()
			if (car[i]!=null&&id.equals(car[i].id)) {
				flag1 = true;
				System.out.println(car[i].toString());
				System.out.println("请重新输入信息：");
				car[i] = Test.inputInfo();//实例方法中调用静态方法
				System.out.println(car[i].toString());
				System.out.println("修改成功！");
				break;
			}
		}
		if (flag1 == false) {
			System.out.println("无信息！");
		}
	}
	void query(String id) {
		boolean flag2=false;
		for(int i=0;i<car.length;i++) {
			if(car[i]!=null&&car[i].id.equals(id)) {
			flag2 = true;
			System.out.println(car[i].toString());
			break;
			}
		}
		if (flag2 == false) {
			System.out.println("无信息！");
		}
	}
	void queryAll() {
		for(int i=0;i<car.length;i++) {
			if(car[i]!=null) {
			System.out.println(car[i].toString());
			}
		}
	}
}
