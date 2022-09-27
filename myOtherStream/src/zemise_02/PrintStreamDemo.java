package zemise_02;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    打印流的特点：
        只负责输出数据，不负责读取数据
        有自己的特有方法
     字节打印流:
        PrintStream (String fileName)：使用指定的文件名创建新的打印流
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream (String fileName)：使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream("myOtherStream/ps.txt");

        //写数据
        //字节流输出流有的方法
//        ps.write(97);

        //使用特有方法写数据
        //这个会自己转码
        ps.print(97);
        ps.println();
        ps.print(98);
        ps.println();
        ps.println(97);

        //释放资源
        ps.close();
    }
}
