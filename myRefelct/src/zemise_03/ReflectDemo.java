package zemise_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取构造方法并使用
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        //Constructor<?>[] getConstructors() 返回一个包含Constructor的对象的数组
        //Constructor对象反映了由该Class对象表示的类的所有公共构造函数
        Constructor<?>[] constructors = c.getConstructors();
        for(Constructor con : constructors){
            System.out.println(con);
        }

        System.out.println("=====================");
        //Constructor<?>[] declaredConstructors() 返回由该Class对象的类声明的所有构造函数的Constructor对象的数组
        Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
        for(Constructor con : declaredConstructors){
            System.out.println(con);
        }

        System.out.println("=====================");
        //Constructor<?> constructor(Class(?)...parameterTypes) 返回一个Constructor对象，公共的
        //Constructor<?> declaredConstructor(Class(?)...parameterTypes) 返回一个Constructor对象，公共私有的都行
        //参数，你要获取的构造方法参数的个数，和数据类型对应的字节码文件对象

        //此处获取的是Student类的无参构造方法对象
        Constructor<?> constructor = c.getConstructor();
        System.out.println(constructor);

        //Constructor提供类一个类的单个构造函数的信息和访问权限
        Object o = constructor.newInstance();
        System.out.println(o);

        Constructor<?> declaredConstructor = c.getDeclaredConstructor();

    }
}
