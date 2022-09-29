package zemise_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类表示Internet协议（IP） 地址

    public static InetAddress getByName (String host):确定主机名称的Ip地址.主机名称可以是机器名称,也可以是Ip地址
    public String getHostName():获取此Ip地址的主机名
    public String getHostAddress ():返回文本显示中的ip地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName (String host):确定主机名称的Ip地址.主机名称可以是机器名称,也可以是Ip地址
//        InetAddress address = InetAddress.getByName("xiaowangdeMBP-2");
        InetAddress address = InetAddress.getByName("192.168.43.**");


        //public String getHostName():获取此Ip地址的主机名
        String hostName = address.getHostName();

        //public String getHostAddress ():返回文本显示中的ip地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + hostName);
        System.out.println("ip地址：" + ip);

    }
}
