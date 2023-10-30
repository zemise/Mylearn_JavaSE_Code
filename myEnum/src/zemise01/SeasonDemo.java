package zemise01;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public class SeasonDemo {
    public static void printSeason01(int season) {
        switch (season) {
            case SeasonInterface.SPRING -> System.out.println("这是春季");
            case SeasonInterface.SUMMER -> System.out.println("这是夏季");
            case SeasonInterface.AUTUMN -> System.out.println("这是秋季");
            case SeasonInterface.WINTER -> System.out.println("这是冬季");
            default -> System.out.println("这不是四季的常量值");
        }
    }

    public static void printSeason02(SeasonEnum season) {
        switch (season) {
            case SPRING -> System.out.println("这是春季");
            case SUMMER -> System.out.println("这是夏季");
            case AUTUMN -> System.out.println("这是秋季");
            case WINTER -> System.out.println("这是冬季");
        }
    }


    public static void main(String[] args) {
        printSeason01(SeasonInterface.SPRING); // 使用接口常量作为参数
        printSeason01(3); // 可以使用数字作为参数
        printSeason01(-1); // 使用接口常量值意外的数字”冒充“常量

        printSeason02(SeasonEnum.WINTER); // 使用枚举做参数，只能用枚举中有的值，无法”冒充“
    }
}
