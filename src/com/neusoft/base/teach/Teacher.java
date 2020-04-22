package com.neusoft.base.teach;

/**
 * @Author: wwb
 * @Date: 2020/4/16 08:53
 */
//public class Teacher implements Comparable<Teacher>{
public class Teacher {
    public static String id = "1";

    public String name;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Teacher.id = id;
    }

    public String getName() {
        id = "2";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startWork(int time){
        System.out.println(this.name + "在" +time + "上班了");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

   /* @Override
    public int compareTo(Teacher o) {
        String oId = o.getName();
        return name.compareTo(oId);
    }*/
}
