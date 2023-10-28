package zemise_;
/*
    需求：
        在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分
        选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值(不考虑小数部分)
    思路：
        1、定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        2、键盘录入评委分数
        3、由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        4、定义方法实现获取数组中最高分(数组最大值)，调用方法
        5、定义方法实现获取数组中最低分(数组最小值)，调用方法
        6、定义方法实现获取数组中的所有元素的和(数组元素求和)，调用方法
        7、按照计算规则进行计算得到平均分
        8、输出平均分
 */

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];

        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位评委打分：");
            int s = sc.nextInt();
            arr[i] = s;
        }

        //调用方法输出评委分数列表
        printArrary(arr);
        System.out.println("=========");

        //调用方法getMax()，并输出最大值
        System.out.println("该数组最大值为：" + getMax(arr));

        System.out.println("=========");

        //调用方法getMin()，并输出最小值
        System.out.println("该数组最小值为：" + getMin(arr));

        System.out.println("=========");

        //调用方法getSum()，并输出其和

        System.out.println("该数组所有元素之和为：" + getSum(arr));

        System.out.println("=========");

        //按照计算规则进行计算得到平均分
        //定义平均分变量为average
        int average = 0;
        average = (getSum(arr) - getMin(arr) - getMin(arr)) / (arr.length -2);
        //输出平均分
        System.out.println("按照规则计算后，平均分为：" + average);

        System.out.println("=========");
    }

    //定义方法实现获取数组中最高分(数组最大值)
    public static int getMax(int[] arr) {
        //定义最大值变量，默认为arr[0]
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //定义方法实现获取数组中最低分(数组最小值)，调用方法
    public static int getMin(int[] arr) {
        //定义最小值变量，默认为arr[0]
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //定义方法实现获取数组中的所有元素的和(数组元素求和)
    public static int getSum(int[] arr) {
        //定义一个求和变量，默认值为0
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //定义一个输出数组的方法printArray()
    public static void printArrary(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //先判断该数组只含有一个元素的情况
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
