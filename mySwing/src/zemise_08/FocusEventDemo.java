package zemise_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventDemo extends JFrame implements FocusListener {
    public FocusEventDemo() {

        Container cp = getContentPane();
        cp.setLayout(null);

        //创建一个文本框
        JTextField jt = new JTextField("请单击其他文本框", 10);
        //创建另外一个文本框
        JTextField jt2 = new JTextField("请单击我", 10);

        cp.add(jt);
        jt.setBounds(20,10,150,20);

        cp.add(jt2);
        jt2.setBounds(20,50,150,20);

        jt.addFocusListener(this);
//        jt2.addFocusListener(this);

        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        JOptionPane.showMessageDialog(null,"文本框失去焦点");
    }


    public static void main(String[] args) {
        new FocusEventDemo();
    }
}
