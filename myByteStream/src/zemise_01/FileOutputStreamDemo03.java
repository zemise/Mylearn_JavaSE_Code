package zemise_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据的两个小问题：
        1：字节流写数据如何实现换行呢？
            windows:\r\n
            linux:\n
            mac:\n或者\r
        2：字节流写数据如何实现追加写入呢？
            public FileOutputStream(Stream name, boolean append);
            创建文件输出流以指定的名称写入文件
            如果第二个参数为true，则字节将写入文件的末尾而不是开头

 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos3 = new FileOutputStream("myByteStream/fos3.txt", true);

        //写数据
        for(int i = 0;i <10 ;i++){
            fos3.write("hello".getBytes());
            fos3.write("\r\n".getBytes());
        }

        //释放资源
        fos3.close();
    }

}
