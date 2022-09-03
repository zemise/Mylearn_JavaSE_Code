package zemise_01;
/*
    Scanner：
        用于获取键盘录入数据。（基本数据类型，字符串数据）
    public String nextLine():
        获取键盘录入字符串数据
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个字符串数据");
        //String line = sc.nextLine();
        //Ctrl + Alt +V，选输入下方的右边，按快捷键，会自动生成右边
        String line = sc.nextLine();

        //输出结果
        System.out.println("你输入的数据时：" + line);
    }
}
