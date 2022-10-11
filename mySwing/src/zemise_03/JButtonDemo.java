package zemise_03;

import zemise_01.MyImageIcon;
import zemise_02.JPanelTestDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JButtonDemo extends JFrame {
    public JButtonDemo() {
        URL url = MyImageIcon.class.getResource("icons8-done.png");
        ImageIcon Icon = new ImageIcon(url);
        //设置网络布局管理器
        setLayout(new GridLayout(3, 2, 5, 5));
        //创建容器
        Container c = getContentPane();

        for (int i = 0; i < 5; i++) {
            //创建按钮，同时设置按钮文字与图标
            JButton button = new JButton("button" + i, Icon);
            //在容器内添加按钮
            c.add(button);

            //设置其中一些按钮不可用
            if (i % 2 == 0) {
                button.setEnabled(false);
            }
        }

        //实例化一个没有文字和图片的按钮
        JButton jb = new JButton();
        //设置按钮与图片相同大小
        jb.setMaximumSize(new Dimension(90,30));
        jb.setIcon(Icon);
        jb.setHideActionText(true);
        //设置按钮提示为文字
        jb.setToolTipText("图片按钮");
        //设置按钮边界不显示
        jb.setBorderPainted(false);

        //为按钮添加监听事件
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹出确认对话框
                JOptionPane.showMessageDialog(null,"弹出对话框");
                JOptionPane.showConfirmDialog(null,"确认");
            }
        });

        c.add(jb);
        setTitle("创建带文字与图片的按钮");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
