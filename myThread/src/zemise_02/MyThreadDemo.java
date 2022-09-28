package zemise_02;

/*
    Thread类中获取和设置线程名称的方法
        void setName(String nome):将此线程的名称更改为等于参数 name
        String getName():返回此线程的名称
 */
public class MyThreadDemo {
    public static void main(String[] args) {
/*
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.setName("高铁");
        my2.setName("飞机");
*/
        //Thread(Stream name)
//        MyThread my1 = new MyThread("高铁");
//        MyThread my2 = new MyThread("飞机");
//
//        my1.start();
//        my2.start();

        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
