package zemise_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/*
    需求：
        把"myByteStream/src/test01.txt"复制到模块目录下的“myByteStream/test02.txt”

        数据源：

            "myByteStream/src/test01.txt"--—读数据 --- InputStream FileInputStream
        目的地：
            “myByteStream/test02.txt”---写数据 --- OutputStream FileOutputStream
    思路：
        1：根据数据源创建字节输入流对象
        2：根据目的地创建字节输出流对象
        3：读写数据，复制文本文件（一次读取一个字节，一次写入一个字节)
        4：释放资源
 */
public class CopyTextDemo {
    public static void main(String[] args) throws IOException {


        //1：根据数据源创建字节输入流对象
        FileInputStream test01 = new FileInputStream("myByteStream/src/test01.txt");

        //2：根据目的地创建字节输出流对象
        FileOutputStream test02 =new FileOutputStream("myByteStream/test02.txt");

        //3：读写数据，复制文本文件（一次读取一个字节，一次写入一个字节)
        int by;
        while((by = test01.read()) != -1){
            test02.write(by);
        }
        //4：释放资源
        test01.close();
        test02.close();

    }
}
