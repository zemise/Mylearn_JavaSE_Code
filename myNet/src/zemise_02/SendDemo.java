package zemise_02;

import java.net.*;

/*
    UDP发送数据的步骤
        1：创建发送端的Socket对象 (DatagramSocket)
        2：创建数据，并把数据打包
        3：调用DatagramSocket对象的方法发送数据
        4：关闭发送端
 */
public class SendDemo {
    public static void main(String[] args) throws SocketException, UnknownHostException {

        //创建发送端的Socket对象 (DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //2：创建数据，并把数据打包
        // DatagramPacket (byte[] buf， int Length， InetAddress address， int port)
        // 构造一个数据包，发送长度为 Length的数据包到指定主机上的指定端口号。
        byte[] bys = "hello,udp,我来了".getBytes();
        int length = bys.length;
        InetAddress ip = InetAddress.getByName("192.168.43.48");

//        DatagramPacket

        //3：调用DatagramSocket对象的方法发送数据
        //void send (DatagramPacket p) 从此套接字发送数据报包
        ds.send(dp);

        //4：关闭发送端
        //void close (）关闭此数据报套接字
        ds.close();

    }
}
