package lambda.zemise_11;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */
public class InstanceMethodDemo {
    public String format(Date date) {
        // 创建日期格式化对象，并指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static String useFormat(InstanceMethodInterface face) {
        return face.method(new Date());
    }

    public static void main(String[] args) {

        // 动态方法引入
        // 这里相当于做了一个接口的实现
        InstanceMethodDemo demo = new InstanceMethodDemo();
        InstanceMethodInterface im = demo::format;

        Date date = new Date();
        System.out.println("默认格式：" + date);
        System.out.println("接口输出的格式：" + im.method(date));

        // 动态方法引入的常见写法
        // 而这种写法，相当于直接把方法作为参数传入
        String otherResult = useFormat(new InstanceMethodDemo()::format);
        System.out.println(otherResult);

    }
}
