package com.neusoft.freqclass.prac;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: wwb
 */
public class ExCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //将Calendar设置为今天
        calendar.setTime(new Date());
        // 获得今天的日期数
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

        // 把日设置为1
        calendar.set(Calendar.DATE, 1);
        //获取每月1号的星期数==》决定空几格
        //星期天-1 星期一-2 ... 星期六-7 故减一
        int a = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        while (a-- > 0) {
            System.out.print("\t");
        }

        int b = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        for (int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
            if (i == today)
                System.out.print("@" + i + "\t");
            else
                System.out.print(i + "\t");
            // 加上空掉的数等于7时换行，另：if((i-(8-calendar.get(calendar.DAY_OF_WEEK)))%7==0)
            if ((i + b) % 7 == 0) {
                System.out.print("\n");
            }
        }

        /*//方式2,把空出来的那几日也放在循环里
		for(int i=1;i<=(calendar.get(calendar.DAY_OF_WEEK)-1)+calendar.getActualMaximum(Calendar.DATE);i++) {
		if(i<=calendar.get(calendar.DAY_OF_WEEK)-1) {
		System.out.print("\t");
		continue;
		}
		System.out.print(i-(calendar.get(calendar.DAY_OF_WEEK)-1)+"\t");
		if(i%7==0) {
		System.out.print("\n");
		}
		}*/
    }
}
