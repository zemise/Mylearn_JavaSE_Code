package zemise_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    需求：
        ArrayList存储学生对象，使用Collections对ArrayList进行排序

    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

    思路：
        1：定义学生类
        2：创建ArrayList集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：使用Collections对Arraylist集合排序
        6：遍历集合
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        //2：创建ArrayList集合对象
        ArrayList<zemise_02.Student> arr = new ArrayList<>();

        //3：创建学生对象
        Student s1 =new Student("linqingxia", 22);
        Student s2 =new Student("zhangmanyu", 35);
        Student s3 =new Student("wangzuxian", 33);
        Student s4 =new Student("liuyan", 27);

        //4：把学生添加到集合
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        //5：使用Collections对Arraylist集合排序
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        for(Student s :arr){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
