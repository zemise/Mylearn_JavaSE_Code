package zemise_05;

import zemise_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    反射获取成员方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        System.out.println("=====================");
        //Method[] getMethods() 返回一个包含方法对象的数组，方法对象反映由该Class对象表示的类或接口的所有公共方法，
        //注意：还包括这由类或接口声明的对象从父类或父类接口继承的类中的方法
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("=====================");
        //Method[] getDeclaredMethods() 返回一个包含方法对象的数组，方法对象反映由该Class对象表示的类或接口的所有方法
        //注意：这不会包括继承的方法
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        System.out.println("=====================");
        //Method getMethod(String name, Class<?>...parameterTypes)
        //返回一个方法对象，该对象反映由该Class对象表示的类或接口的指定公共成员方法
        Method method1 = c.getMethod("method1");
        System.out.println(method1);

        System.out.println("=====================");
        //Method getDeclaredMethod(String name, Class<?>...parameterTypes)
        //返回一个方法对象，该对象反映由该Class对象表示的类或接口的指定成员方法
        Method declaredMethod001 = c.getDeclaredMethod("function");
        System.out.println(declaredMethod001);

//        Student s = new Student();
//        s.method1();

        System.out.println("=====================");
        //获取无参构造方法创建对象
        Constructor<?> constructor = c.getConstructor();
        Object o = constructor.newInstance();

        //暴力映射，取消检查
        declaredMethod001.setAccessible(true);

        //在类或者接口上提供有关单一方法的信息和访问权限
        //Object invoke(Object obj, Object...args)在具有指定参数的指定对象上调用此方法对象，方法对象表示的基础方法
        //Object 返回值类型
        //obj 调用方法的对象
        //args 方法需要的参数
        declaredMethod001.invoke(o);

        System.out.println("=====================");
        method1.setAccessible(true);
        method1.invoke(o);
    }
}
