package zemise_07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
    需求：
        键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
        举例：键盘录入“aababcabedabcde“ 在控制台输出：“a(5)b(4)c(3)d(2)e(1)*

    思路：
        1：键盘录入一个字符串
        2：创建HashMap集合，键是Character，值是Integer
        3：遍历字符串，得到每一个字符
        4：拿得到的每一个字符作为健到HashMap集合中去找对应的值，看其返回值
            如果返回值是nulL：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
            如果返回值不是nuLl：说明该字符在HashMap集合中存在，把该值加工，然后重新存储该字符和对应的值
        5：遍历HashMap集合，得到键和值，按照要求进行拼接
        6：输出结果
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //1：键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要统计的字符串：");
        String line = sc.nextLine();

        //2：创建HashMap集合，键是Character，值是Integer
        HashMap<Character, Integer> hm = new HashMap<>();

        //3：遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //4：拿得到的每一个字符作为健到HashMap集合中去找对应的值，看其返回值
            Integer integer = hm.get(c);

            if (integer != null) {
                //如果返回值不是nuLl：说明该字符在HashMap集合中存在，把该值加工，然后重新存储该字符和对应的值
                integer++;
                hm.put(c, integer);
            } else {
                //如果返回值是nulL：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
                hm.put(c, 1);
            }
        }
        //5：遍历HashMap集合，得到键和值，按照要求进行拼接
        Set<Character> characters = hm.keySet();
        for (Character key : characters) {
            Integer num = hm.get(key);
            System.out.print(key.toString() + '(' + num + ")");
        }
    }
}
