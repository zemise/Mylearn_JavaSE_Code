package zemise_13;

public class ThreadSafeDemo implements Runnable{
    int num =1000;
    @Override
    public void run() {
        while(true){
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "tickets" + --num);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeDemo t = new ThreadSafeDemo();
        Thread threadA = new Thread(t);
        Thread threadB = new Thread(t);
        Thread threadC = new Thread(t);
        Thread threadD = new Thread(t);
        threadA.setName("A");
        threadB.setName("B");
        threadC.setName("C");
        threadD.setName("D");

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
