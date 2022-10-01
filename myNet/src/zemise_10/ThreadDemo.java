package zemise_10;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        ServerDemo sd = new ServerDemo();
        Thread t1 = new Thread((Runnable) sd);
        Thread t2 = new Thread((Runnable) sd);

        t1.start();
        t2.start();
    }
}
