package zemise_08;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于文件，把数据传输到服务端
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s = new Socket("192.168.0.116", 12000);

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //数据来自于文件，封装文本文件的数据
        BufferedReader br  = new BufferedReader(new FileReader("myNet/tcp02.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();

            //获取输入流，读数据
            InputStream is = s.getInputStream();
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            System.out.println(new String(bys, 0, len));
        }
        //释放资源
//        s.close();
    }
}
