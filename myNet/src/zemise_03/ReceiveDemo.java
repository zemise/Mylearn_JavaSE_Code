package zemise_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        ////创建发送端的Socket对象 (DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10086);
        while (true) {
            //创建一个数据包，用于接收数据
            //DatagramPacket (byte[] buf, int Length) 构造一个 DatagramPacket用于接收长度为 Length数据包
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);

            System.out.println("接收的信息为：" + new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端
//        ds.close();
    }
}
