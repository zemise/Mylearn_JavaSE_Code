package zemise_11;

import javax.swing.*;
import java.awt.*;

public class TableDemo extends JFrame {
    public TableDemo() {
        setTitle("创建可以滚动的表格");
        setBounds(100,100,240,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //定义表格列名数组
        String[] columnNames = {"A" ,"B"};
        String[][] tableValues = {{"A1","B1"},{"A2","B2"},
                {"A3","B3"},{"A4","B4"},{"A5","B5"}};

        //创建指定列名和数据的表格
        JTable table = new JTable(tableValues, columnNames);
        //创建显示表格的滚动面板
        JScrollPane jScrollPane = new JScrollPane(table);
        //将滚动面板添加到边界布局的中间
        getContentPane().add(jScrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TableDemo();
    }
}
