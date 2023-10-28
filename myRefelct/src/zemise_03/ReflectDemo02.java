package zemise_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作
        Student s = new Student("林青霞",30,"西安");
        System.out.println(s)
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        //public Student(String name, int age, String address)
        //
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //基本数据类型也可以通过.class得到对应的Class类型

        //T newInstance(Object...initargs)
        Object o = con.newInstance( "林青霞", 30, "西安");
        System.out.println(o);

        Class<?> aClass = o.getClass();
        System.out.println(aClass);
    }
}
