package zemise_07;

public class SellTicket implements Runnable {
    //1：定义一个类SeLLTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100；
    private int tickets = 100;

    //2：在SellTicket类中重写run()方法实现卖票，代码步骤如下
    //  A：判断票数大于0，就卖票，并告知是哪个窗口卖的
    //  B：卖了票之后，总票数要减1
    //  C：票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
    @Override
    public void run() {
/*        //相同的票出现来多次
        while(true) {
            //ticket = 100;
            //t1,t2,t3
            //假设t1线程抢到来CPU的执行权
            if (tickets > 0) {
                //通过sleep()方法来模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息100毫秒
                    //t2线程抢到了CPU的执行权，t2线程就开始执行，执行到这里的时候，t2线程休息100毫秒
                    //t3线程抢到了CPU的执行权，t3线程就开始执行，执行到这里的时候，t3线程休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按照顺序醒过来
                //t1抢到了CPU的执行权，在控制台输出，窗口1正在出售第100张票
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                //t2抢到了CPU的执行权，在控制台输出，窗口2正在出售第100张票
                //t3抢到了CPU的执行权，在控制台输出，窗口3正在出售第100张票

                //卖票后总数减1
                tickets--;
                //如果这三个线程还是按顺序来，这里就执行来3次，最终票就变成了97
            }
        }*/

        //出现了负数的票
        while(true) {
            //ticket = 100;
            //t1,t2,t3
            //假设t1线程抢到来CPU的执行权
            if (tickets > 0) {
                //通过sleep()方法来模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息100毫秒
                    //t2线程抢到了CPU的执行权，t2线程就开始执行，执行到这里的时候，t2线程休息100毫秒
                    //t3线程抢到了CPU的执行权，t3线程就开始执行，执行到这里的时候，t3线程休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按照顺序醒过来
                //t1抢到了CPU的执行权，在控制台输出，窗口1正在出售第1张票
                //假设t1继续拥有CPU的执行权，就会执行tickets--;操作tickets = 0;
                //t2抢到了CPU的执行权，在控制台输出，窗口1正在出售第0张票
                //假设t2继续拥有CPU的执行权，就会执行tickets--;操作tickets = -1;
                //t3抢到了CPU的执行权，在控制台输出，窗口1正在出售第-1张票
                //假设t3继续拥有CPU的执行权，就会执行tickets--;操作tickets = -2;
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;

            }
        }

    }
}
