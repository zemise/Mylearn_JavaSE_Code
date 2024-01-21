package lambda.zemise_10;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */
public class StaticMethodDemo {
    static int add(int x, int y) {
        return x + y;
    }

    static int useMethod(StaticMethodInterface add) {
        return add.method(4, 5);
    }

    public static void main(String[] args) {

        // 静态方法引入
        // 这里相当于做了一个接口的实现
        StaticMethodInterface sm = StaticMethodDemo::add;
        int result = sm.method(15, 16);
        System.out.println("接口方法结果：" + result);

        // 静态方法引入的常见写法
        // 而这种写法，相当于直接把方法作为参数传入
        int otherResult = useMethod(StaticMethodDemo::add);
        System.out.println("接口方法结果：" + otherResult);

    }
}
