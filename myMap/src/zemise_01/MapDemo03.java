package zemise_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/*
    Map集合的获取功能:
        get(Object key):根据键获取值
        Set<k> keySet():获取所有键的集合
        Collection<V> values():获取所有值的集合
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //get(Object key):根据键获取值
//        System.out.println(map.get("张无忌"));
//        System.out.println(map.get("张三丰"));

        //Set<k> keySet():获取所有键的集合
//        Set<String> keySet = map.keySet();
//        for(String s:keySet){
//            System.out.println(s);
//        }

        //Collection<V> values():获取所有值的集合
        Collection<String> values = map.values();
        for(String s:values){
            System.out.println(s);
        }
    }
}
