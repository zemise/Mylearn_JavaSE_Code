package zemise_03;

import java.io.*;

/*
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1：根据数据源创建字符输入流对象
        2：根据目的地创建字符输出流对象
        3：读写数据，复制文件
        4：释放资源
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //1：根据数据源创建字符输入流对象
        InputStreamReader irs = new InputStreamReader(new FileInputStream("myCharStream/src/zemise_02/ConversionStreamDemo.java"));
        //2：根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream/src/zemise_03/Copy.java"));
        //3：读写数据，复制文件
        char[] chs = new char[1024];
        int len;
        while ((len = irs.read(chs)) != -1) {
            osw.write(chs);
        }


        //4：释放资源
        irs.close();
        osw.close();
    }
}
