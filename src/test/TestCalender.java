package test;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalender {


    public static void main(String[] args) {
        //获得日期相关元素
        Calendar calender=new GregorianCalendar(2999,10,9,22,10,50);
        int year=calender.get(Calendar.YEAR);
        int month=calender.get(calender.MONTH);
        int weekDay=calender.get(calender.DAY_OF_WEEK);//1是星期日,2是星期一,,,7是周六

        System.out.println(calender);
        System.out.println(year);
        System.out.println(month);//10是11月
        System.out.println(weekDay);

        //设置日期相关元素
        Calendar c2=new GregorianCalendar();
        c2.set(Calendar.YEAR,8012);
        System.out.println(c2.get(c2.YEAR));

        //日期的计算
        Calendar c3= new GregorianCalendar();
        c3.add(Calendar.DATE,100);
        System.out.println(c3.get(c3.DATE));

        //日期对象和时间对象的转化
        Date d4=c3.getTime();
        Calendar c4=new GregorianCalendar();
        c4.setTime(new Date());
        printCalender(c4);


    }
    public static void printCalender(Calendar c){
        //打印
        int year=c.get(Calendar.YEAR);
        int month=c.get((Calendar.MONTH))+1;  //0到11
        int date=c.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek=c.get(Calendar.DAY_OF_WEEK)-1;//日(1)到6
        String dayOfWeek2= dayOfWeek==0?"日":dayOfWeek+"";

        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒"+"周"+dayOfWeek2);

    }
}
