package zemise_05;

import zemise_02.MyThread;

/*
    方式2:实现Runnable接口
        1:定义一个类MyRunnable实现Runnable接口
        2:在MyRunnable类中重写run()方法
        3:创建MyRunnable类的对象
        4:创建Thread类的对象,把MyRunnable对象作为构造方法的参数
        5:启动线程
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //3:创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        //4:创建Thread类的对象,把MyRunnable对象作为构造方法的参数
        //Thread (Runnable target)
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);

        //Thread (Runnable target, String name)
        Thread t1 = new Thread(mr,"李逍遥");
        Thread t2 = new Thread(mr,"赵灵儿");

        //5:启动线程
        t1.start();
        t2.start();
    }
}
