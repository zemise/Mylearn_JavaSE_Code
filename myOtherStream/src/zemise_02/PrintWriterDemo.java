package zemise_02;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
    字符打印流的构造方法:
        PrintWriter (string fiLeName):使用指定的文件名创建一个新的PrintWriter,而不需要自动执行行刷新

        PrintWriter (writer out, boolean autoFlush):创建一个新的PrintWriter
        out:字符输出流
        autoFlush:一个布尔值,如果为真,则println, printf,或format方法将刷新输出缓冲区
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter (string fiLeName):使用指定的文件名创建一个新的PrintWriter,而不需要自动执行行刷新
//        PrintWriter pw = new PrintWriter("myOtherStream/pw.txt");

//        pw.write("hello");
//        pw.write("\r");
//        pw.flush();
//        pw.write("world");
//        pw.write("\r");
//        pw.flush();

//        pw.println("hello");
        /*
            pw.write("hello");
            pw.write("\r");
         */
//        pw.flush();
//        pw.println("world");
//        pw.flush();

        //PrintWriter (writer out, boolean autoFlush):创建一个新的PrintWriter
//        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream/pw.txt"),true);
        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream/pw.txt"),false);
        pw.println("hello");
        pw.println("world");

        pw.close();



    }
}
