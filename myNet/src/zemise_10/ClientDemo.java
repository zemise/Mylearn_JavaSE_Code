package zemise_10;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.0.116", 10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("my/tcp02.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //结束
        s.shutdownOutput();

        //接收Socket反馈
        BufferedReader brServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //读取的反馈数据
        String data = br.readLine();
        System.out.println("服务器反馈：" + data);

        //释放资源
        s.close();
        br.close();
    }
}
