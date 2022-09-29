package zemise_09;

/*
    卖票案例
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        //A：创建SellTicket类的对象
        SellTicket st = new SellTicket();

        //B：创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //C：启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
