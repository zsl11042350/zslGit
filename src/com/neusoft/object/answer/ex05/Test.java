package com.neusoft.object.answer.ex05;

public class Test {

	public static void main(String[] args) {
		Employee.setCompany("huawei");
		Employee e1 = new Employee(2);
		//Employee.setCompany("huawei");//set的时机很关键，在此处set公司则显示huawei
		System.out.println("for e1----name:"+e1.getName()+",age:"+e1.getAge()+",sex:"+e1.getSex()+
				",id:"+e1.getId()+",company:"+Employee.getCompany()+",salary:"+e1.getSalary());
		Employee e2 = new Employee("lisi", 20, "nan", 8000, 3, "xiaomi");//有参构造方法中已调用无参构造方法，则再传无参构造方法中有的值不会起作用
		System.out.println("for e2----name:"+e2.getName()+",age:"+e2.getAge()+",sex:"+e2.getSex()+
				",id:"+e2.getId()+",company:"+Employee.getCompany()+",salary:"+e2.getSalary());
		e1.play();
		e1.sing();
	}

}
