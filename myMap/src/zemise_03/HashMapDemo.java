package zemise_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号(string)，值是学生对象(Student)。存储三个能鱼对元素，并遍历
    思路：
        1：定义学生类
        2：创建HashMap集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合
            方式1：键找值
            方式2，键值对对象找键和值
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //2：创建HashMap集合对象
        Map<String, Student> map = new HashMap<>();

        //3：创建学生对象
        Student s1 = new Student("花无缺", 24);
        Student s2 = new Student("江玉燕", 23);
        Student s3 = new Student("小鱼儿", 24);
        Student s4 = new Student("小仙女", 22);

        //4：把学生添加到集合
        map.put("zemise_001", s1);
        map.put("zemise_002", s2);
        map.put("zemise_003", s3);
        map.put("zemise_004", s4);

        //5：遍历集合
        //方式1：键找值
        Set<String> keySet = map.keySet();
        for (String s: keySet) {
            Student student = map.get(s);
            System.out.println("学号：" + s + ",姓名：" + student.getName() + ",年龄：" + student.getAge());
        }

        }
    }
