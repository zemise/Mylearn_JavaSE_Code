
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 *  限制泛型的类型
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public class LimitedClass <T extends List> {
    public static void main(String[] args) {
        // 可以实例化已经实现List接口的类
        LimitedClass<ArrayList> l1 = new LimitedClass<>();
        LimitedClass<LinkedList> l2 = new LimitedClass<>();

        // 这句是错误的，因为HashMap类没有实现List接口
        // LimitedClass<HashMap> l3 = new LimitedClass<HashMap>();
        
    }
}
