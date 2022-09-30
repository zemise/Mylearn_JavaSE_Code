package zemise_09;

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
        BufferedReader br = new BufferedReader(new FileReader("myNet/tcp02.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();

        }

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //public void shutdown()
        s.shutdownOutput();


        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

        System.out.println("服务器的反馈: " + brClient.readLine());

        //释放资源
        s.close();
    }
}
