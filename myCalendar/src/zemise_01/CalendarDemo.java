package zemise_01;

import java.util.Calendar;

/*
    Calendar为某一时刻和一组日历字段之间转换提供了一些方法，并未操作日历字段提供了一些方法

    Calendar提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和时间初始化；
        Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();//多态的形式
//        System.out.println(c);
        //public int get(int field)
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");


        //public abstract void add(int field,int amount);根据日历的规则，将指定的时间量添加或减去给定的日历字段
       //需求1： 3年前的今天
//        c.add(Calendar.YEAR,-3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //需求2： 10年后的5天前
//        c.add(Calendar.YEAR,10);
//        c.add(Calendar.DATE,-5);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        //public final void set(int year,int month,int date);设置当前日历的年月日
        c.set(2049,11,11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
