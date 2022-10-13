package zemise_13;

import javax.swing.*;
import java.awt.*;

public class PriorityDemo extends JFrame {
    private final Thread threadA;
    private final Thread threadB;
    private final Thread threadC;
    private final Thread threadD;

    JProgressBar bar1 = new JProgressBar();
    JProgressBar bar2 = new JProgressBar();
    JProgressBar bar3 = new JProgressBar();
    JProgressBar bar4 = new JProgressBar();

    public PriorityDemo() {
        super("线程优先级");
        setLayout(new FlowLayout());
        getContentPane().add(bar1);
        getContentPane().add(bar2);
        getContentPane().add(bar3);
        getContentPane().add(bar4);
        bar1.setStringPainted(true);
        bar2.setStringPainted(true);
        bar3.setStringPainted(true);
        bar4.setStringPainted(true);

        //实例化4个线程
        threadA = new Thread(new MyThread(bar1));
        threadB = new Thread(new MyThread(bar2));
        threadC = new Thread(new MyThread(bar3));
        threadD = new Thread(new MyThread(bar4));

        setPriority("ThreadA",8,threadA);
        setPriority("ThreadB",8,threadB);
        setPriority("ThreadC",4,threadC);
        setPriority("ThreadD",3,threadD);
    }

    //定义设置线程的名称、优先级的方法
    public static void setPriority(String threadName,int priority,Thread t){
        t.setPriority(priority);
        t.setName(threadName);
        t.start();
    }

    //设置窗体各种属性的方法
    public static void init(JFrame jFrame, int width, int height) {
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(width, height);
        jFrame.setVisible(true);
    }

    //定义一个实现Runnable接口的类
    private class MyThread implements Runnable{
        private final JProgressBar bar;
        int count =0;
        private MyThread(JProgressBar bar) {
            this.bar = bar;
        }

        @Override
        public void run() {
            while(true){
                if(count ==100)
                    break;
                //设置滚动条的值每次增加10
                bar.setValue(count += 10);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("当前线程被中断");
                }
            }
        }
    }

    public static void main(String[] args) {
        init(new PriorityDemo(),100,200);
    }
}
