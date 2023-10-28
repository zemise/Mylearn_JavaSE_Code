package zemise_03;

import zemise_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作
        Student s = new Student("林青霞");
        System.out.println(s)
 */
public class ReflectDemo03 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        //private Student(String name)
        //Constructor<?> getDeclaredConstructor(Class<?>...parameterTypes)
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //暴力反射
        //public void setAccessible(boolean flag): 值为true，取消访问检查
        con.setAccessible(true);

        Object o = con.newInstance("林青霞");
        System.out.println(o);

        System.out.println(o instanceof Student);


    }
}
