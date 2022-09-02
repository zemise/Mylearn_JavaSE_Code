package zemise_02;
/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用用对象
        System.out.println(s.name + "," + s.getAge());

        s.name = "林青霞";
        //s.age=30;
        s.setAge(30);

        System.out.println(s.name + "," + s.getAge());

        s.study();
        s.deHomework();
    }
}
