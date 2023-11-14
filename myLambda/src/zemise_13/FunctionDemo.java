package zemise_13;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/14
 * @since 1.0
 */
public class FunctionDemo {

    public static Integer factorial(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static  void  sayHi(String name) {
        System.out.println("Hello " + name);
    }

    public static String getHello(){
        return "Hello ";
    }
    public static void main(String[] args) {
        System.out.println("Function<T,R>: 函数型接口================================");
        // 引用静态方法
        Function<Integer, Integer> s = FunctionDemo::factorial;
        System.out.println(s.apply(8));

        // 原始写法
        Function<Integer, Integer> s2 = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println(s2.apply(8));
        System.out.println("Consumer: 消费性接口================================");

        Consumer<String> c = FunctionDemo::sayHi;
        c.accept("zemise");

        // 原始写法
        Consumer<String> c1 = (name) ->{
            System.out.println("Hello " + name);
        };
        c1.accept("zemise");

        System.out.println("Supplier: 供给型接口================================");

        Supplier<String> supplier = FunctionDemo::getHello;
        System.out.println(supplier.get());

        System.out.println("Predicate: 断言型接口================================");
        Predicate<Integer> p = (n) -> n % 2 == 0;
        System.out.println(p.test(55));
    }
}
