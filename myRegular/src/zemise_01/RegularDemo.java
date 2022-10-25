package zemise_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
    需求：
        删除字符串中所有 &加上任意1个单字母或单数字
 */
public class RegularDemo {
    public static void main(String[] args) {
        RegularDemo.test("&5[管理&b&l组]&rzemiese_&j[组长]&r");
    }
    public static void test(String s){
        //需要替换的字符串
        String tatget = s;
        //正则表达式
        String regEx = "&[a-zA-Z0-9]";
        //替换之后的新字符
        String replace = "";
        Pattern compile = Pattern.compile(regEx);
        Matcher matcher = compile.matcher(tatget);
        //结果
        String str = matcher.replaceAll(replace).trim();
        System.out.println("替换后为：" + str);
    }
}
