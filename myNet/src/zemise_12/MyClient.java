package zemise_12;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

//创建类继承JFrame类
public class MyClient extends JFrame {
    //声明PrintWriter类对象
    private PrintWriter writer;
    //声明socket对象
    Socket socket;
    //创建JTextArea对象
    private JTextArea ta = new JTextArea();
    //创建JTextFiled对象
    private JTextField tf = new JTextField();
    //声明Container对象
    Container cc;

    //构造方法
    public MyClient(String title) {
        //调用父类的构造方法
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //实例化对象
        cc = this.getContentPane();
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        //将文本框放在窗体的下部
        cc.add(tf, "South");
        tf.addActionListener(new ActionListener() {
            //绑定事件
            public void actionPerformed(ActionEvent e) {
                //将文本框中的信息写入流
                writer.print(tf.getText());
                //将文本框中的信息显示在文本域中
                ta.append(tf.getText() + "\n");
                ta.setSelectionEnd(ta.getText().length());
                //将文本框清空
                tf.setText("");
            }
        });


    }

    //连接套接字方法
    private void connect() {
        //文本域中提示信息
        ta.append("尝试连接\n");
        try {
            //实例化Socket对象
            socket = new Socket("127.0.0.1", 8990);
            writer = new PrintWriter(socket.getOutputStream(), true);
            ta.append("完成连接\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        MyClient client = new MyClient("向服务器发送数据");
        client.setSize(200, 200);
        client.setVisible(true);
        client.connect();

    }


}
