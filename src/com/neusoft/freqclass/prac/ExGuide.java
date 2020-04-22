package com.neusoft.freqclass.prac;

/**
 * 练习题思路引导
 * @Author: wwb
 * @Date: 2020/4/17 14:36
 */
public class ExGuide {
    public static void main(String[] args) {
        //Ex02
        Teacher teacher1 = new Teacher("1", "aaa");
        Teacher teacher2 = new Teacher("1", "aaa");
        System.out.println(teacher1.equals(teacher2));

        //Ex03
        System.out.println((int) (Math.random()*200));

        //Ex08
        String IDCARD_REGEX = "(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
    }
}
