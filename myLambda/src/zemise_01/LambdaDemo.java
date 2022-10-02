package zemise_01;
/*
    需求：启动一个线程，在控制台输出一句话，多线程程序启动
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //方式一 实现类的方式实现需求
//        Thread t1 = new Thread(new myRunnable());
//        t1.start();

        //方式二 匿名内部类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello,多线程程序启动了");
//            }
//        }).start();
//    }

        //方式三 Lambda表达式改进
        new Thread(() -> {
            System.out.println("hello,多线程程序启动了");
        }).start();
    }
}
