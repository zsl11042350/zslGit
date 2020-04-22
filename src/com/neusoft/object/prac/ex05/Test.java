package com.neusoft.object.prac.ex05;

/**
 * @Author: wwb
 * @Date: 2020/4/16 10:19
 */
public class Test {
    public static void main(String[] args) {
        Employee.company = "xiaomi";
        Employee employee1 = new Employee(1);
//        employee1.setCompany("xiaomi1");
//        System.out.println("salary:"+employee1.getSalary());
        System.out.println(employee1);
        Employee employee2 = new Employee(18, "huawei", "1000", 2);
        System.out.println(employee2);
        employee1.play();
        employee2.sing();
    }
}
