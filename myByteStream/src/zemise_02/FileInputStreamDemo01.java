package zemise_02;

import java.io.FileInputStream;
import java.io.IOException;


/*
    需求：
        把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream：从文件系统中的文件获取输入字节
        FiLeInputStream(String name)：通过打开与实际文件的连接来创建一个FiLeInputStream，
        该文件由文件菜统中的路径名，

    使用字节输入流读数据的步骤：
        1：创建字节输入流对象
        2：调用字节输入流对象的读数据方法
        3：释放资源
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        //创建字节输入流对象
        //FileInputStream(String name)
        FileInputStream fos = null;
        try {
            fos = new FileInputStream("myByteStream/fos.txt");

            //调用字节输入流对象的读取数据方法
            //int read():从该输入流读取一个字节的数据

            /*
            //第一次读取数据
            int read = fos.read();
            System.out.println(read);
            System.out.println((char)read);

            System.out.println("==================");

            //第二次读取数据
            read = fos.read();
            System.out.println(read);
            System.out.println((char)read);

            System.out.println("==================");


            //多读取两次
            read = fos.read();
            System.out.println(read);
            System.out.println((char)read);

            System.out.println("==================");

            read = fos.read();
            System.out.println(read);
            System.out.println((char)read);
            */

            //如果达到文件的末尾：-1

            /*
            int by = fos.read();
            while(by != -1){
                System.out.print((char)by);
                by = fos.read();
            }
            */

            //优化上面的程序
            int by;
            /*
                fos.read();读取数据
                by= fos.read();把读取到的数据赋值给by
                by != -1；判断读取到的数据是否是-1
             */

            while((by = fos.read()) != -1){
                System.out.print((char)by);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
