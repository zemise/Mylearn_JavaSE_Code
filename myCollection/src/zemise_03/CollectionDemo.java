package zemise_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1：定义学生类
        2：创建Collection集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合（迭代器方式）
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //2：创建Collection集合对象
        Collection<Student> s = new ArrayList<>();

        //3：创建学生对象
        Student s1 = new Student("风青杨",22);
        Student s2 = new Student("东方不败",25);
        Student s3 = new Student("令狐冲",27);


        //4：把学生添加到集合
        s.add(s1);
        s.add(s2);
        s.add(s3);

        //5：遍历集合（迭代器方式）
        Iterator<Student> it = s.iterator();

        while(it.hasNext()){
            Student k =it.next();
            System.out.println(k.getName() + "," + k.getAge());
        }



    }
}
