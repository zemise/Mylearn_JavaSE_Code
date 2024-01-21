package lambda.zemise_09;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */
public class NoParamterDemo {
    public static void main(String[] args) {
        // lambda表达式实现打招呼接口，返回抽象方法结果
        SayHiInterface pi = () -> "你好，这是lambda表达式";
        System.out.println(pi.sayHi());

    }
}
