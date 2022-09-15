package zemise_02;

/*
    测试类
 */
public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调用方法
//        Outer.Inner in = new Outer().new Inner();
//        in.show();

        Outer o = new Outer();
        o.method();
    }
}
