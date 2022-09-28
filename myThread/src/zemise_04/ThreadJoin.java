package zemise_04;

public class ThreadJoin extends Thread {
    //重写run()方法，用来封装被线程执行的代码
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(getName() + ": " + i);
        }
    }
}
