package zemise_10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
 */
public class ServerDemo implements Runnable{
    @Override
    public void run(){
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);

        //接收
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //创建文本对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet/tcp.txt"));

        //接收到的数据，写入文本
        String line;
        while((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        ss.close();
        bw.close();
    }
}
