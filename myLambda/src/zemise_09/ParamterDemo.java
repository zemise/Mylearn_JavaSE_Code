package zemise_09;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */
public class ParamterDemo {
    public static void main(String[] args) {
        // lambda表达式实现加法接口，返回参数相加的值
        AdditionInterface np = (x, y) -> x + y;
        int result = np.add(15, 25);
        System.out.println("相加结果" + result);
    }
}
