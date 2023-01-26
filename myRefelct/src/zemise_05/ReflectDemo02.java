package zemise_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.method1();
        s.method2("林青霞");
        s.method3("林青霞", 30);
        String ss = s.method3("林青霞", 30);
        System.out.println(ss);
        s.function();
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        //获取无参构造方法
        Constructor<?> con = c.getConstructor();

        //获取Student的反映对象
        Object objStudent = con.newInstance();

        //根据Class对象，获取成员方法method1
        Method method1 = c.getMethod("method1");

        System.out.println("==================");
        //反射实现类似操作
        //Student s = new Student();
        //s.method1();
        method1.invoke(objStudent);

        System.out.println("==================");
        //反射实现类似操作
        //s.method2("林青霞");

        //根据Class对象，获取成员方法method2，这次是包含参数的方法
        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(objStudent, "林青霞");

        System.out.println("==================");
        //反射实现类似操作
        //String ss = s.method3("林青霞", 30);
        //System.out.println(ss);

        //根据Class对象，获取成员方法method3，这次是包含2个参数的方法
        Method method3 = c.getMethod("method3", String.class, int.class);
        method3.invoke(objStudent, "林青霞", 30);
        System.out.println("====短暂分界线====");
        String ss = (String) method3.invoke(objStudent, "林青霞", 30);
        System.out.println(ss);
        Object o = method3.invoke(objStudent, "林青霞", 30);
        System.out.println(o);

        System.out.println("==================");
        //反射实现类似操作
        //s.function()

        //根据Class对象，获取成员方法function，这次是私有的无参方法
        Method function = c.getDeclaredMethod("function");
        //要记得暴力映射，取消本次检查
        function.setAccessible(true);
        function.invoke(objStudent);

    }
}
