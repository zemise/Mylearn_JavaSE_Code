package zemise_06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    练习2：通过配置文件运行类中的方法
 */
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*Student s = new Student();
        s.study();

        Teacher t = new Teacher();
        t.teach();*/

        System.out.println("====================");

        /*
            class.txt
            className = xx
            methodName = xx
         */

        //加载数据
        Properties properties = new Properties();
        FileReader f = new FileReader("/Users/zhaowang/IdeaProjects/JavaSE_Code/myRefelct/src/class.txt");
        properties.load(f);
        f.close();

        /*
            className=zemise_06.Student
            methodName=study
         */

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //通过反射来使用

        Class<?> c = Class.forName(className);//zemise_06.student

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method method = c.getMethod(methodName);//study

        method.invoke(obj);


    }
}
