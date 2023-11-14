package zemise_07;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @Date 2023/10/31
 * @since 1.0
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //反射获取方法
        Method m1 = Foo.class.getMethod("doStuff");
        //打印出是否可访问
        System.out.println("Accessible = " + m1.isAccessible());
        //执行方法
        m1.invoke(new Foo());
    }
}
