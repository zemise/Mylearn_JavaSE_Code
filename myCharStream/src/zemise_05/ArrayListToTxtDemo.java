package zemise_05;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：
        把ArrayList集合中的字符串数据写入到文本文件。要求：每一个字符串元素作为文件中的一行数据

    思路：
        1：创建ArrayList集合
        2：往集合中存储字符串元素
        3：创建字符缓冲输出流对象
        4：遍历集合，得到每一个字符串数据
        5：调用字符缓冲输出流对象的方法写数据
        6：释放资源
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //1：创建ArrayList集合
        ArrayList<String> arrayList = new ArrayList<>();
        //2：往集合中存储字符串元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //3：创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream/arrayList.txt"));

        //4：遍历集合，得到每一个字符串数据
        for(String str:arrayList){
            //5：调用字符缓冲输出流对象的方法写数据
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        //6：释放资源
        bw.close();
    }
}
