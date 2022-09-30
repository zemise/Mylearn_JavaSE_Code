package zemise_08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务端: 接收到的数据写入文本文件(同时，也还是在控制台也输出)
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {

        //创建服务器ServerSocket对象
        ServerSocket ss = new ServerSocket(12000);

        //监听客户端连接，返回一个对应socket对象
        Socket s = ss.accept();

        //将字节输入流，转为流字符输入流
        InputStreamReader is = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(is);

        //创建File对象
        File tcp = new File("myNet/tcp.txt");
        if (!tcp.exists()) {
            tcp.createNewFile();
        }

        FileWriter fw = new FileWriter(tcp);
        BufferedWriter bw = new BufferedWriter(fw);


        String line;
        while ((line = br.readLine()) != null) {
            //将获得的信息输出到控制台
            System.out.println("接收到的数据：" + line);
            //将信息写入到文件
            bw.write(line);
            bw.newLine();
            bw.flush();

            //给出反馈，这部分可有可无
            OutputStream os = s.getOutputStream();
            os.write("已收到信息".getBytes());

        }

        //释放资源
        ss.close();
        fw.close();
    }
}
