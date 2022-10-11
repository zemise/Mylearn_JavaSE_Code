package zemise_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo extends JFrame {
    public JTextFieldDemo() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(2,1));

        JTextField jt = new JTextField("演示文字");
        JButton button = new JButton("清除");

        //为按钮添加事件
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //清空文本框
                jt.setText("");
                //焦点回到文本框
                jt.requestFocus();
            }
        });

        c.add(jt);
        c.add(button);

        setSize(300,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new JTextFieldDemo();
    }
}
