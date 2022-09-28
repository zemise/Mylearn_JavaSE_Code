package zemise_01;
/*
    方式1:继承Thread类
        1:定义一个类MyThread继承 Thread类
        2:在My Thread类中重写run()方法
        3:创建MyTread类的对象
        4:启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

//        my1.run();
//        my2.run();

        my1.start();
        my2.start();

    }
}
