package zemise_01;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPositionDemo extends JFrame {
    public GridLayoutPositionDemo() {
        Container c = getContentPane();
        //设置容器使用网格布局管理器，设置7行3列的网格
        setLayout(new GridLayout(7, 3, 5, 5));

        for (int i = 0; i < 20; i++) {
            //循环添加按钮
            c.add(new JButton("button" + i));
        }

        setSize(300,300);
        setTitle("这是一个使用网格布局管理器的窗体");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPositionDemo();
    }
}
