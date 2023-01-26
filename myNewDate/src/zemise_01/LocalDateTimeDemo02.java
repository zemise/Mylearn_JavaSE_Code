package zemise_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    格式化：使用指定的格式化程序格式化此日期时间
        String format(DateTimeFormatter formatter)
    解析：使用特定的程序从文本字符串中获取LocalDateTime的实例
        static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)
    DateTimeFormatter:  没有看到构造方法，用下面的静态方法获取日期格式化对象
        public static DateTimeFormatter of Pattern(String pattern)，使用特定的模式格式化程序
 */
public class LocalDateTimeDemo02 {
    public static void main(String[] args) {
        //String format(DateTimeFormatter formatter)
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);

        System.out.println("==============");
        String format1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd ===HH.mm.ss"));
        String format2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(format1);
        System.out.println(format2);

        System.out.println("==============");
        //static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)
//        String s = "2023-11-16 20:44:55";
        String s = "2023/11/16 20:44:55";
        LocalDateTime parse = LocalDateTime.parse(s, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(parse);//2023-11-16T20:44:55




    }
}
