package zemise_09;

import javax.swing.*;
import java.awt.*;

public class SwingDemo01 extends JFrame {
    final private String[] list = {"红", "蓝"};

    public SwingDemo01() {
        super("本章实践练习01");
        Container cp = getContentPane();
        setLayout(new GridLayout(2,1));

        //创建一个JPanel用于放置下拉状态栏
        JPanel jp1 = new JPanel();
        //创建一个JPanel用于放置复选框
        JPanel jp2 = new JPanel();


        jp1.setLayout(new BorderLayout());
        //创建下拉状态栏
        JComboBox<String> jComboBox = new JComboBox<>(list);
        jp1.add(jComboBox);



        jp2.setLayout(null);
        //创建复选框
        JCheckBox jcb01 = new JCheckBox("男");
        JCheckBox jcb02 = new JCheckBox("女");

        //创建两个单击按钮
        JButton button01 = new JButton("确定");
        JButton button02 = new JButton("取消");


        jp2.add(jcb01);
        jp2.add(jcb02);
        jp2.add(button01);
        jp2.add(button02);

        jcb01.setBounds(70, 10, 50, 30);
        jcb02.setBounds(150, 10, 50, 30);

        button01.setBounds(40, 40, 100, 40);
        button02.setBounds(150, 40, 100, 40);

        cp.add(jp1);
        cp.add(jp2);

        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingDemo01();
    }
}
