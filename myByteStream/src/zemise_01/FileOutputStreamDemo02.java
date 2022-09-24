package zemise_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
    构造方法：
        FiLeOutputStream (String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream (File file)创建文件输出流以写入由指定的 FiLe对象表示的文件
    写数据的三种方式：
        void write (int b)：将指定的字节写入此文件输出流
        一次写一个字节数据
        void write (byte[] b)：将 b。Length字节从指定的字节数组写入此文件输出流
        一次写一个字节数组数据
        void write (byte[] b， int off， int Len)：将 Len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流一次写一个字节数组的部分数据
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //FiLeOutputStream (String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fox2 = new FileOutputStream("myByteStream/fox2.txt");
        //new File(name)
//        FileOutputStream fox2 = new FileOutputStream(new File("myByteStream/fox2.txt"));

        //FileOutputStream (File file)创建文件输出流以写入由指定的 FiLe对象表示的文件
//        File file = new File("myByteStream/fox2.txt");
//        FileOutputStream fox3 = new FileOutputStream(file);
//        FileOutputStream fox3 = new FileOutputStream(new File("myByteStream/fox2.txt"));

        //void write (int b)：将指定的字节写入此文件输出流
//        fox2.write(97);
//        fox2.write(98);
//        fox2.write(99);
//        fox2.write(100);
//        fox2.write(101);

        // void write (byte[] b)：将 b。Length字节从指定的字节数组写入此文件输出流
//        byte[] bys = {97, 98, 99, 100, 101};
        //byte[] getBytes();返回字符串对应的字节数组
        byte[] bys = "abcdef".getBytes(StandardCharsets.UTF_8);
//        fox2.write(bys);

        // void write (byte[] b， int off， int Len)：将 Len字节从指定的字节数组开始，
        //      从偏移量off开始写入此文件输出流一次写一个字节数组的部分数据
        fox2.write(bys,1, 3);

        //释放资源
        fox2.close();
    }
}
