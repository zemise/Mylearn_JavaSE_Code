package zemise_04;

import java.io.*;

/*
    字符缓冲流：
    BufferedWriter：将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以指定缓冲区大小，或者
    BufferedReader：从字行输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取，可以指定缓冲区大小，或者可以使用

    构造方法：
    BufferedWriter(Writer out)
    BufferedReader(Reader in)
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //BufferedReader(Reader in)
        BufferedReader br = new BufferedReader(new FileReader("myCharStream/src/zemise_02/ConversionStreamDemo.java"));
        //BufferedWriter(Writer out)
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream/Copy.java"));

        char[] chs = new char[1028];
        int len;
        while((len = br.read(chs)) != -1){
            //这里String就是一个类，这里用的是构造方法
            //光写一个chs就是把整个chs打印，后面加两个参数是打印其中一部分
            //offset是索引开始
            bw.write(new String(chs,0,len));
        }

        br.close();
        bw.close();

    }

}
