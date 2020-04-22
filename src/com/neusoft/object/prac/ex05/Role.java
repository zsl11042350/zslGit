package com.neusoft.object.prac.ex05;

/**
 * @Author: wwb
 * @Date: 2020/4/16 09:58
 */
public abstract class Role {
    private String name;

    private int age;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Role(){
        name = "xiaoming";
        sex = "ÄÐ";
    }

    public Role(int age){
        this();
        this.age = age;
    }

    public abstract void play();

    public void say(){
        System.out.println("role say...");
    }

    public final void sing(){
        System.out.println("role sing...");
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
