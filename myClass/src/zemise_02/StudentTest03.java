package zemise_02;

/*
    多个对象指向相同
 */

public class StudentTest03 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();

        s1.name = "林青霞";
        //s1.age = 28;
        s1.setAge(28);
        System.out.println(s1.name + "," +s1.getAge());

        //把第一个对象的地址赋值给第二个对象
        Student s2 = s1;

        s2.name = "张曼玉";
        //s2.age = 30;
        s2.setAge(30);

        System.out.println(s1.name + "," +s1.getAge());
        System.out.println("=================");
        System.out.println(s2.name + "," +s2.getAge());
    }
}
