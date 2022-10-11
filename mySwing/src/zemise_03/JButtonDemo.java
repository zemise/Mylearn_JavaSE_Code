package zemise_03;

import zemise_01.MyImageIcon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo extends JFrame {
    public JButtonDemo() {
        URL url = MyImageIcon.class.getResource("icons8-done.png");
        ImageIcon Icon = new ImageIcon(url);
        //设置网络布局管理器
        setLayout(new GridLayout(3,2,5,5));
        //创建容器
        Container c = getContentPane();


    }
}
