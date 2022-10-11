package zemise_02;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo extends JFrame {
    public JScrollPaneDemo() {
        //创建容器
        Container c = getContentPane();
        //创建文本区域组件
        JTextArea ta = new JTextArea(20, 50);
        //创建JScrollPane面板对象
        //先将文字编译器放在滚动面板中
        JScrollPane sp = new JScrollPane(ta);
        //将该面板加到该容器内
        c.add(sp);
        setTitle("带滚动文字编辑器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneDemo();
    }
}
