package zemise_04;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为集合的特有方法:
        Object setProperty(String key, String value):设置集合的键和值,都是String类型,底层调用Hashtable方法put
        String getProperty(String key):使用此属性列表中指定的键搜素属性
        Set(String〉 stringPropertyNames():从该属性列表中返回一个不可修改的键集,其中键及其对应的值是字符串
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        // Object setProperty(String key, String value):设置集合的键和值,都是String类型,底层调用Hashtable方法put
        prop.setProperty("zemise001","林青霞");
        /*
                public synchronized Object setProperty(String key, String value) {
                    return put(key, value);
                 }


                     @Override
                public synchronized Object put(Object key, Object value) {
                    return map.put(key, value);
                }
         */
        prop.setProperty("zemise002","张曼玉");
        prop.setProperty("zemise003","王祖贤");

        //String getProperty(String key):使用此属性列表中指定的键搜素属性
//        System.out.println(prop.getProperty("zemise001"));
//        System.out.println(prop.getProperty("zemise0011"));

        //Set(String〉 stringPropertyNames():从该属性列表中返回一个不可修改的键集,其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for(String key:names){
//            System.out.println(key);
            String values = prop.getProperty(key);
            System.out.println(key + "," + values);
        }




//        System.out.println(prop);

    }
}
