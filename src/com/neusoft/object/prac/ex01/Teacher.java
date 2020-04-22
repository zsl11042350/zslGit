package com.neusoft.object.prac.ex01;

/**
 * @Author: wwb
 * @Date: 2020/4/16 08:53
 */
public abstract class Teacher {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startWork(int time){
        System.out.println(this.name + "在" +time + "上班了");
    }

    public abstract void teachProcedure();

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
