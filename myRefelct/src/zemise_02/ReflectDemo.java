package zemise_02;

/*
    三种方式获取Class对象
        1、使用类的class属性来获取该类对应的class对象，举例，Student.class将会返回Student类对应的Class对象
        2、使用对象的getClass()方法，返回该对象所属对应的Class对象
        3、使用Class类中的静态方法forName(String className)，该方法需要传入字符串参数，该字符串的值是某个类的全路径
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、使用类的class属性来获取该类对应的class对象，举例，Student.class将会返回Student类对应的Class对象
        //这种方法是最方便的
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);

        System.out.println("============");

        //2、使用对象的getClass()方法，返回该对象所属对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1 == c3);

        System.out.println("============");
        // 3、使用Class类中的静态方法forName(String className)，该方法需要传入字符串参数，该字符串的值是某个类的全路径
        //这种方法灵活性是最高的，可以把路径字符串放在配置文件中
        Class<?> c4 = Class.forName("zemise_02.Student");
        System.out.println(c1 == c4);
    }
}
