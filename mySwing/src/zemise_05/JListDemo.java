package zemise_05;

import javax.swing.*;
import java.awt.*;

public class JListDemo extends JFrame {
    public JListDemo() {
        Container cp = getContentPane();
        cp.setLayout(null);
        JList<String> jl = new JList<>(new MyListModel());

        JScrollPane jsp = new JScrollPane(jl);
        jsp.setBounds(10, 10, 100, 100);
        cp.add(jsp);

        setSize(300, 200);
        setTitle("列表框的使用");
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new JListDemo();
    }
}

class MyListModel extends AbstractListModel<String> {
    //设置列表框内容
    private String[] contents = {"列表1", "列表2", "列表3", "列表4", "列表5", "列表6"};

    //重写getSize()方法
    @Override
    public int getSize() {
        return contents.length;
    }

    //重写getElementAt()方法
    @Override
    public String getElementAt(int index) {
        if(index <contents.length) {
            return contents[index];
        }else{
            return null;
        }
    }
}
