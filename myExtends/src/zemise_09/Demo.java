package zemise_09;

/*
    测试类
 */
public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();

        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("风清扬", 33);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        System.out.println("=====================================");

        //创建学生类对象并进行测试
        Student s1 = new Student();
        s1.setName("令狐冲");
        s1.setAge(22);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();


        Student s2 = new Student("任盈盈", 21);
        System.out.println(s2.getName() + "," + s2.getAge());
        s2.study();
    }
}
