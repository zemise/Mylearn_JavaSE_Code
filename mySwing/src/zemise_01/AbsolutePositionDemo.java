package zemise_01;

import javax.swing.*;
import java.awt.*;

public class AbsolutePositionDemo extends JFrame {
    //设置该窗体的标题
    public AbsolutePositionDemo(){
        //设置该窗体的标题
        super("本窗体使用绝对布局");
//        setTitle("窗体使用绝对布局");
        //使该窗体取消布局管理器设置
        setLayout(null);

        //绝对定位窗体的位置和大小
        setBounds(0,0,200,150);
        //创建容器对象
        Container container = getContentPane();
        //创建按钮
        JButton button1 = new JButton("按钮1");
        JButton button2 = new JButton("按钮2");
        //设置按钮的位置和大小
        button1.setBounds(10,30,80,30);
        button2.setBounds(10,100,100,20);
        //将按钮添加到容器中
        container.add(button1);
        container.add(button2);
        //使窗体可见
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePositionDemo();
    }
}
