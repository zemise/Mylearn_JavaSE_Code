package zemise_02;

import javax.swing.*;
import java.awt.*;

public class JPanelTestDemo extends JFrame {
    public JPanelTestDemo() {
        Container c = getContentPane();
        //设置整个容器为2行1列的网格布局
        c.setLayout(new GridLayout(2,1,10,10));
        //初始化一个面板，设置1行3列的网格布局
        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
        //初始化一个面板，设置1行2列的网格布局
        JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
        //初始化一个面板，设置1行2列的网格布局
        JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
        //初始化一个面板，设置2行1列的网格布局
        JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));


        setTitle("这个窗体中使用列面板");
        //设置窗体大小
        setSize(300,200);
        //设置窗体可见
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTestDemo();
    }
}
