package zemise_02;

import java.io.*;

/*
    需求：
        把模块目录下的PrintStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1：根据数据源创建字符输入流对象
        2：根据目的地创建字符输出流对象
        3：读写数据，复制文件
        4：释放资源
 */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        /*
        //1：根据数据源创建字符输入流对象
        BufferedReader bis = new BufferedReader(new FileReader("myOtherStream/src/zemise_02/PrintStreamDemo.java"));

        //2：根据目的地创建字符输出流对象
        BufferedWriter bos = new BufferedWriter(new FileWriter("myOtherStream/Copy.java"));

        //3：读写数据，复制文件
        String line;
        while((line = bis.readLine())!= null){
            bos.write(line);
            bos.newLine();
            bos.flush();
        }

        bis.close();
        bos.close();
*/

        //1：根据数据源创建字符输入流对象
        BufferedReader bis = new BufferedReader(new FileReader("myOtherStream/src/zemise_02/PrintStreamDemo.java"));

        //2：根据目的地创建字符输出流对象
        //采用打印流
        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream/Copy.java"),true);

        //3：读写数据，复制文件
        String line;
        while((line = bis.readLine())!= null){
            pw.println(line);
        }
        //释放资源
        bis.close();
        pw.close();
    }
}
