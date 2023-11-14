package zemise_11;

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
    public String format(Date date){
        // 创建日期格式化对象，并指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static void main(String[] args) {
        InstanceMethodDemo demo = new InstanceMethodDemo();
        InstanceMethodInterface im = demo::format;

        Date date = new Date();
        System.out.println("默认格式：" + date);
        System.out.println("接口输出的格式：" + im.method(date));
    }
}
