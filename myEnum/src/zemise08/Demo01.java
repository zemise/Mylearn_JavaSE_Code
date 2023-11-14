package zemise08;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
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
public class Demo01 {
    public static <T> T[] toArray(List<T> list, Class<T> tClass) {
        //声明并初始化一个T类型的数组
        T[] t = (T[]) Array.newInstance(tClass, list.size());
        for(int i=0,n=list.size();i<n;i++){
            t[i] = list.get(i);
        }
        return t;
    }

    public static <T> T[] toArraySe(List<T> list, Class<T> tClass) throws NoSuchMethodException {
        //声明并初始化一个T类型的数组

        T[] t = (T[]) Array.newInstance(tClass, list.size());
        for(int i=0,n=list.size();i<n;i++){
            t[i] = list.get(i);
        }
        return t;
    }
}
