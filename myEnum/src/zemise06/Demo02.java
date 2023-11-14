package zemise06;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/10/31
 * @since 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello, World"); // 合法，编译时类型检查通过

        List<Integer> intList = new ArrayList<>();
        intList.add(42); // 合法，编译时类型检查通过

        List<?> wildcardList = new ArrayList<>();
        //wildcardList.add("Test"); // 编译时错误，无法确定通配符类型

        for (String str : stringList) {
            // 这里的 str 是 String 类型，在运行时确定
            System.out.println(str);
        }

        for (Integer num : intList) {
            // 这里的 num 是 Integer 类型，在运行时确定
            System.out.println(num);
        }

    }
}
