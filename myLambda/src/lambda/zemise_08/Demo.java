package lambda.zemise_08;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Consumer<String> myList = new MyList<>();
        myList.accept("hello");

        System.out.println(myList);

        System.out.println(((MyList<String>) myList).getList());
    }
}
