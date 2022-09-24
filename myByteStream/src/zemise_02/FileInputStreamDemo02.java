package zemise_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求：把文件fos.txt中的内容读取出来在控制台输出

    使用字节输入流读数据的步骤：
        1：创建字节输入流对象
        2：调用字节输入流对象的读数据方法
        3：释放资源
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 1：创建字节输入流对象
        FileInputStream fos = new FileInputStream("myByteStream/fos.txt");

        //2：调用字节输入流对象的读数据方法
        //int read(byte[] b);从该输入流读取做多b.length个字节的数据到一个字节数组

        //解释一下bys为何有数据，因为通过fos.read(bys),把数据放进bys数组了
/*
        byte[] bys = new byte[5];

        //第一次读取数据
        int len = fos.read(bys);
        System.out.println(len);

        //String(byte[] bytes)
        //字节数组变成字符串，而后输出
//        System.out.println(new String(bys));
        System.out.println(new String(bys,0,len));

        System.out.println("=========================");

        //第二次读取数据
        len = fos.read(bys);
        System.out.println(len);
        //String(byte[] bytes)
//        System.out.println(new String(bys));
        System.out.println(new String(bys,0,len));

        System.out.println("=========================");

        //第三次读取数据
        len = fos.read(bys);
        System.out.println(len);

        //String(byte[] bytes)
        //String (byte[] bytes, int offset, int length)
        System.out.println(new String(bys,0,len));

        System.out.println("=========================");
        //第四次读取数据
        len = fos.read(bys);
        System.out.println(len);
*/

        /*
            hello
            \r world

            第一次：hello
            第二次：\r
                    worl
            第三次：d
                    worl


            实际上这里，存在字节数组的替换，fos.txt里没有字符后，不足以替换，就会数组中未被替换的就会输出

            所以上方的len是指的实际读到的字符数目，没被替换的不会被算作内

         */

        byte[] bys = new byte[1024];//1024及其整数倍
        int len;
        while((len = fos.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }



        //3：释放资源
        fos.close();
    }
}
