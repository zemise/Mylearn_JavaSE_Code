package zemise_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class TcpDemo extends JFrame {
    JTextField jTextField01;
    JTextField jTextField02;
    JTextArea jTextArea01;
    JTextArea jTextArea02;
    //定义一个Socket的对象
    Socket client;
    //定义一个状态，返回tcp是否正在连接
    boolean connectState = false;

    //连接按钮
    JButton connect_Button;

    public TcpDemo() {
        super("TCP通讯客户端");
        Container cp = getContentPane();

        //设置布局格式
        setLayout(new FlowLayout(FlowLayout.LEFT));

        //IP地址输入文本框
        JLabel jLabel01 = new JLabel("IP地址：");
        jTextField01 = new JTextField("127.0.0.1", 8);

        //port输入文本框
        JLabel jLabel02 = new JLabel("Port：");
        jTextField02 = new JTextField("10086", 5);

        //消息提示框
        jTextArea01 = new JTextArea(6, 32);

        //消息输入框
        jTextArea02 = new JTextArea(2, 32);
        //开启自动换行
        jTextArea02.setLineWrap(true);


        connect_Button = new JButton("连接");
        JButton button01 = new JButton("确定");
        cp.add(jLabel01);
        cp.add(jTextField01);
        cp.add(jLabel02);
        cp.add(jTextField02);
        cp.add(connect_Button);
        cp.add(jTextArea01);
        cp.add(jTextArea02);
        cp.add(button01);

        connect_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ip = jTextField01.getText();
                String port = jTextField02.getText();
                //ip或port如果为空，提示
                if (ip.equals("") || port.equals("")) {
                    JOptionPane.showMessageDialog(null, "IP或者Port不能为空");
                }
                //连接IP所在服务端，如果连接未成功，返回提示
                //新建一个Socket对象
                try {
                    client = new Socket(ip, Integer.parseInt(port));
                    //提示连接成功，可以发送消息
                    jTextArea01.append("连接成功！" + "\n开始发送消息：");
                    connectState = true;
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "连接失败，请检查IP或Port");
                }
            }
        });


        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //先判断TCP是否已经连接到客户端
                if (connectState == false) {
                    JOptionPane.showMessageDialog(null, "还未连接到客户端，请先连接");
                }else{
                    try {
                        //作为客户端，发送文字给IP所在的服务端
                        //封装jTextArea的文字数据，发送给服务端
                        BufferedReader br = new BufferedReader(new StringReader(jTextArea02.getText()));
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                        String line;
                        while ((line = br.readLine()) != null) {
                            bw.write(line);
                            bw.newLine();
                            bw.flush();

                            //消息提示框内，显示已发送的内容
                            jTextArea01.append("\n客户端发送：" + line);
                        }


                        //结束
//                        client.shutdownOutput();
                        //清空消息输入框
                        jTextArea02.setText("");

                        //接收服务器反馈
//                        BufferedReader server = new BufferedReader(new InputStreamReader(client.getInputStream()));
//                        String data = server.readLine();
//                        jTextArea01.append("\n服务端反馈：" + data);
                        //释放资源
//                        client.close();
//                        server.close();
                    }catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        //窗口在屏幕中间显示
//        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new TcpDemo();
    }
}
