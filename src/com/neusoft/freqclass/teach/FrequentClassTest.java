package com.neusoft.freqclass.teach;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: wwb
 * @Date: 2020/4/16 13:37
 */
public class FrequentClassTest {
    public static void main(String[] args) throws ParseException {
        long l = System.currentTimeMillis();
        //这种方式是放在了常量池中
        String greeting0 = "菜鸟教程" + "1";
        String greeting0_0 = "菜鸟教程1";
        System.out.println(greeting0 == greeting0_0);
        String one = "1";
        String greeting1 = "菜鸟教程" + one;
        System.out.println(greeting0 == greeting1);

        String greeting = "菜鸟教程";
        String greeting2 = new String("菜鸟教程");
        System.out.println(greeting == greeting2);
        System.out.println(greeting.equals(greeting2));

        String str = "d";
        String str1 = "D";
        System.out.println(str.compareToIgnoreCase(str1));

        String str3 = "1,2,3,4";
        String[] split = str3.split(",");
        System.out.println(Arrays.toString(split));

        String pwd = " 123,456789 ";
        String pwd1 = pwd.trim();
//        String substring = pwd.substring(pwd.length() - 3);
        String substring = pwd.substring(pwd.indexOf(",")+1);
        System.out.println(substring);


        String helloString = new String("菜鸟教程1");
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString1 = new String(helloArray);

        System.out.println(greeting.length());
        System.out.println("1、" + greeting + ":www.runoob.com");

        System.out.println(Integer.MAX_VALUE);

        Integer i = new Integer("1");
        //自动装箱
        Integer i1 = 12;
        Integer i2 = Integer.valueOf("123");

        System.out.println(i2.compareTo(119));
        //Integer.valueOf("123").compareTo(119)
        System.out.println(Integer.compare(i, i1));

        Double d1 = i2.doubleValue();
        System.out.println(d1);

//        Integer i3 = null;
//        System.out.println(i3.compareTo(119));

        //字符串转Intger
        Integer i4 = Integer.parseInt("1234");
        System.out.println(Integer.max(i2, i4));
        System.out.println(Integer.min(i2, i4));
        System.out.println(Integer.sum(i2, i4));

        System.out.println("访问\"菜鸟教程!\"");

        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.compare(false, true));

        //装箱
        Integer x = 5;
        //为了使x能进行加运算，所以要对x进行拆箱
        x =  x + 10;
        System.out.println(x);

        double pi = Math.PI;
        double v=-17.53;
        double v1=17.23;
        System.out.println(Math.round(v));//-17，四舍五入，对负数和正数都适用
        System.out.println(Math.round(7.5%0));//0,如果参数为 NaN,那么结果为 0
        System.out.println(Math.round(v1));//17,参数为F返回int的浮点值，参数为d返回long的浮点值,超出范围后返回各自范围中的最值
        System.out.println(Math.rint(v));//-17.0,四舍五入，对负数和正数都适用，返回double类型的整数
        System.out.println(Math.rint(v1));//17.0
        System.out.println(Math.rint(7.5%0));//NaN,如果参数为 NaN、无穷、正 0 或负 0，那么结果与参数相同。
        System.out.println(Math.ceil(v));//-17.0，向上舍入，变成比自己大的数
        System.out.println(Math.ceil(v1));//18.0
        System.out.println(Math.floor(v));//-18.0，向下舍入，变成比自己小的数
        System.out.println(Math.floor(v1));//17.0

        System.out.println((int)(Math.random()*100+1));
        System.out.println(Math.abs(v));

        //Java 会对 -128 ~ 127 的整数进行缓存,在此范围内两个变量使用了同一地址
        Integer in = 12;
        Integer in1 = 12;
        //比较内存地址
        System.out.println(in == in1);
        //Integer重写了equals方法，比较的是值
        System.out.println(in.equals(in1));

        System.out.println("------------------");
        Integer in2 = 129;
        Integer in3 = 129;
        System.out.println(in2 == in3);
        System.out.println(in2.equals(in3));
        System.out.println("------------------");
        //自动装箱操作相当于调用了Integer的ValueOf方法或者new了Intger对象
        Integer in4 = 129;
        Integer in5 = new Integer(129);
        System.out.println(in4 == in5);
        //new对象就是在堆内存中开辟了新空间
        Integer in6 = new Integer(129);
        System.out.println(in5 == in6);

        //Integer和int进行比较，会将Intger转成int进行值的比较
        int in7 = 129;
        System.out.println(in6 == in7);

        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        sBuffer.reverse();
        //索引从0开始，包括开始的不包括结束的
        sBuffer.delete(0, 4);
        sBuffer.insert(0, "aaa");
        System.out.println(sBuffer);

        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowStr = sdf.format(now);
        System.out.println(nowStr);
        String dateStr = "1970-01-01";
        Date date = sdf.parse(dateStr);
        System.out.println(date);

        System.out.println(now.getTime());

