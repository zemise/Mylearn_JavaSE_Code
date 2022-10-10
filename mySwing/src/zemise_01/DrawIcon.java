package zemise_01;

import javax.swing.*;
import java.awt.*;

//声明Icon接口
public class DrawIcon implements Icon {
    //声明图标的宽
    private int width;
    private int height;

    //定义构造方法
    public DrawIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //实现paintIcon()方法
    @Override
    public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
        //绘制一个图形
        arg1.fillOval(x,y,width,height);
    }

    //实现getIconWidth()方法
    @Override
    public int getIconWidth() {
        return this.width;
    }


    //实现getIconHeight()方法
    @Override
    public int getIconHeight() {
        return this.height;
    }

    public static void main(String[] args) {
        //绘制一个圆形
        DrawIcon icon = new DrawIcon(15, 15);
        //创建一个标签，并设置标签上的文字在标签正中间
        JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
        //创建一个JFrame窗口
        JFrame jf = new JFrame();
        Container contentPane = jf.getContentPane();
        contentPane.add(j);

        jf.setSize(300,200);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
