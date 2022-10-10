package zemise_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyDialog extends JDialog {
    public MyDialog(MyFrame frame){
        //实例化一个Dialog类对象，指定对话框的父窗体、窗体标题和类型
        super(frame, "第一个JDialog窗体", true);
        //创建一个容器
        Container container = getContentPane();
        //在容器中添加标签
        container.add(new JLabel("这是一个对话窗"));
        //设置对话框窗体大小
        setBounds(120,120,100,100);
    }
}

public class MyFrame extends JFrame{
    public static void main(String[] args) {
        //实例化MyJFrame类对象
        new MyFrame();

    }

    public MyFrame(){
        JFrame fr = new JFrame("标题");
        //创建一个容器
        Container container = fr.getContentPane();

        fr.setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setVisible(true);

        //在窗体中设置标签
        JLabel jl = new JLabel("这是一个JFrame窗体");
        //将标签的文字置于标签中间位置
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        //定一个按钮
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,200,20);
        bl.setHorizontalAlignment(SwingConstants.CENTER);

        //为按钮添加鼠标单击时间
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //使MyJDialog窗体可见
                new MyDialog(MyFrame.this).setVisible(true);
            }
        });
        //将按钮添加到容器中
        container.add(bl);


    }
}
