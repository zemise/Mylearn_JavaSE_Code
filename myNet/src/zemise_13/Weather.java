package zemise_13;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

//创建类，该类为多线程执行程序
public class Weather extends Thread{
    String weather = "节目预报：\n八点有大型晚会，请收听";
    //定义端口
    int port =10086;
    //创建InetAddress对象
    InetAddress address = null;
    //声明多点广播套接字
    MulticastSocket socket = null;


    //构造方法
    Weather(){
        try {
            //实例化InetAddress，指定地址
            address = InetAddress.getByName("127.0.0.1");
            //实例化多点广播套接字
            socket = new MulticastSocket(port);
            //指定发送范围是本地网络
            socket.setTimeToLive(1);
            //加入广播组
//            socket.joinGroup(address);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //run()方法
    public void run(){
        while(true) {
            //声明DatagramPacket对象
            DatagramPacket packet = null;
            //声明字节数组
            byte data[] = weather.getBytes();
            //将数据打包
            packet = new DatagramPacket(data, data.length, address, port);
            //将广播信息输出
            System.out.println(new String(data));

            try {
                //发送数据
                socket.send(packet);
                //线程休眠
                sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //创建本类对象
        Weather w = new Weather();
        w.start();
    }
}
