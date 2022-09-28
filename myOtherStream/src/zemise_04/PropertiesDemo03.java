package zemise_04;

import java.util.Properties;

/*
    Properties和IO流结合的方法:
        void Load (Reader reader);
            从输入字符流读取属性列表（键和元素对）

        void store (writer writer, String comments):
            将此属性列表（键和元素对）写入此 Properties表中,以适合使用 Load(Reader)方法的格式写入输出字符流
 */
public class PropertiesDemo03 {
    public static void main(String[] args) {
        //把集合中的数据保存到文件中
        myStore();
        //把文件中的数据加载到集合


    }

    private static void myStore() {
        Properties prop = new Properties();
        prop.setProperty("zemise001","林青霞");
        prop.setProperty("zemise002","张曼玉");
        prop.setProperty("zemise003","王祖贤");


    }
}
