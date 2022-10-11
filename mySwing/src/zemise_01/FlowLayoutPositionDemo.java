package zemise_01;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPositionDemo extends JFrame {
    public FlowLayoutPositionDemo() {
        //设置窗体标题
        setTitle("本窗体使用流布局管理器");
        Container c = getContentPane();
        //设置窗体使用流布局管理器，使用组件右对齐
        //并设置组件之间的水平间隔和垂直间距
        setLayout(new FlowLayout(2,20,10));
        //在容器中循环添加10个按钮
        for(int i = 0;i<10;i++){
            c.add(new JButton("button" + i));
        }
        //设置窗体大小
        setSize(300,200);
//        setBounds(0,0,300,200);
        //设置窗体可见
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPositionDemo();
    }
}
