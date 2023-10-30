package zemise01;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public class ShowEnum {
    public static void main(String[] args) {
        SeasonEnum[] values = SeasonEnum.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println("枚举常量：" + values[i]);
        }
    }
}
