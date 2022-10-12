package zemise_13;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    //声明JLabel对象
    private JLabel jl = new JLabel();
    //声明线程对象
    private static Thread t;
    //声明计数变量值
    private int count = 0;
    //声明容器
    private Container container = getContentPane();


    public SwingAndThread() {
        //绝对定位窗体大小与位置
        setBounds(300,200,250,100);
        //使窗体不使用任何布局管理器
        setLayout(null);
        //获取图片的URL
        URL url = SwingAndThread.class.getResource("icons8-search.png");
        //实例化一个Icon
        ImageIcon icon = new ImageIcon(url);
        //将图片放置在标签中
        jl.setIcon(icon);
        //设置图片在标签的最左方
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        //使标签透明
        jl.setOpaque(true);

        //定义匿名内部类，该类实现Runnable接口
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置循环条件
                while (count <=200){
                    //将标签的横坐标用变量表示
                    jl.setBounds(count,10,200,50);
                    try {
                        //使线程休眠1000毫秒
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    //每次使横坐标增加4
                    count += 4;
                    //当图标达到标签的最右边时，使其回到标签最左边
                    if(count >= 200){
                        count =10;
                    }
                }
            }
        });

        //启动线程
        t.start();
        //将标签添加到容器中
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        //实例化一个SwingAndThread对象
        new SwingAndThread();
    }
}
