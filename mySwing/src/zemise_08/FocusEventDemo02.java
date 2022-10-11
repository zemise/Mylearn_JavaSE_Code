package zemise_08;

import javax.swing.*;
import java.awt.*;
/*
    匿名内部类实现文本框焦点监听
 */
public class FocusEventDemo02 extends JFrame {
    public FocusEventDemo02() {

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



        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FocusEventDemo();
    }
}
