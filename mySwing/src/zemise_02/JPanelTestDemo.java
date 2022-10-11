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

        //在面板中添加按钮
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p3.add(new JButton("6"));
        p3.add(new JButton("7"));
        p4.add(new JButton("8"));
        p4.add(new JButton("9"));


        //在容器智能鼓添加面板
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);

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
