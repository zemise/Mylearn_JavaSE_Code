package zemise_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList， LinkedList
        ArrayList：底层数据结构是数組，查询快，增册慢
        LinkedList：底层数据结构是链表，查询慢，增删快

    练习：
    分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对西那个
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for(String s: array){
            System.out.println(s);
        }
        System.out.println("==================");
        for(int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }
        System.out.println("==================");
        Iterator<String> s = array.iterator();
        while(s.hasNext()){
            String next = s.next();
            System.out.println(next);
        }
        System.out.println("==================");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("python");
        linkedList.add("world");

        for (String i:linkedList){
            System.out.println(i);
        }
    }
}
