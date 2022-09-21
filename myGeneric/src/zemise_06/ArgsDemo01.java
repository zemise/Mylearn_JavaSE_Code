package zemise_06;

import static java.lang.Long.sum;

/*
    测试类
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 90, 80));


    }

    public static int sum(int b, int... a) {
        return 0;
    }

/*    public static int sum(int... a) {
//        System.out.println(a);
//        return 0;
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;

    }*/


//    private static int sum(int a, int b) {
//        return a + b;
//    }
//
//    private static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    private static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
}
