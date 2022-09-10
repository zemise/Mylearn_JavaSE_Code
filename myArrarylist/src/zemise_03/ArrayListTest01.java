package zemise_03;
/*

        需求:
            创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合学生的姓名和年龄来自于键盘录入

        思路：

        1：定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型

        2：创建集合对象

        3：键盘录入学生对象所需要的数据

        4：创建学生对象，把键盘录入的数据赋值给学生对象的成员变量

        5：往集合中添加学生对象

        6：遍历集合，采用通用遍历格式实现


        还是这个例子，进行代码重写
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> Array01 = new ArrayList<>();

        //键盘录入学生对象所需要的数据
        for(int i = 0; i <3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("=============");
            System.out.println("请输入第" + (i+1) + "位学生的名字");
            String name = sc.nextLine();
            System.out.println("请输入第" + (i+1) + "位学生的年龄");
            String age = sc.nextLine();

            //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
            Student s = new Student(name,age);

            //往集合中添加学生对象
            Array01.add(s);
        }

        //遍历集合，采用通用遍历格式实现
        //下方这个for条件是，正常循环后点调整自动创建的，更简介，但不知道原理
        //原本是下方这样的

        for (Student n : Array01) {
            System.out.println("name：" + n.getName() + "," + "age：" + n.getAge());
        }


    }
}

/*
                for (int i = 0;i< array.size();i++){
                    Student n = array.get(i);
                    System.out.println(s.getName());
                }
*/
