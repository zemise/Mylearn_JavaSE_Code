package zemise_02;
/*
    StringBuilder转换为String
        public String toString():通过toString()可以实现把StringBuilder转换为String

    String转换为StringBuilder
        public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder
 */

public class StringBuilderDemo02 {
    public static void main(String[] args) {
/*
        //StringBuilder转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        //String s = sb; //这个是错误的做法
        String s = sb.toString();
        System.out.println(s);
*/

        //String转换为StringBuilder
        String s = "hello";

        //StringBuilder sb = s; //这个是错误的做法

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);


    }
}
