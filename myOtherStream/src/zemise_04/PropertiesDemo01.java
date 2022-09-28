package zemise_04;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new Properties();//错误写法
        Properties prop = new Properties();

        //存储元素
        prop.put("zemise001", "林青霞");
        prop.put("zemise002", "张曼玉");
        prop.put("zemise003", "王祖贤");
        prop.put("zemise004", "小仙女");

        //遍历集合
        Set<Object> objects = prop.keySet();
        for (Object obs : objects) {
            Object name = prop.get(obs);
            System.out.println(obs + "," + name);
        }

    }
}
