package zemise_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取成员变量并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("zemise_02.Student");

        //Field[] getFields() 返回一个包含Field对象的数组，Filed对象反映由该Class对象表示的类或接口所有可以访问的公共成员变量
        //Field[] getDeclaredFields() 返回一个包含Field对象的数组，Filed对象反映由该Class对象表示的类或接口所有成员变量，包含公共、默认、私有
        System.out.println("======================");
        Field[] fields = c.getFields();
        for(Field field : fields){
            System.out.println(field);
        }

        System.out.println("======================");
        Field[] fields1 = c.getDeclaredFields();
        for(Field field : fields1){
            System.out.println(field);
        }


        //Filed getFiled(String name) 返回一个Filed对象，该对象反映由该Class对象表示的类或接口的指定公共成员字段
        //Filed getDeclaredFiled(String name) 返回一个Filed对象，该对象反映由该Class对象表示的类或接口的指定所有成员字段，包含公共、默认、私有
        System.out.println("======================");
        Field addressFiled = c.getField("address");


        /*Student s = new Student();
        s.address = "西安";
        System.out.println(s);*/

        //获取无参构造方法来创建对象
        Constructor<?> dc = c.getDeclaredConstructor();
        Object o = dc.newInstance();


        //Field提供有关类或接口的单个字段的信息和动态访问
        //void set(Object obj, Obeject value)将指定的对象参数中由此 Filed对象表示的字段设置为指定的新值
        addressFiled.set(o,"西安");//给o的成员变量addressFiled值赋值为西安

        System.out.println(o);






    }
}
