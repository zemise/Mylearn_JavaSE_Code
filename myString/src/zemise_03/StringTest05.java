package zemise_03;

import java.util.Scanner;

/*
    需求：
        定义一个方法，实现字符串反转，键盘录入一个字符串，调用该方法，在控制台输出结果
        例如：键盘录入abc,输出结果是：cba

    思路：
        1、键盘录入一个字符串，用Scanner实现
        2、定义一个方法，实现字符串反转，返回值类型为String，参数为String s
        3、在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        4、调用方法，用一个变量接收结果
        5、输出结果
 */
public class StringTest05 {
    public static void main(String[] args) {

        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个需要反转的字符串：");
        String s = sc.nextLine();

        //调用方法，用一个变量接收结果
        String rs = reverseString(s);

        //输出结果
        System.out.println("反转字符串为: " + rs);

    }

    //定义一个方法，实现字符串反转，返回值类型为String，参数为String s
    public static String reverseString(String s) {
        //在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回

        //定义一个变量接收
        String rs = "";

        for (int i = s.length()-1; i >= 0; i--) {

            rs += s.charAt(i);

        }
        return rs;
    }
}
