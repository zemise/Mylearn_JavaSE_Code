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
        System.out.println(t1.getName() + "," +t1.getAge());
        t1.teach();

    }
}
