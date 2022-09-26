package zemise_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
    需求：
        把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素

    思路：
        1：创建字符缓冲输入流对象
        2：创建ArrayList集合对象
        3：调用字符缓冲输入流对象的方法读数据
        4：把读取到的字符串数据存储到集合中
        5：释放资源
        6：遍历集合
 */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //1：创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream/arrayList.txt"));

        //2：创建ArrayList集合对象
        ArrayList<String> arrayList = new ArrayList<>();

        //3：调用字符缓冲输入流对象的方法读数据
/*        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            //4：把读取到的字符串数据存储到集合中
            String s = new String(chs, 0, len);
            arrayList.add(s);
        }*/

        String line;
        while((line = br.readLine()) != null){
            arrayList.add(line);
        }

        //5：释放资源
        br.close();

        //6：遍历集合
        for(String s:arrayList){
            System.out.println(s);
        }
    }
}
