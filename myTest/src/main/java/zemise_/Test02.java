package zemise_;
/*
    需求，输入星期数，显示今天的减肥活动
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
    思路：
        1、键盘录入一个星期数，用一个变量接收
        2、对星期数进行判断，这里用switch语句实现
        3、在对应的语句中控制输出对应的减肥活动

     导包：
        1、手动导包 import java.util.Scanner;
        2、快捷键导包   Alt + Enter
        3、自动导包

 */


import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int number = sc.nextInt();

        lossWeight(number);

    }
    public static void lossWeight(int week) {
        switch(week){
            case 1:
                System.out.println("今天的减肥活动是：跑步");
                break;
            case 2:
                System.out.println("今天的减肥活动是：游泳");
                break;
            case 3:
                System.out.println("今天的减肥活动是：慢走");
                break;
            case 4:
                System.out.println("今天的减肥活动是：动感单车");
                break;
            case 5:
                System.out.println("今天的减肥活动是：拳击");
                break;
            case 6:
                System.out.println("今天的减肥活动是：爬山");
                break;
            case 7:
                System.out.println("今天的减肥活动是：好好吃一顿");
                break;
            default:
                System.out.println("你输入的信息有误");
        }
    }
}
