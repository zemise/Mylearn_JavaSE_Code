package zemise_03;
/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果例如，键盘录入abc，输出结果 cba
    思路：
        1：键盘录入一个字符串，用 Scanner 实现
        2：定义一个方法，实现字符串反转。返回值类型 String， 参数 Strings
        3：在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
        4：调用方法，用一个变量接收结果
        5：输出结果
 */

import java.util.Scanner;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();

        //调用方法，用一个变量接收结果
        str = reverseString(str);

        //输出结果
        System.out.println("倒序后的字符串为： " + str );


    }

    //定义一个方法，实现字符串反转。返回值类型 String， 参数 Strings
    public static String reverseString(String s){
        //定义一个变量用于接收反转后的字符串
//        StringBuilder sb = new StringBuilder(s);

/*
        sb.append("[");
        for(int i = s.length()- 1; i>= 0; i--){
            if(i == 0){
                sb.append(s.charAt(i));
            }else{
                sb.append(s.charAt(i) + ", ");
            }
        }
        sb.append("]");
*/
//        sb.reverse();

        //在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
//        String ss = sb.toString();
//        return ss;

        return new StringBuilder(s).reverse().toString();
    }
}
