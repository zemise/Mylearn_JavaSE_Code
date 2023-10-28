package zemise_01;

import java.time.LocalDateTime;
/*
    没有构造方法，常用下面两个静态方法获取时间
        public static LocalDateTime now()
            从默认时区中的系统时钟获取当前日期

        public static LocalDateTime of(int year,int month,int dayOfMonth, int hour, int minute, int second)
            从年、月、日、小时、分钟和秒获取LocalDateTime的实例，将纳秒设置为零
*/

public class LocalDateTimeDemo01 {
    public static void main(String[] args) {
        //public static LocalDateTime now()
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //2023-01-12T21:31:36.582244
        /*
            T 表示时间开始，精确到纳秒
            1秒 = 1000毫秒
            1毫秒 = 1000微秒
            1微秒 = 1000纳秒
         */

        //public static LocalDateTime of(int year,int month,int dayOfMonth, int hour, int minute, int second)
        LocalDateTime of = LocalDateTime.of(2023, 1, 12, 9, 34, 55);
        System.out.println(of);
        //2023-01-12T09:34:55




    }
}
