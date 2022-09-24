package zemise_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
/*        try {
            FileOutputStream fos4 = new FileOutputStream("myByteStream/fos4.txt");
            fos4.write("hello".getBytes());
            fos4.close();
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //加入finally来实现释放资源
        FileOutputStream fos4 =null;
        try {
//            fos4 = new FileOutputStream("/test/myByteStream/fos4.txt");
            fos4 = new FileOutputStream("myByteStream/fos4.txt");
            fos4.write("hello".getBytes());
            fos4.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos4 != null) {
                try {
                    fos4.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
