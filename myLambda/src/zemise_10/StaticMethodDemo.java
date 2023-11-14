package zemise_10;

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
    static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        StaticMethodInterface sm = StaticMethodDemo::add;
        int result = sm.method(15, 16);
        System.out.println("接口方法结果：" + result);
    }

}
