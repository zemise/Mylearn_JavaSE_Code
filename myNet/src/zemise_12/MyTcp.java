package zemise_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
    private ServerSocket server;
    private Socket socket;
    private BufferedReader reader;


    public static void main(String[] args) {
        //创建本类对象
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }

    private void getServer() {
        try {
            //实例化Socket对象
            server = new ServerSocket(10090);
            //输出信息
            System.out.println("服务器套接字已经创建成功");
            while(true) {
                System.out.println("等待客户端的连接");
                //实例化Socket对象
                socket = server.accept();
                //实例化BufferedReader对象
                reader = new BufferedReader(new InputStreamReader(socket
                        .getInputStream()));
                //调用getClientMessage()方法
                getClientMessage();
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void getClientMessage() {
        try {
            while(true) {
                System.out.println("客户端：" + reader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //关闭流
            if (reader != null) {
                reader.close();
            }
            //关闭套接字
            if (socket != null) {
                socket.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
