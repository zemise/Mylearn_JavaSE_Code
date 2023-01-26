package zemise_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习：通过反射实现如下操作
        Student s = new Student();
        s.name = "林青霞";
        s.age = 30;
        s.address = "西安";
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //创建Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        //获取字段对象，此处因为某些成员变量是私有或者默认，所以优先用getDeclaredField()
        Field nameFiled = c.getDeclaredField("name");
        Field ageField = c.getDeclaredField("age");
        Field addressField = c.getDeclaredField("address");

        //暴力反射，取消访问检查
        nameFiled.setAccessible(true);
        ageField.setAccessible(true);
        addressField.setAccessible(true);

        //获得Student的无参构造方法
        Constructor<?> con = c.getConstructor();
        //用无参构造方法创建Student的对象
        Object obj = con.newInstance();

        System.out.println(obj);

        nameFiled.set(obj, "林青霞");
        ageField.set(obj, 30);
        addressField.set(obj, "西安");

        System.out.println(obj);

        //无意间发现Class对象有个直接的newInstance()方法，发现也能创建Student对象
        //但是这个方法属于过时的方法
        Object o = c.newInstance();

        nameFiled.set(o, "达摩老祖");
        ageField.set(o, 300);
        addressField.set(o, "古洞");

        System.out.println(o);

    }
}
