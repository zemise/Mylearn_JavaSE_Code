package zemise_06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务端：接收数据
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(12000);

        //监听客户端，返回对应的Socket对象
        Socket s = ss.accept();

        //获取输入流，读取数据，并显示在控制台
//            InputStream is = s.getInputStream();
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("接收的信息：" + line);
            //给出反馈
            OutputStream os = s.getOutputStream();
            os.write("服务器已收到信息：".getBytes());
        }

//        while(true) {
//            byte[] bys = new byte[1024];
//            int len = is.read(bys);
//            System.out.println("接收的信息：" + new String(bys, 0, len));

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("服务器已收到信息：".getBytes());

        //释放资源
//        ss.close();
    }
}
