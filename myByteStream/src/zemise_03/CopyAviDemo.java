package zemise_03;


import java.awt.*;
import java.io.*;

/*
    需求：
        把"myByteStream/字节流复制图片.avi"复制到模块目录下的 字节流复制图片.avi

    思路：
        1：根据数据源创建字节输入流对象
        2：根据目的地创建字节输出流对象
        3：读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        4：释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间
        1：基本字节流一次读写一个字节
        2：基本字节流一次读写一个字节数组
        3：字节缓冲流一次读写一个字节
        4：字节缓冲流一次读写一个字节数组
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //开始记录时间
        long startTime = System.currentTimeMillis();

        //1：根据数据源创建字节输入流对象
        FileInputStream avi = new FileInputStream("myByteStream/字节流复制图片.avi");

        //2：根据目的地创建字节输出流对象
        FileOutputStream copyAvi = new FileOutputStream( "myByteStream/src/字节流复制图片.avi");

        BufferedInputStream bAvi = new BufferedInputStream(avi);
        BufferedOutputStream bCopyAvi = new BufferedOutputStream(copyAvi);



        //3：读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        //四种方式实现复制视频，并记录每种方式复制视频的时间
        //一：基本字节流一次读写一个字节---------------179毫秒
/*        int by;
        while((by = avi.read()) != -1){
            copyAvi.write(by);
        }*/

        //二：基本字节流一次读写一个字节数组---------------1毫秒
/*
        byte[] bys = new byte[1024];
        int len;
        while((len = avi.read(bys)) != -1){
            copyAvi.write(bys,0,len);
        }
*/

        //三：字节缓冲流一次读写一个字节---------------4毫秒
/*        int by;
        while((by = bAvi.read()) != -1){
            bCopyAvi.write(by);
        }*/

        //四：字节缓冲流一次读写一个字节数组---------------0毫秒
        byte[] bys = new byte[1024];
        int len;
        while((len = bAvi.read(bys)) != -1){
            bCopyAvi.write(bys,0,len);
        }

        //4：释放资源
        avi.close();
        copyAvi.close();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }
}
