package zemise_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;

public class Receive extends JFrame implements Runnable, ActionListener {
    //定义端口
    int port = 10086;
    //声明IntAddress对象
    InetAddress group = null;
    //声明多点广播套接字对象
    MulticastSocket socket = null;
    //创建按钮对象
    JButton ince = new JButton("开始接收");
    JButton stop = new JButton("停止接收");

    //显示接收广播的文本域
    JTextArea inceAr = new JTextArea(10, 10);
    JTextArea inced = new JTextArea(10, 10);

    //创建Thread对象
    Thread thread;
    //创建boolean对象
    boolean state = false;

    //构造方法
    public Receive() {
        //调用父类方法，显示标题
        super("广播数据报");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);

        //绑定按钮ince的单击事件
        ince.addActionListener(this);
        //绑定按钮stop的单击事件
        stop.addActionListener(this);

        //指定文本域中文字的颜色
        inceAr.setForeground(Color.BLUE);

        //创建Jpanel对象
        JPanel north = new JPanel();

        //将按钮添加到面板north上
        north.add(ince);
        north.add(stop);

        //将north放在窗体的上部
        add(north, BorderLayout.NORTH);

        //创建面板对象center
        JPanel center = new JPanel();
        //设置面板布局
        center.setLayout(new GridLayout(1, 2));
        //将文本域添加到面板上
        center.add(inceAr);
        center.add(inced);
        //设置面板布局
        add(center, BorderLayout.CENTER);
        //刷新
        validate();
        port = 10086;
        try {
            //指定接受地址
            group = InetAddress.getByName("127.0.0.1");
            //绑定多点广播套接字
            socket = new MulticastSocket(port);
            //加入广播组
//        socket.joinGroup(Group);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //设置布局
        setBounds(100, 50, 360, 380);
        //设置窗体为显示状态
        setVisible(true);
    }

    //run()方法
    @Override
    public void run() {
        while(true){
            //创建byte数组
            byte[] data = new byte[1024];
            //创建DatagramPacket对象
            DatagramPacket packet = null;
            //待接收的数据包
            packet = new DatagramPacket(data, data.length,group,port);

            try {
                //接受数据包
                socket.receive(packet);
                //获取数据包中的内容
                String message = new String(packet.getData(), 0, packet.getLength());
                //将接收内容显示在文本域中
                inceAr.setText("正在接收的内容：\n" + message);
                //每条信息为一行
                inced.append(message + "\n");
            }catch (Exception e){
                e.printStackTrace();
            }

            //当变量等于true时，退出循环
            if(state= true){
                break;
            }
        }
    }

    //单机事件
    @Override
    public void actionPerformed(ActionEvent e) {
        //单机按钮ince触发的事件
        if(e.getSource() == ince){
            //设置按钮的颜色
            ince.setBackground(Color.RED);
            stop.setBackground(Color.yellow);

            //如果线程不处于“新建状态”
            if(!thread.isAlive()){
                //实例化Thread对象
                thread = new Thread(this);
            }
            //启动线程
            thread.start();
            //设置变量值
            state = false;
        }

        //单击按钮stop触发的事件
        if(e.getSource() == stop){
            //设置按钮颜色
            ince.setBackground(Color.RED);
            stop.setBackground(Color.yellow);
            //设置变量值
            state = true;

        }

    }

    public static void main(String[] args) {
        Receive receive = new Receive();

    }
}
