package zemise_10;

import javax.swing.*;
import java.awt.*;

public class TcpDemo extends JFrame {
    public TcpDemo() {
        super("TCP通讯");
        Container cp = getContentPane();

        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel jLabel01 = new JLabel("IP地址：");
        JTextField jTextField01 = new JTextField("",10);

        JLabel jLabel02 = new JLabel("Port：");
        JTextField jTextField02 = new JTextField("",10);

        JTextArea jTextArea = new JTextArea(4,30);

        JButton button = new JButton("确定");
        cp.add(jLabel01);
        cp.add(jTextField01);
        cp.add(jLabel02);
        cp.add(jTextField02);
        cp.add(jTextArea);
        cp.add(button);



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        setResizable(false);
        //窗口在屏幕中间显示
//        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new TcpDemo();
    }
}
