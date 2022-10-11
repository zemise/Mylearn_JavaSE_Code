package zemise_01;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPositionDemo extends JFrame {
    //定义组件摆放位置的数组
    String[] border = {BorderLayout.CENTER, BorderLayout.NORTH,
            BorderLayout.SOUTH, BorderLayout.EAST,
            BorderLayout.WEST};
    String[] buttonName = {"center button", "north button",
            "south button", "east button",
            "west button"};

    public BorderLayoutPositionDemo() {
        setTitle("这个窗体使用边界布局管理器");
        //定义一个容器
        Container c = getContentPane();
        //设置容器为边界布局管理器
        setLayout(new BorderLayout());
        for (int i = 0; i < border.length; i++) {
            //在容器中添加按钮，并设置按钮布局
            c.add(border[i], new JButton(buttonName[i]));
        }
        //设置窗体大小
        setSize(350,200);
        //设置窗体可见
        setVisible(true);
        //设置窗体的关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPositionDemo();
    }
}
