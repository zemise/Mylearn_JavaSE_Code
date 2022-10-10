package zemise_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowStateListener;

public class ExampleDemo extends JFrame {
    public void CreateJFrame(String title){
        //实例化一个JFrame对象
        JFrame jf = new JFrame(title);
        //获取一个容器
        Container container = jf.getContentPane();
        //创建一个JLabel标签
        JLabel jl = new JLabel("这是一个JFrame窗体");
        //使标签上的文字居中
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        //使标签添加到容器中
        container.add(jl);
        //设置容器的背景颜色
        container.setBackground(Color.white);
        //使窗体可视
        jf.setVisible(true);
        //设置窗体的大小
        jf.setSize(200,150);
        //设置窗体关闭方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ExampleDemo().CreateJFrame("创建一个JFrame窗体");
    }
}
