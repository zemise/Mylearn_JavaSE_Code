package zemise_02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d= new Date();

        String s1 = DateUtils.dateToString(d, "YY-MM-dd HH:mm:ss");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(d, "YY年MM月dd日");
        System.out.println(s2);
        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);

        System.out.println("===================");

        String s = "2034-09-02";
        Date dd = DateUtils.stringToDate(s,"YYYY-MM-dd");
        System.out.println(dd);


    }
}
