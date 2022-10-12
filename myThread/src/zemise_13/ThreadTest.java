package zemise_13;

public class ThreadTest extends Thread {
    private int count = 10;

    @Override
    public void run() {
        while (true) {
            //打印count变量
            System.out.println(count + "");
            //使用count变量自减，当自减为0时，推出循环
            if (--count == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start();
    }
}
