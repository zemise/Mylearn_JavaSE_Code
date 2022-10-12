package zemise_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpServerDemo extends JFrame {
    JTextField textField_IP;
    JTextField textField_Port;
    JTextArea jTextArea_Messages;
    JTextArea jTextArea_Input;
    JButton connect_Button;
    JButton send_Button;

    static String ip = null;
    ServerSocket server;
    Socket client;
    BufferedReader br;
    BufferedWriter bw;

    public TcpServerDemo() {
        super("Tcp通讯服务端");
        Container cp = getContentPane();
        //定义布局
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel label_IP = new JLabel("IP地址：");
        JLabel label_Port = new JLabel("Port：");

        //获取本机IP，并填入文本框
        textField_IP = new JTextField(getIP(), 10);
        textField_Port = new JTextField("10086", 5);

        //消息提示框
        jTextArea_Messages = new JTextArea(6, 32);
        JScrollPane jScrollPane = new JScrollPane(jTextArea_Messages);

        //消息输入框
        jTextArea_Input = new JTextArea(2, 32);
        //开启自动换行
        jTextArea_Input.setLineWrap(true);

        connect_Button = new JButton("启动");
        send_Button = new JButton("确定");

        cp.add(label_IP);
        cp.add(textField_IP);
        cp.add(label_Port);
        cp.add(textField_Port);
        cp.add(connect_Button);
        cp.add(jScrollPane);
        cp.add(jTextArea_Input);
        cp.add(send_Button);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        //窗口在屏幕中间显示
        this.setLocationRelativeTo(null);


        int port = Integer.parseInt(textField_Port.getText());

        try {
            //开启服务端，返回提示
            //实例化ServerSocket对象
            server = new ServerSocket(port);
            jTextArea_Messages.append("服务端已开启，等待客户端连接\n");

            //消息文本框中，输出客户端发来的消息
            client = server.accept();
            String line;
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));

            while (true) {
                line = br.readLine();
                jTextArea_Messages.append("客户端消息：" + line + "\n");




            }
        } catch (IOException ex) {
            ex.printStackTrace();
            jTextArea_Messages.append("\n连接失败，请检查IP或者Port");
        }

        send_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //发回消息
                    BufferedReader br_in = new BufferedReader(new StringReader(jTextArea_Input.getText()));
                    BufferedWriter bw_in = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                    String line;
                    while ((line = br_in.readLine()) != null) {
                        bw_in.write(line);
                        bw_in.newLine();
                        bw_in.flush();
                    }
                    jTextArea_Input.setText("");
                }catch (IOException es){
                    es.printStackTrace();
                }
            }
        });
    }

    //定义一个方法，获取本机IP
    public static String getIP() {

        try {
            InetAddress localHost = InetAddress.getLocalHost();
            ip = localHost.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ip;
    }

    public static void main(String[] args) {
        new TcpServerDemo();
    }
}
