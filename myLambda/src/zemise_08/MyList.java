package zemise_08;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */
public class MyList<T> implements Consumer<T>{
    private final List<T> list = new ArrayList();

    @Override
    public void accept(T t) {
        list.add(t);
    }

    public List<T> getList() {
        return list;
    }
}
