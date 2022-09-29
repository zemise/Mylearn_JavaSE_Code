package zemise_03;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
    UDP发送数据：
        数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {

        //创建发送端的Socket对象(DatagramSocket）
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null){
            //输入的数据是886，发送数据结束
            if(line.equals("886")){
                break;
            }
            //创建数据，并把数据打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.107"), 10086);

            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);
        }
        System.out.println("发送消息结束，欢迎下次使用");
        //关闭发送端
        ds.close();
    }
}
