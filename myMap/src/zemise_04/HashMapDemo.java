package zemise_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个键值对元素，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
    思路：
        1：定义学生类
        2：创建HashMap集合对象
        3：创建学生对象
        4：把学生添加到集合
        5：遍历集合
        6：在学生类中重写两个方法
            hashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //2：创建HashMap集合对象
        Map<Student, String> map = new HashMap<>();

        //3：创建学生对象
        Student s1 = new Student("花无缺", 24);
        Student s2 = new Student("江玉燕", 23);
        Student s3 = new Student("小鱼儿", 24);
        Student s4 = new Student("小仙女", 22);
        Student s5 = new Student("小仙女", 22);

        //4：把学生添加到集合
        map.put(s1, "China");
        map.put(s2, "Japan");
        map.put(s3, "America");
        map.put(s4, "France");
        map.put(s5, "England");

        //5：遍历集合
        Set<Student> set = map.keySet();
        for (Student s : set) {
            String address = map.get(s);
            System.out.println("姓名：" + s.getName() + " 年龄：" + s.getAge() + " 居住地：" + address);

        }

    }
}
