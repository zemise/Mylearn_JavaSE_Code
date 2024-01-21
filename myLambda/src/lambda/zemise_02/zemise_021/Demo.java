package lambda.zemise_02.zemise_021;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @Date 2024/1/20
 * @since 1.0
 */
public class Demo {
    public static void main(String[] args) {
        test((name, time) -> {
            System.out.printf("%s在%s开始学习\n", name, time);
        });
    }

    static void test(Study study) {
        study.start("zemise", 20240120);
    }
}
