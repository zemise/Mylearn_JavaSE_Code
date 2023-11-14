package zemise_12;

import java.util.HashSet;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/14
 * @since 1.0
 */
public class ParadigmDemo {
    // 静态方法，使用泛型参数，在方法名之前定义泛型
    // 此方法用于查找数组中的重复元素个数
    static public <T> int repeatCount(T[] t){
        int arrayLength = t.length; // 记录数组长度
        HashSet<T> set = new HashSet<T>(); // 创建哈希集合
        for (T tmp : t) {
            set.add(tmp);
        }
        return arrayLength - set.size(); // 返回数组长度与集合长度的差

    }

    public static void main(String[] args) {
        Integer a[] = {1,1,1,2,3,4,5,6,7,5,4};
        String s[] = {"s", "s", "d", "e","e", "q"};

        // 创建接口对象，integer作为泛型，引入ParadigmDemo类的静态方法，方法命要定义泛型
        ParadigmInterface<Integer> p1 = ParadigmDemo::<Integer> repeatCount;
        // 调用接口方法
        System.out.println("整数数组重复元素个数：" + p1.method(a));

        // 方法名若不定义泛型，则默认使用接口已经定义好的泛型
        ParadigmInterface<String> p2 = ParadigmDemo::repeatCount;
        System.out.println("字符串数组重复元素个数：" + p2.method(s));
    }
}
