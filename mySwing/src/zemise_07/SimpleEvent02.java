package zemise_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    需求，不使用内部类实现事件监听
 */
public class SimpleEvent02 extends JFrame implements ActionListener{
    private JButton jb = new JButton("我是按钮，单击我");
    public SimpleEvent02() {
        setLayout(null);

        Container cp = getContentPane();
        cp.add(jb);

        jb.setBounds(10,10,100,30);
        //添加本类对象
        jb.addActionListener(this);

        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //重写actionPerformed()方法
    @Override
    public void actionPerformed(ActionEvent e) {
        jb.setText("我被单击了2.0");
    }

    public static void main(String[] args) {
        new SimpleEvent();
    }


}