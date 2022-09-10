package zemise_02;

import java.util.ArrayList;

/*需求：

        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

        思路：

        1：定义学生类

        2：创建集合对象

        3：创建学生对象

        4：添加学生对象到集合中

        5：遍历集合，采用通用遍历格式实现
*/
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> arr = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("林青霞", 32);
        Student s2 = new Student("张曼玉", 32);
        Student s3 = new Student("高圆圆", 25);

        //添加学生对象到集合中
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }
}
