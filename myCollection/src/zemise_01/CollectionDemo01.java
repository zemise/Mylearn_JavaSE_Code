package zemise_01;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> ct = new ArrayList();
        //添加元素：boolean add(E e)
        ct.add("hello");
        ct.add("world");
        ct.add("Java");

        //输出集合对象
        System.out.println(ct);
    }
}
