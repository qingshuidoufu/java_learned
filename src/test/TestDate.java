package test;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        Date d2=new Date();
        System.out.println(d2.getTime());
        System.out.println(d2.after(d));
        //以后用到日期,使用calender处理
        Date d3=new Date(2020-1900,3,10);//2020,4,10
        System.out.println(d3);
    }
}
