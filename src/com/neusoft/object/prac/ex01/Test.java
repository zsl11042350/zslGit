package com.neusoft.object.prac.ex01;

/**
 * @Author: wwb
 * @Date: 2020/4/16 09:01
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new MusicTeacher();
        teacher.setName("xiaoming");
        handle(teacher);
        teacher = new SoftwareTeacher();
        teacher.setName("xiaohua");
        handle(teacher);
        //编译不通过 编译看左边 运行看右边
//        teacher.show();
        SoftwareTeacher softwareTeacher = new SoftwareTeacher();
        softwareTeacher.show();
        //向下转型
        ((SoftwareTeacher) teacher).show();
    }

    public static void handle(Teacher teacher){
        teacher.teachProcedure();
        teacher.startWork(2);
    }

}
