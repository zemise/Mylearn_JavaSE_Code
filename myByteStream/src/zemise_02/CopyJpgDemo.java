package zemise_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        把"myByteStream/xxn.jpg"复制到模块目录下的"myByteStream/src/xxn.jpg"

    思路：
        1：根据数据源创建字节输入流对象
        2：根据目的地创建字节输出流对象
        3：读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        4：释放资源
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {

        //1：根据数据源创建字节输入流对象
        FileInputStream jpg = new FileInputStream("myByteStream/xxn.jpg");
        //2：根据目的地创建字节输出流对象
        FileOutputStream copyJpg = new FileOutputStream("myByteStream/src/xxn.jpg");

        //3：读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
/*

        int by;
        while((by = jpg.read()) != -1){
            copyJpg.write(by);
        }
*/

        byte[] bys = new byte[1024];
        int length;
        while((length = jpg.read(bys))!= -1){
            copyJpg.write(bys,0,length);
        }


        //4：释放资源
        jpg.close();
        copyJpg.close();


    }
}
