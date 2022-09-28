package zemise_03;
/*
    Thread类中设置和获取线程优先级的方法
        public final void setPriority(int newPriority)：更改此线程的优先級
        public final int getPriority()：返回此线程的优先级
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {

        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tpw = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp1.setName("飞机");
        tp1.setName("汽车");


    }

}
