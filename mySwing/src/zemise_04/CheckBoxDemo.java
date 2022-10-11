package zemise_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxDemo extends JFrame {
    public CheckBoxDemo() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        //新建2个面板
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        //将一个面板放在上方
        c.add(p1,BorderLayout.NORTH);
        //将另一个面板放在下方
        c.add(p2,BorderLayout.SOUTH);

        //新建一个文本域
        JTextArea ta = new JTextArea(6,10);
        //将文本域添加到JScrollPane
        JScrollPane jScrollPane= new JScrollPane(ta);
        p1.add(jScrollPane);

        //新建三个复选框，并添加到P2面板
        for(int i = 1; i<=3;i++){
            JCheckBox jcb = new JCheckBox("" + i);
            p2.add(jcb);
            int index = i;
            //为每个复选框添加监听事件
            jcb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ta.append("复选框" + index + "被选中\n");
                }
            });
        }

        setTitle("复选框案例");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
