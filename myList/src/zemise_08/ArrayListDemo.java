package zemise_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
    需求：
        创建一个存储学生对家的業合，存储3个学生对象。使用程序实现在控制台遍历该集合

    思路：
        1：定义学生类
        2：创建ArrayList集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //2：创建ArrayList集合对象
        //ArrayList<Student> arr = new ArrayList<>();
        LinkedList<Student> arr = new LinkedList<>();

        //3：创建学生对象
        Student s1 = new Student("林黛玉", 22);
        Student s2 = new Student("张曼玉", 12);
        Student s3 = new Student("温如玉", 23);

        //4：把学生添加到集合
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        //遍历集合
        //迭代器：集合特有的遍历方式
        Iterator<Student> k = arr.iterator();
        while(k.hasNext()){
            Student s = k.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("==========================");

        //普通for：带有索引的遍历方式
        for(int i = 0;i< arr.size();i++){
            Student s = arr.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("==========================");

        //迭代器：集合特有的遍历方式
        for(Student s:arr){
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("==========================");

    }
}
