package zemise_06;

import java.util.ArrayList;
import java.util.List;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1：定义学生类
        2：创建List集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */
public class ListDemo {
    public static void main(String[] args) {
        //2：创建List集合对象
        List<Student> list = new ArrayList<>();

        //3：创建学生对象
        Student s1 = new Student("林黛玉",22);
        Student s2 = new Student("贾宝玉",25);
        Student s3 = new Student("薛宝钗",26);
        Student s4 = new Student("赵努力",28);

        //


    }
}
