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
        2、对星期数进行判断，这里用if语句实现
        3、在对应的语句中控制输出对应的减肥活动
 */
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();



    }
    public static void lossWeight(int a){
        if(a ==1){
            System.out.println("今天的减肥活动是：跑步" );
        }else if(a ==2){
            System.out.println("今天的减肥活动是：游泳" );
        }else if(a ==3){
            System.out.println("今天的减肥活动是：慢走" );
        }else if(a==4){
            System.out.println("今天的减肥活动是：动感单车" );
        }else if(a ==5){
            System.out.println("今天的减肥活动是：拳击" );
        }else if(a ==6){
            System.out.println("今天的减肥活动是：爬山" );
        }else if(a==7){
            System.out.println("今天的减肥活动是：好好吃一顿" );
        }else{
            System.out.println("没有正确输入星期数" );
        }
    }
}
