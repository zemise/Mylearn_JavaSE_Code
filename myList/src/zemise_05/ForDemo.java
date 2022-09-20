package zemise_05;

import java.util.ArrayList;
import java.util.List;

/*
    增强for：简化数组和Collection集合的遍历
        实现Iterable接口的类允许其对象成为增强型 for语句的目标
        它是JDK5之后出现的，其内部原理是一个Iterator迭代器

    格式：
        for(元素数据类型变量名：数组或者Collection集合）{
        //在此处使用变量即可，该变量就是元素
        }
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("============");
        String[] arr2 = {"hello", "java", "world"};
        for (String i : arr2) {
            System.out.println(i);
        }

        System.out.println("============");
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("python");
        list.add("java");
        for (String i : list) {
            System.out.println(i);
        }


        //内部原理是一个Iterator迭代器
//        for (String s : list) {
//            if (s.equals("hello")) {
//                list.add("javaee");
//            }
//        }
    }
}
