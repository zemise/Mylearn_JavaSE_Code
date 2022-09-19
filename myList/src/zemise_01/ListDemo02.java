package zemise_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    List集合特有方法：
        void add(int index， E element)：在此集合中的指定位置插入指定的元素
        E remove(int index)：册除指定索引处的元素，返回被州除的元素
        E set(int index， E element)：修改指定索引处的元素，返回被修改的元素
        E get(int index)：返回指定索引处的元素
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");


        //void add(int index， E element)：在此集合中的指定位置插入指定的元素
//        list.add(1,"javaee");
//        list.add(11,"javaee");//IndexOutOfBoundsException

        //E remove(int index)：册除指定索引处的元素，返回被州除的元素
//        System.out.println(list.remove(1));
//        System.out.println(list.remove(12));//IndexOutOfBoundsException

        //E set(int index， E element)：修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(0,"javaee"));


        // E get(int index)：返回指定索引处的元素
        System.out.println(list.get(1));

        //输出集合对象
        System.out.println(list);

    }
}
