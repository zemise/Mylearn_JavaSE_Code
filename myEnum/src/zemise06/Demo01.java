package zemise06;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/10/31
 * @since 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //List<String>[] listArray = new List<String>[];
        List<String>[] listArray;

        //数组支持协变
        Number[] n = new Integer[10];
        //编译不通过，泛型不支持协变
        //List<Number> ln = new ArrayList<Integer>();


        // 通配符模拟协变
        //Number的子类型（包括Number类型）都可以是泛型参数类型
        List<? extends Number> ln = new ArrayList<Integer>();
        //List<T extends Number> lt = new ArrayList<Integer>();

        // 模拟逆变
        //Integer的父类型(包括Integer)都可以是泛型参数类型
        List<? super Integer> li = new ArrayList<Number>();
    }
}
