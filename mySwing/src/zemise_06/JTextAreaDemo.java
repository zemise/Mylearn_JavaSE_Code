package zemise_06;

import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo extends JFrame {
    public JTextAreaDemo() {
        setSize(300,100);
        setTitle("定义自动换行的文本域");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        JTextArea jt = new JTextArea("文本域", 6, 6);
        //可以自动换行
        jt.setLineWrap(true);
        cp.add(jt);


        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextAreaDemo();
    }
}
