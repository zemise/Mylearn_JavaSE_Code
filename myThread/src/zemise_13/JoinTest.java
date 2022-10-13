package zemise_13;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    //定义两个线程
    final private Thread threadA;
    final private Thread threadB;
    //定义两个进度条组件
    final JProgressBar bar1 = new JProgressBar();
    final JProgressBar bar2 = new JProgressBar();

    public JoinTest() {
        super("线程Join方法测试");
        //将进度条设置在窗体的最北面和最南面
        getContentPane().add(bar1, BorderLayout.NORTH);
        getContentPane().add(bar2, BorderLayout.SOUTH);
        //设置进度条显示数字
        bar1.setStringPainted(true);
        bar2.setStringPainted(true);

        //使用匿名内部类形式初始化Thread实例
        threadA = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {
                    //设置进度条当前值
                    bar1.setValue(++count);
                    try {
                        //使线程A休眠100毫秒
                        threadA.sleep(100);
                        //使线程B调用join()方法
                        threadB.join();
                    } catch (InterruptedException e) {
                        System.out.println("当前线程序被中断");
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {
                    //设置进度条的当前值
                    bar2.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //当count变量增长为100时
                    if (count == 100)
                        //跳出循环
                        break;
                }
            }
        });
        //启动线程B
        threadB.start();
//        threadA.interrupt();
    }

    //设置窗体各种属性的方法
    public static void init(JFrame jFrame, int width, int height) {
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(width, height);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        init(new JoinTest(), 100, 100);

    }
}
