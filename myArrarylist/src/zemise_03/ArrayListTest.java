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
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();

        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3;i++){
            System.out.println("请输入需要录入的学生名字： ");
            String name = sc.nextLine();
            Student s = new Student();
            s.setName(name);

            //往集合中添加学生对象
            array.add(s);
        }
        System.out.println("==========================");
    //遍历集合
        for (int i = 0;i< array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName());
        }
    }
}


