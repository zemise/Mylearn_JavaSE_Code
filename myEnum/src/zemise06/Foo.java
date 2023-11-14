package zemise06;

import java.lang.reflect.Array;
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
public class Foo<T> {
    //private T t = new T();
    //private T[] tArrary = new T[5];
    private T t;
    private T[] tArrary;

    private List<T> list = new ArrayList<T>();

    public Foo() {
        try{
            Class<?> tType = Class.forName("");
            t = (T) tType.newInstance();
            tArrary = (T[]) Array.newInstance(tType, 5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
