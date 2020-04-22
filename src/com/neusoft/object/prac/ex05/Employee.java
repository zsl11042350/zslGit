package com.neusoft.object.prac.ex05;

/**
 * @Author: wwb
 * @Date: 2020/4/16 10:04
 */
public class Employee extends Role {

    private final int id;

    static String company;

    private String salary;

    @Override
    public void play() {
        say();
        System.out.println("employee play...");
    }

    public int getId() {
        return id;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee(int id){
        super();
        company="meizu";
        this.id = id;
    }
    public Employee(int age, String company,String salary,int id){
        super(age);
        Employee.company = company;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary='" + salary + '\'' +
                ",name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex='" + super.getSex() + '\'' +
                ", company='" + company +
                '}';
    }
}
