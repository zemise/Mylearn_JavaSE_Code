package zemise_04;

import javax.annotation.processing.Filer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    Properties和IO流结合的方法:
        void Load (Reader reader);
            从输入字符流读取属性列表（键和元素对）

        void store (Writer writer, String comments):
            将此属性列表（键和元素对）写入此 Properties表中,以适合使用 Load(Reader)方法的格式写入输出字符流
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件中
        myStore();
        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("myOtherStream/fw.txt");

        //void Load (Reader reader);
        prop.load(fr);
        fr.close();
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("zemise001","林青霞");
        prop.setProperty("zemise002","张曼玉");
        prop.setProperty("zemise003","王祖贤");

        //void store (Writer writer, String comments):
        FileWriter fw = new FileWriter("myOtherStream/fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
