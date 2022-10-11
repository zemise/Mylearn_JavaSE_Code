package zemise_04;

import javax.swing.*;
import java.awt.*;

public class JComboBoxModelDemo extends JFrame {
    JComboBox<String> jc = new JComboBox<>(new MyComboBox());
    JLabel jl =new JLabel("请选择证件");

    public JComboBoxModelDemo() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(jl);
        c.add(jc);

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JComboBoxModelDemo();
    }
}

class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
    String selectedItem = null;
    String[] test = {"身份证","军人证","学生证","工作证"};

    //设置下拉列表框项目
    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(String)anItem;
    }


    //获取下拉列表框中的项目
    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    //返回下拉列表中项目的数目
    @Override
    public int getSize() {
        return test.length;
    }

    //根据索引返回值
    @Override
    public String getElementAt(int index) {
        return test[index];
    }
}
