package zemise_02;

/*
    需求：
        设计一个方法用于打印两个数中的较大数，数据来自于方法参数
    思路：
        1、定义一个方法，用于打印两个数字中较大数，例如getMax()
        2、为方法定义两个参数，用于接收两个数字
        3、使用分支语句分两种情况对两个数字的大小关系进行处理
        4、在main()方法中调用定义好的方法(使用常量)
        5、在main()方法中调用定义好的方法(使用变量)
 */
public class MethodTest {
    public static void main(String[] args) {
        getMax(10, 99);
    }

    public static void getMax(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("最大值为" + number1);
        } else {
            System.out.println("最大值为" + number2);
        }
    }
}