        System.out.println(now.after(date));
        System.out.println("耗时："+(System.currentTimeMillis() - l));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONTH) + 1);// 月份要加1

        int today = calendar.get(calendar.DAY_OF_MONTH);// 获得日
        System.out.println(today);
        System.out.println(calendar.get(calendar.WEEK_OF_MONTH));// 当月的第几个星期
        System.out.println(calendar.get(calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(calendar.SECOND));
        Date date1 = calendar.getTime();// 将日历转为日期
        System.out.println(date1);
        // 本月总共多少天
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        // 第一天星期几
        calendar.set(Calendar.DATE, 1);// 把日设置为1
        System.out.println(calendar.get(calendar.DAY_OF_WEEK) - 1);

        Time time = new Time(System.currentTimeMillis());
        System.out.println(time);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }

    public static void strTest(){
        /*** 输出字符串 ***/
        // %s表示输出字符串，也就是将后面的字符串替换模式中的%s
        System.out.printf("%s", new Integer(1212));
        // %n表示换行
        System.out.printf("%s%n", "end line");
        // 还可以支持多个参数
        System.out.printf("%s = %s%n", "Name", "Zhangsan");
        // %S将字符串以大写形式输出
        System.out.printf("%S = %s%n", "Name", "Zhangsan");
        // 支持多个参数时，可以在%s之间插入变量编号，1$表示第一个字符串，3$表示第3个字符串
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "san", "Zhang");

        /** 输出boolean类型 **/
        System.out.printf("true = %b; false = ", true);
        System.out.printf("%b%n", false);

        /** 输出整数类型**/
        Integer iObj = 342;
        // %d表示将整数格式化为10进制整数
        System.out.printf("%d; %d; %d%n", -500, 2343L, iObj);
        // %o表示将整数格式化为8进制整数
        System.out.printf("%o; %o; %o%n", -500, 2343L, iObj);
        // %x表示将整数格式化为16进制整数
        System.out.printf("%x; %x; %x%n", -500, 2343L, iObj);
        // %X表示将整数格式化为16进制整数，并且字母变成大写形式
        System.out.printf("%X; %X; %X%n", -500, 2343L, iObj);

        /** 输出浮点类型**/
        Double dObj = 45.6d;
        // %e表示以科学技术法输出浮点数
        System.out.printf("%e; %e; %e%n", -756.403f, 7464.232641d, dObj);
        // %E表示以科学技术法输出浮点数，并且为大写形式
        System.out.printf("%E; %E; %E%n", -756.403f, 7464.232641d, dObj);
        // %f表示以十进制格式化输出浮点数
        System.out.printf("%f; %f; %f%n", -756.403f, 7464.232641d, dObj);
        // 还可以限制小数点后的位数
        System.out.printf("%.1f; %.3f; %f%n", -756.403f, 7464.232641d, dObj);

        /** 输出日期类型**/
        // %t表示格式化日期时间类型，%T是时间日期的大写形式，在%t之后用特定的字母表示不同的输出格式
        Date date = new Date();
        long dataL = date.getTime();
        // 格式化年月日
        // %t之后用y表示输出日期的年份（2位数的年，如99）
        // %t之后用m表示输出日期的月份，%t之后用d表示输出日期的日号
        System.out.printf("%1$ty-%1$tm-%1$td; %2$ty-%2$tm-%2$td%n", date, dataL);
        // %t之后用Y表示输出日期的年份（4位数的年），
        // %t之后用B表示输出日期的月份的完整名， %t之后用b表示输出日期的月份的简称
        System.out.printf("%1$tY-%1$tB-%1$td; %2$tY-%2$tb-%2$td%n", date, dataL);

        // 以下是常见的日期组合
        // %t之后用D表示以 "%tm/%td/%ty"格式化日期
        System.out.printf("%1$tD%n", date);
        //%t之后用F表示以"%tY-%tm-%td"格式化日期
        System.out.printf("%1$tF%n", date);

        /** 输出时间类型**/
        // 输出时分秒
        // %t之后用H表示输出时间的时（24进制），%t之后用I表示输出时间的时（12进制），
        // %t之后用M表示输出时间的分，%t之后用S表示输出时间的秒
        System.out.printf("%1$tH:%1$tM:%1$tS; %2$tI:%2$tM:%2$tS%n", date, dataL);
        // %t之后用L表示输出时间的秒中的毫秒
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL%n", date);
        // %t之后p表示输出时间的上午或下午信息
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL %1$tp%n", date);

        // 以下是常见的时间组合
        // %t之后用R表示以"%tH:%tM"格式化时间
        System.out.printf("%1$tR%n", date);
        // %t之后用T表示以"%tH:%tM:%tS"格式化时间
        System.out.printf("%1$tT%n", date);
        // %t之后用r表示以"%tI:%tM:%tS %Tp"格式化时间
        System.out.printf("%1$tr%n", date);

        /** 输出星期**/
        // %t之后用A表示得到星期几的全称
        System.out.printf("%1$tF %1$tA%n", date);
        // %t之后用a表示得到星期几的简称
        System.out.printf("%1$tF %1$ta%n", date);

        // 输出时间日期的完整信息
        System.out.printf("%1$tc%n", date);
    }
}
