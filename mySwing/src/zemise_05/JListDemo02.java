package zemise_05;

import javax.swing.*;
import java.awt.*;

public class JListDemo02 extends JFrame {
    public JListDemo02() {
        final String[] flavors = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};
        final DefaultListModel items = new DefaultListModel();
        final JList jl = new JList(items);
        for (int i = 0; i < 6; i++) {
            items.addElement(flavors[i]);
        }

        Container cp = getContentPane();
        cp.setLayout(null);

        JScrollPane jsp = new JScrollPane(jl);
        jsp.setBounds(10, 10, 100, 100);
        cp.add(jsp);

        setSize(300, 200);
        setTitle("列表框的使用");
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new JListDemo02();
    }
}
