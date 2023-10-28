package zemise_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
    需求：
        删除字符串中所有 &加上任意1个单字母或单数字
        删除&#开头的16进制的，如&#0066FF[封测]mooooossee:
 */
public class RegularDemo {
    public static void main(String[] args) {
        RegularDemo.test("&5[管理&b&l组]&rzemiese_&j[组长]&r");
        RegularDemo.test("&#0066FF[封测]&rzemiese_&j[组长]&r");

    }
    public static void test(String s){
        //括号里为正则表达式
        Pattern compile = Pattern.compile("&[^#]|&#[a-zA-Z0-9]{6}");
        //括号里为需要替换的字符串
        Matcher matcher = compile.matcher(s);
        //结果
        //替换之后的新字符为""
        String noColor = matcher.replaceAll("").trim();
        System.out.println("替换后为：" + noColor);
    }
}
