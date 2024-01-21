package lambda.zemise_01;

/**
 * @author Zemise
 */ /*
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


        start(new myRun2() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });


        // 改写
        // 如果没有@FunctionalInterface注解，并将其中方法改为default，并且包含方法体。则错误
        start(() -> System.out.println("hello"));


    }


    public static void start(myRun2 run2) {
        new Thread(run2).start();
    }

    // 1. 只能有一个方法 ---》》 函数式接口
    // 2. 可将 @FunctionalInterface注解，并将其中方法改为默认default，并且包含方法体
    // 3. Object下面的方法
//    @FunctionalInterface
    public interface myRun2 extends Runnable {
        // public void run2();
        public default void run2() {
        }

        @Override
        String toString();

        @Override
        boolean equals(Object onj);
    }
}
