package zemise_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求： 创建一个ArrayList集合，存储三个元素，每一个元素都是HasMap，每一个HashMap的键和值都是String，并且遍历

    思路：
        1：创建ArrayList集合
        2：创建HashMap集合，并添加键值对元素
        3：把HashMap作为元素添加到ArrayList集合
        4：遍历Arraylist集合

    给出如下的数据：
        第一个HashMap集合的元素：
            孙策  大乔
            周瑜  小乔
        第二个HashMap集合的元素：
            郭靖  黄蓉
            杨过  小龙女
        第三个HashMap集合的元素：
            令狐冲 任盈盈
            林平之 岳灵珊
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //1：创建ArrayList集合
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();

        //2：创建HashMap集合，并添加键值对元素
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("孙策", "大乔");
        map1.put("周瑜", "小乔");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("郭靖", "黄蓉");
        map2.put("杨过", "小龙女");

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("令狐冲", "任盈盈");
        map3.put("林平之", "岳灵珊");

        //3：把HashMap作为元素添加到ArrayList集合
        arr.add(map1);
        arr.add(map2);
        arr.add(map3);

        //4：遍历Arraylist集合
/*        for (int i = 0; i < arr.size(); i++) {
            HashMap<String, String> map = arr.get(i);
            Set<String> keys = map.keySet();
            for (String key : keys) {
                String value = map.get(key);
                System.out.println(key + "," + value);
            }
            System.out.println("=============");
        }*/

        for (HashMap<String, String> hm : arr) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
            System.out.println("=============");
        }
    }
}
