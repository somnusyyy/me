package Date.calendar;

import com.sun.javaws.IconUtil;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//通过多态获取对象
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;//初始值从1开始
        int date = c.get(Calendar.DATE);
        System.out.println(year+" "+month+" "+date);

        c.add(Calendar.YEAR,3);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH)+1;//初始值从1开始
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1+" "+month1+" "+date1);

        c.set(2019,11,9);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);
        int date2 = c.get(Calendar.DATE);
        System.out.println(year2+" "+month2+" "+date2);

    }
}
