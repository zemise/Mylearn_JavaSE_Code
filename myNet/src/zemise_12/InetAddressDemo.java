package zemise_12;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        //创建InetAddress对象
        InetAddress ip;
        try {
            //实例化对象
            ip = InetAddress.getLocalHost();
            //获取本机名
            String hostName = ip.getHostName();
            //获取本机IP地址
            String hostAddress = ip.getHostAddress();

            System.out.println("本机名" + hostName);
            System.out.println("本机IP地址" + hostAddress);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
